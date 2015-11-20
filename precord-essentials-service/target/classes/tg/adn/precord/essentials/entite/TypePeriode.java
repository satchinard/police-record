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
@Table(name = "TYPE_PERIODE")
@SequenceGenerator(name = "TYPE_PERIODE_GEN", sequenceName = "TYPE_PERIODE_GEN")
public class TypePeriode extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "TYPE_PERIODE_GEN")
    private Integer id;
    @Column(name = "NOM_TYPE_PERIODE", nullable = false, unique = true)
    private String nom;
    @Column(name = "NB_JOURS", nullable = false)
    private Double nombre;

    public TypePeriode() {
    }

    public TypePeriode(String nom, Double nombre) {
        this.nom = nom;
        this.nombre = nombre;
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

    public Double getNombre() {
        return nombre;
    }

    public void setNombre(Double nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getMouchard() {
        return "TypePeriode -> id ("
                + getId() + "), nom (" + ((getNom() != null) ? getNom() : ")")
                + ", nombre (" + ((getNombre() != null) ? getNombre() : ")");
    }

}
