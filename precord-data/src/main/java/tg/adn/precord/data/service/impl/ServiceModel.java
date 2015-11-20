/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.data.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;
import org.springframework.transaction.annotation.Transactional;
import tg.adn.precord.data.dao.IDAO;
import tg.adn.precord.data.service.IService;

/**
 *
 * @author cagecfi
 * @param <T>
 * @param <PK>
 */
public abstract class ServiceModel<T, PK extends Serializable> implements IService<T, PK> {

    public abstract IDAO<T, PK> getDao();

    @Override
    @Transactional
    public synchronized T ajouter(T t) {
        try {
            return getDao().ajouter(t);
        } catch (EntityExistsException eee) {

        } catch (IllegalStateException ise) {

        } catch (IllegalArgumentException iae) {

        } catch (TransactionRequiredException tre) {

        }
        return null;
    }

    @Override
    @Transactional
    public List<T> ajouter(Collection<T> ts) {
        List<T> tS = new LinkedList<>();
        for (T t : ts) {
            tS.add(getDao().ajouter(t));
        }
        return tS;
    }

    @Override
    @Transactional
    public synchronized T modifier(T t) {
        try {
            return getDao().modifier(t);
        } catch (EntityExistsException eee) {

        } catch (IllegalArgumentException iae) {

        } catch (TransactionRequiredException tre) {

        }
        return null;
    }

    @Override
    public List<T> modifier(Collection<T> ts) {
        List<T> tS = new LinkedList<>();
        for (T t : ts) {
            tS.add(modifier(t));
        }
        return tS;
    }

    @Override
    @Transactional
    public synchronized void supprimer() {
        try {
            getDao().supprimer();
        } catch (IllegalStateException ise) {

        } catch (IllegalArgumentException iae) {

        } catch (TransactionRequiredException tre) {

        }
    }

    @Override
    @Transactional
    public synchronized boolean supprimer(T t) {
        return getDao().supprimer(t);
    }

    @Override
    @Transactional
    public synchronized boolean supprimer(PK k) {
        return getDao().supprimer(k);
    }

    @Override
    public void supprimer(PK[] pks) {
        for (PK pk : pks) {
            getDao().supprimer(pk);
        }
    }

    @Override
    public void supprimer(Collection<T> ts) {
        for (T t : ts) {
            getDao().supprimer(t);
        }
    }

    @Override
    public T selectionner(PK k) {
        try {
            return getDao().selectionner(k);
        } catch (IllegalStateException ise) {

        } catch (IllegalArgumentException iae) {

        }
        return null;
    }

    @Override
    public List<T> lister() {
        return getDao().lister();
    }

    @Override
    public List<T> lister(String tri, boolean asc) {
        return getDao().lister(tri, asc);
    }

    @Override
    public List<T> lister(int debut, int nombre, String tri, boolean asc) {
        return getDao().lister(debut, nombre, tri, asc);
    }

    @Override
    public Long nombreEnreg() {
        return getDao().nombreEnreg();
    }

    @Override
    public boolean exist(PK k) {
        try {
            return getDao().exist(k);
        } catch (IllegalStateException ise) {

        } catch (IllegalArgumentException iae) {

        }
        return false;
    }

    @Override
    public Query creerQuery(String requete) {
        try {
            return (Query) getDao().getEm().createQuery(requete);
        } catch (IllegalStateException ise) {

        } catch (IllegalArgumentException iae) {

        }
        return null;
    }

}
