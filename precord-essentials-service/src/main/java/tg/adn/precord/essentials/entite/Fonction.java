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
@Table(name = "FONCTION")
@SequenceGenerator(name = "FONCTION_GEN", sequenceName = "FONCTION_GEN")
public class Fonction extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "FONCTION_GEN")
    private Integer id;
    @Column(name = "NOM_FONCTION", unique = true, nullable = false)
    private String nom;

    public Fonction() {
    }

    public Fonction(String nom) {
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
        return "Fonction -> id ("
                + getId() + "), nom (" + ((getNom() != null) ? getNom() : "") + ")";
    }

}
