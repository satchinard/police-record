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
@Table(name = "DUREE", uniqueConstraints = {
    @UniqueConstraint(name = "UQ_DUREE", columnNames = {"NOM_DUREE", "ID_TYPE_PERIODE"})})
@SequenceGenerator(name = "DUREE_GEN", sequenceName = "DUREE_GEN")
public class Duree extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "DUREE_GEN")
    private Integer id;
    @Column(name = "NOM_DUREE", nullable = false, unique = true)
    private String nom;
    @ManyToOne
    @JoinColumn(name = "ID_TYPE_PERIODE", nullable = false)
    private TypePeriode typePeriode;
    @Column(name = "NB_TYPE_PERIODE", nullable = false)
    private Integer nombre;

    public Duree() {
    }

    public Duree(String nom, TypePeriode typePeriode, Integer nombre) {
        this.nom = nom;
        this.typePeriode = typePeriode;
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

    public TypePeriode getTypePeriode() {
        return typePeriode;
    }

    public void setTypePeriode(TypePeriode typePeriode) {
        this.typePeriode = typePeriode;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getMouchard() {
        return "Duree -> id ("
                + getId() + "), typePeriode ("
                + ((getTypePeriode() != null) ? getTypePeriode() : ")")
                + "), nombre (" + ((getNombre() != null) ? getNombre() : ")");
    }

}
