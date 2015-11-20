/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.data.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "PARAMETRES_CONFIG")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ParametreConfig extends EntiteModel {

    @Id
    @Column(name = "NOM")
    private String nom;

    public ParametreConfig() {
    }

    public ParametreConfig(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String getMouchard() {
        return "ParametreConfig -> nom (" + ((getNom() != null) ? getNom() : "") + ")";
    }

}
