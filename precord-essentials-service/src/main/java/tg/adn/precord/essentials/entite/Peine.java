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
import javax.persistence.UniqueConstraint;
import tg.adn.precord.data.entite.EntiteModel;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "PEINE", uniqueConstraints = {
    @UniqueConstraint(name = "UQ_PEINE", columnNames = {"NOM_PEINE", "ID_TYPE_PEINE", "ID_DUREE"})})
@SequenceGenerator(name = "PEINE_GEN", sequenceName = "PEINE_GEN")
public class Peine extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PEINE_GEN")
    private Integer id;
    @Column(name = "NOM_PEINE")
    private String nom;
    @ManyToOne
    @JoinColumn(name = "ID_TYPE_PEINE")
    private TypePeine typePeine;
    @Column(name = "NB_DUREE", nullable = true)
    private Double nombre;
    @ManyToOne
    @JoinColumn(name = "ID_DUREE", nullable = true)
    private Duree duree;

    public Peine() {
    }

    public Peine(String nom, TypePeine typePeine, Double nombre, Duree duree) {
        this.nom = nom;
        this.typePeine = typePeine;
        this.nombre = nombre;
        this.duree = duree;
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

    public TypePeine getTypePeine() {
        return typePeine;
    }

    public void setTypePeine(TypePeine typePeine) {
        this.typePeine = typePeine;
    }

    public Double getNombre() {
        return nombre;
    }

    public void setNombre(Double nombre) {
        this.nombre = nombre;
    }

    public Duree getDuree() {
        return duree;
    }

    public void setDuree(Duree duree) {
        this.duree = duree;
    }

    @Override
    public String getMouchard() {
        return "Peine -> id (" + getId()
                + "), nombre (" + ((getNombre() != null) ? getNombre() : ")")
                + "), typePeine (" + ((getTypePeine() != null
                && getTypePeine().getNom() != null) ? getTypePeine().getNom() : ")")
                + "), duree (" + ((getDuree() != null) ? getDuree().getNom() : ")");
    }

}
