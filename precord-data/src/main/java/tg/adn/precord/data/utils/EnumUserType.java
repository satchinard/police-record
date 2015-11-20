/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.data.utils;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.usertype.ParameterizedType;
import org.hibernate.usertype.UserType;
import org.springframework.util.ObjectUtils;

/**
 *
 * @author cagecfi
 */
public class EnumUserType implements UserType, ParameterizedType {

    private Method reCreateEnumMthd;
    private Method reCreateStringMthd;
    private Class enumClass;

    @Override
    public int[] sqlTypes() {
        return new int[]{Types.CHAR};
    }

    @Override
    public Class returnedClass() {
        return enumClass;
    }

    @Override
    public boolean equals(Object o, Object o1) throws HibernateException {
        return ObjectUtils.nullSafeEquals(o1, o1);
    }

    @Override
    public int hashCode(Object o) throws HibernateException {
        return o.hashCode();
    }

    @Override
    public Object nullSafeGet(ResultSet rs, String[] strings, Object o) throws HibernateException, SQLException {
        String value = rs.getString(strings[0]);
        Object returnVal = null;
        if (value == null) {
            return null;
        } else {
            try {
                returnVal = reCreateEnumMthd.invoke(enumClass, new Object[]{value});
            } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
            }
        }
        return returnVal;
    }

    @Override
    public void nullSafeSet(PreparedStatement ps, Object o, int i) throws HibernateException, SQLException {
        String prepStmtVal = null;
        if (o == null) {
            ps.setObject(i, null);
        } else {
            try {
                prepStmtVal = (String) reCreateStringMthd.invoke(o, new Object[]{});
                ps.setString(i, prepStmtVal);
            } catch (IllegalArgumentException | IllegalAccessException | InvocationTargetException e) {
            }
        }
    }

    @Override
    public Object deepCopy(Object o) throws HibernateException {
        if (o == null) {
            return null;
        } else {
            try {
                Object enumVal = reCreateEnumMthd.invoke(o, (Object) null);
                return reCreateEnumMthd.invoke(reCreateStringMthd.invoke(enumVal, (Object) null), (Object) null);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                Logger.getLogger(EnumUserType.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

    @Override
    public boolean isMutable() {
        return false;
    }

    @Override
    public Serializable disassemble(Object o) throws HibernateException {
        Object deepCopy = deepCopy(o);
        if (!(deepCopy instanceof Serializable)) {
            return (Serializable) deepCopy;
        }
        return null;
    }

    @Override
    public Object assemble(Serializable srlzbl, Object o) throws HibernateException {
        return deepCopy(o);
    }

    @Override
    public Object replace(Object o, Object o1, Object o2) throws HibernateException {
        return deepCopy(o);
    }

    @Override
    public void setParameterValues(Properties prprts) {
        if (prprts != null) {
            String enumMthd = prprts.getProperty("reCreateEnumMthd");
            String strMthd = prprts.getProperty("reCreateStringMthd");
            String className = prprts.getProperty("enumClass");
            Class<?> returnType = null;
            try {
                enumClass = Class.forName(className);
                returnType = reCreateStringMthd.getReturnType();
                reCreateStringMthd = enumClass.getMethod(strMthd, new Class[]{});
                reCreateEnumMthd = enumClass.getMethod(enumMthd, returnType);
            } catch (ClassNotFoundException | SecurityException | NoSuchMethodException e) {
            }
        }
    }

}
