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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import tg.adn.precord.data.entite.EntiteModel;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "PROFESSION")
@SequenceGenerator(name = "PROFESSION_GEN", sequenceName = "PROFESSION_GEN")
public class Profession extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PROFESSION_GEN")
    private Integer id;
    @Column(name = "NOM_PROFESSION", unique = true, nullable = false)
    private String nom;
    @ManyToOne
    @JoinColumn(name = "ID_SECTEUR_ACTIVITE")
    private SecteurActivite secteurActivite;

    public Profession() {
    }

    public Profession(String nom, SecteurActivite secteurActivite) {
        this.nom = nom;
        this.secteurActivite = secteurActivite;
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

    public SecteurActivite getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(SecteurActivite secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    @Override
    public String getMouchard() {
        return "Profession -> id ("
                + getId() + "), nom (" + ((getNom() != null) ? getNom() : ")"
                        + ", secteur (" + ((getSecteurActivite() != null
                        && getSecteurActivite().getNom() != null)
                                ? getSecteurActivite().getNom() : "") + ")");
    }

}
