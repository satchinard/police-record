/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.data.dao.impl;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import tg.adn.precord.data.dao.IDAO;

/**
 *
 * @author cagecfi
 */
public abstract class DAO<T, PK extends Serializable> implements IDAO<T, PK> {

    @PersistenceContext(unitName = "precord-Unit",
            //            properties = {
            //                @PersistenceProperty(name = "hibernate.hbm2ddl.auto", value = "update"),
            //                @PersistenceProperty(name = "", value = "")},
            type = PersistenceContextType.TRANSACTION)
    protected Class<T> objectClass;
    protected EntityManager em;
    protected CriteriaBuilder cb;

    public DAO(Class<T> objectClass) {
        this.objectClass = objectClass;
    }

    @Override
    public Class<T> getOjectClass() {
        return objectClass;
    }

    @Override
    public EntityManager getEm() {
        return em;
    }

    public CriteriaBuilder getCb() {
        if (cb != null) {
            return cb;
        }
        cb = em.getCriteriaBuilder();
        return cb;
    }

    @Override
    public T ajouter(T t) {
        if (t != null) {
            em.persist(t);
            return t;
        }
        return null;
    }

    @Override
    public T modifier(T t) {
        if (t != null) {
            return em.merge(t);
        }
        return null;
    }

    @Override
    public void supprimer() {
        String jpql = "DELETE FROM " + this.objectClass.getSimpleName();
        Query q = em.createQuery(jpql);
        q.executeUpdate();
    }

    @Override
    public boolean supprimer(T t) {
        if (t != null) {
            em.remove(t);
            return true;
        }
        return false;
    }

    @Override
    public boolean supprimer(PK k) {
        T t = em.find(objectClass, k);
        if (t == null) {
            return false;
        } else {
            em.remove(t);
        }
        return true;
    }

    @Override
    public T selectionner(PK k) {
        return em.find(objectClass, k);
    }

    @Override
    public List<T> lister() {
        String jpql = "SELECT t FROM " + this.objectClass.getSimpleName();
        Query q = em.createQuery(jpql, this.objectClass);
        return (List<T>) q.getResultList();
    }

    @Override
    public Iterator<Object[]> lister(String requete) {
        Query q = em.createQuery(requete);
        return (Iterator< Object[]>) q.getResultList().iterator();
    }

    @Override
    public List<T> lister(String tri, boolean asc) {
        String order = ((asc) ? "ASC" : "DESC");
        String jpql = "SELECT t FROM " + this.objectClass.getSimpleName()
                + " t ORDEB BY " + tri + " " + order;
        Query q = em.createQuery(jpql, this.objectClass);
        return (List<T>) q.getResultList();
    }

    @Override
    public List<T> lister(int debut, int nombre, String tri, boolean asc) {
        String order = ((asc) ? "ASC" : "DESC");
        String jpql = "SELECT t FROM "
                + this.objectClass.getSimpleName() + " t "
                + " ORDEB BY " + tri + " " + order;
        Query q = em.createQuery(jpql, this.objectClass);
        return (List<T>) q.setFirstResult(debut)
                .setMaxResults(nombre).getResultList();
    }

    @Override
    public Long nombreEnreg() {
        String jpql = "SELECT count(distinct t) FROM "
                + this.objectClass.getSimpleName() + " t ";
        Query q = em.createQuery(jpql, Long.class);
        return (Long) q.getSingleResult();
    }

    @Override
    public boolean exist(PK k) {
        if (k != null) {
            if (em.find(objectClass, k) != null) {
                return true;
            }
        }
        return false;
    }

    public Query createQuery(String sql) {
        return getEm().createNamedQuery(sql);
    }

}
