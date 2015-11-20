/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.data.service;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author cagecfi
 * @param <T>
 * @param <PK>
 */
public interface IService<T, PK extends Serializable> extends Serializable {

    public T ajouter(T t);

    public List<T> ajouter(Collection<T> ts);

    public T modifier(T t);

    public List<T> modifier(Collection<T> ts);

    public void supprimer();

    public boolean supprimer(PK k);

    public boolean supprimer(T t);

    public void supprimer(PK[] pks);

    /**
     * Supprime les instances dans la collections.
     *
     * @param ts
     */
    public void supprimer(Collection<T> ts);

    public T selectionner(PK k);

    public List<T> lister();

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

    public Query creerQuery(String requete);

}
