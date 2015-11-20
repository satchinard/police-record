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
@Table(name = "TYPE_PIECE_IDENTITE")
@SequenceGenerator(name = "TYPE_PIECE_IDENTITE_GEN", sequenceName = "TYPE_PIECE_IDENTITE_GEN")
public class TypePieceIdentite extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "TYPE_PIECE_IDENTITE_GEN")
    private Integer id;
    @Column(name = "NOM_TYPE_PIECE_IDENTITE")
    private String nom;

    public TypePieceIdentite() {
    }

    public TypePieceIdentite(String nom) {
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
        return "TypePieceIdentite -> id ("
                + getId() + "), nom (" + ((getNom() != null) ? getNom() : ")");
    }

}
