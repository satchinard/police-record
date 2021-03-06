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
import javax.persistence.UniqueConstraint;
import tg.adn.precord.data.entite.EntiteModel;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "TYPE_PEINE", uniqueConstraints = {
    @UniqueConstraint(name = "UQ_TYPE_PEINE", columnNames = "NOM_TYPE_PEINE")})
@SequenceGenerator(name = "TYPE_PEINE_GEN", sequenceName = "TYPE_PEINE_GEN")
public class TypePeine extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "TYPE_PEINE_GEN")
    private Integer id;
    @Column(name = "NOM_TYPE_PEINE", nullable = false)
    private String nom;

    public TypePeine() {
    }

    public TypePeine(String nom) {
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
        return "TypePeine -> id ("
                + getId() + "), nom ("
                + ((getNom() != null) ? getNom() : ")");
    }

}
