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
@Table(name = "SANCTION", uniqueConstraints = {
    @UniqueConstraint(name = "UQ_SANCTION", columnNames = {"NOM_SANCTION", "ID_TYPE_SANCTION"})})
@SequenceGenerator(name = "SANCTION_GEN", sequenceName = "SANCTION_GEN")
public class Sanction extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "SANCTION_GEN")
    private Integer id;
    @Column(name = "NOM_SANCTION")
    private String nom;
    @ManyToOne
    @JoinColumn(name = "ID_TYPE_SANCTION")
    private TypeSanction typeSanction;

    public Sanction() {
    }

    public Sanction(String nom, TypeSanction typeSanction) {
        this.nom = nom;
        this.typeSanction = typeSanction;
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

    public TypeSanction getTypeSanction() {
        return typeSanction;
    }

    public void setTypeSanction(TypeSanction typeSanction) {
        this.typeSanction = typeSanction;
    }

    @Override
    public String getMouchard() {
        return "Sanction -> id ("
                + getId() + "), nom (" + ((getNom() != null) ? getNom() : ")"
                        + ", typeSanction (" + ((getTypeSanction() != null
                        && getTypeSanction().getNom() != null)
                                ? getTypeSanction().getNom() : "") + ")");
    }

}
