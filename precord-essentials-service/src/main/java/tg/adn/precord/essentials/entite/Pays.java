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
@Table(name = "PAYS")
@SequenceGenerator(name = "PAYS_GEN", sequenceName = "PAYS_GEN")
public class Pays extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PAYS_GEN")
    private Integer id;
    @Column(name = "CODE_PAYS", unique = true, nullable = false)
    private String code;
    @Column(name = "NOM_PAYS", unique = true, nullable = false)
    private String nom;
    @Column(name = "NATIONALITE_PAYS", unique = true, nullable = false)
    private String nationalite;

    public Pays() {
    }

    public Pays(String code, String nom, String nationalite) {
        this.code = code;
        this.nom = nom;
        this.nationalite = nationalite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    @Override
    public String getMouchard() {
        return "Pays -> id ("
                + getId() + "), nom (" + ((getNom() != null) ? getNom() : ")")
                + "), nationalite (" + ((getNationalite() != null) ? getNationalite() : ")")
                + "), code (" + ((getCode() != null) ? getCode() : ")");
    }

}
