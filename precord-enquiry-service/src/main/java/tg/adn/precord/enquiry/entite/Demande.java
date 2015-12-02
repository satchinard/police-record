/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.enquiry.entite;

import java.util.Date;
import javax.persistence.Column;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import tg.adn.precord.data.entite.EntiteModel;
import tg.adn.precord.essentials.entite.Pays;
import tg.adn.precord.essentials.entite.Personne;
import tg.adn.precord.essentials.entite.Profession;
import tg.adn.precord.essentials.entite.Zone;
import tg.adn.precord.essentials.utils.StatutMatrimonialEnum;

/**
 *
 * @author cagecfi
 */
public class Demande extends EntiteModel {

    private Personne personne;
    private String nomUsuel;
    private Date dateNaissance;
    private Zone lieuNaissance;
    private Pays pays;
    private String nomPere;
    private String prenomsPere;
    private String nomMere;
    private String prenomsMere;
    private Profession profession;
    @Type(type = "tg.adn.precord.data.utils.EnumUserType",
            parameters = {
                @Parameter(name = "enumClass", value = "tg.adn.precord.essentials.utils.StatutMatrimonialEnum"),
                @Parameter(name = "reCreateEnumMthd", value = "reCreateStatut"),
                @Parameter(name = "reCreateStringMthd", value = "reCreateString")})
    @Column(name = "PERS_SEXE", nullable = false)
    private StatutMatrimonialEnum statutMatrimonial;

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public String getNomUsuel() {
        return nomUsuel;
    }

    public void setNomUsuel(String nomUsuel) {
        this.nomUsuel = nomUsuel;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public Zone getLieuNaissance() {
        return lieuNaissance;
    }

    public void setLieuNaissance(Zone lieuNaissance) {
        this.lieuNaissance = lieuNaissance;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public String getNomPere() {
        return nomPere;
    }

    public void setNomPere(String nomPere) {
        this.nomPere = nomPere;
    }

    public String getPrenomsPere() {
        return prenomsPere;
    }

    public void setPrenomsPere(String prenomsPere) {
        this.prenomsPere = prenomsPere;
    }

    public String getNomMere() {
        return nomMere;
    }

    public void setNomMere(String nomMere) {
        this.nomMere = nomMere;
    }

    public String getPrenomsMere() {
        return prenomsMere;
    }

    public void setPrenomsMere(String prenomsMere) {
        this.prenomsMere = prenomsMere;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public StatutMatrimonialEnum getStatutMatrimonial() {
        return statutMatrimonial;
    }

    public void setStatutMatrimonial(StatutMatrimonialEnum statutMatrimonial) {
        this.statutMatrimonial = statutMatrimonial;
    }

    @Override
    public String toString() {
        return "Demande{" + "personne=" + personne + ", nomUsuel=" + nomUsuel
                + ", dateNaissance=" + dateNaissance
                + ", lieuNaissance=" + lieuNaissance + ", pays=" + pays
                + ", nomPere=" + nomPere + ", prenomsPere=" + prenomsPere
                + ", nomMere=" + nomMere + ", prenomsMere=" + prenomsMere
                + ", profession=" + profession
                + ", statutMatrimonial=" + statutMatrimonial + '}';
    }

    @Override
    public String getMouchard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
