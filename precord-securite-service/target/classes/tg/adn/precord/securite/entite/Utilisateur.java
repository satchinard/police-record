/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.securite.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import tg.adn.precord.data.entite.EntiteModel;

/**
 * Un utilisateur du logiciel.
 *
 * @author cagecfi
 */
@Entity
@Table(name = "UTILISATEURS",
        uniqueConstraints = {
            @UniqueConstraint(name = "UQ_LOGIN", columnNames = {"UTILISATEUR_LOGIN", "UTILISATEUR_PWD"})})
public class Utilisateur extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "UTILISATEUR_GEN")
    private Integer id;
    @Column(name = "UTILISATEUR_NOM", nullable = false, unique = true)
    private String nom;
    @Column(name = "UTILISATEUR_PRENOM")
    private String prenom;
    @Column(name = "UTILISATEUR_LOGIN", nullable = false)
    private String login;
    @Column(name = "UTILISATEUR_PWD", nullable = false)
    private String password;
    @Column(name = "UTILISATEUR_EMAIL")
    private String email;
    @Column(name = "UTILISATEUR_ACTIF")
    private Boolean actif;
    @Column(name = "UTILISATEUR_MULTIPLE")
    private Boolean multipleLogins;

    @Override
    public String getMouchard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
