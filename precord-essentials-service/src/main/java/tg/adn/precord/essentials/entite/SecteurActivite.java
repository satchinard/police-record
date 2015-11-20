/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import tg.adn.precord.data.entite.EntiteModel;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "SECTEUR_ACTIVITE")
@SequenceGenerator(name = "SECTEUR_ACTIVITE_GEN", sequenceName = "SECTEUR_ACTIVITE_GEN")
public class SecteurActivite extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SECTEUR_ACTIVITE_GEN")
    private Integer id;
    @Column(name = "NOM_SECTEUR_ACTIVITE", unique = true, nullable = false)
    private String nom;

    public SecteurActivite() {
    }

    public SecteurActivite(String nom) {
        this.nom = nom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getMouchard() {
        return "SecteurActivite -> id ("
                + getId() + "), nom ("
                + ((getNom() != null) ? getNom() : ")");
    }

}
