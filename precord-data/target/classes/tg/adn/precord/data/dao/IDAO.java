/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.data.dao;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author cagecfi
 * @param <T>
 * @param <PK>
 */
public interface IDAO<T, PK extends Serializable> {

    Class<T> getOjectClass();

    EntityManager getEm();

    public T ajouter(T t);

    public T modifier(T t);

    public void supprimer();

    public boolean supprimer(T t);

    public boolean supprimer(PK k);

    public T selectionner(PK k);

    public List<T> lister();

    public Iterator<Object[]> lister(String requete);

    public List<T> lister(String tri, boolean asc);

    public List<T> lister(int debut, int nombre, String tri, boolean asc);

//    public List<T> lister(IFiltreForm q);
//    public List<T> lister(int debut, int nombre, IFiltreForm q);
    public Long nombreEnreg();

//    public Long nombreEnreg(IFiltreForm q);
//
    /**
     * Vérifie si l'instance d'identifiant k existe.
     *
     * @param k
     * @return Retourne vrai si l'élément est retrouvé, faux sinon
     */
    public boolean exist(PK k);

    public Query createQuery(String sql);

}
