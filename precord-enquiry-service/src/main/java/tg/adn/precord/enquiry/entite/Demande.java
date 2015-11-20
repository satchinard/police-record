/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.enquiry.entite;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import tg.adn.precord.data.entite.EntiteModel;
import tg.adn.precord.essentials.entite.Fonction;
import tg.adn.precord.essentials.entite.Personne;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "DEMANDES")
public class Demande extends EntiteModel {

    @Id
    private Integer id;
    @Column(name = "DMD_PERSONNE", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Personne personne;
    @Column(name = "DMD_FONCTION", nullable = false)
    @ManyToOne
    private Fonction fonction;
    @Column(name = "DMD_NOM_ORGANISME", nullable = false)
    private String nomOrganisme;
    @Column(name = "DMD_OBJET_SOCIAL", nullable = false)
    private String objetSocial;
    @Column(name = "DMD_NATURE_EMPLOI", nullable = false)
    private String natureEmploi;
    @Column(name = "DMD_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDemande = new Date();
    @Column(name = "DMD_DATE_TRAITEMENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTraitement;

    public Demande() {
    }

    public Demande(Integer id, Personne personne, Fonction fonction,
            String nomOrganisme, String objetSocial, String natureEmploi,
            Date dateTraitement) {
        this.id = id;
        this.personne = personne;
        this.fonction = fonction;
        this.nomOrganisme = nomOrganisme;
        this.objetSocial = objetSocial;
        this.natureEmploi = natureEmploi;
        this.dateTraitement = dateTraitement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public String getNomOrganisme() {
        return nomOrganisme;
    }

    public void setNomOrganisme(String nomOrganisme) {
        this.nomOrganisme = nomOrganisme;
    }

    public String getObjetSocial() {
        return objetSocial;
    }

    public void setObjetSocial(String objetSocial) {
        this.objetSocial = objetSocial;
    }

    public String getNatureEmploi() {
        return natureEmploi;
    }

    public void setNatureEmploi(String natureEmploi) {
        this.natureEmploi = natureEmploi;
    }

    public Date getDateDemande() {
        return dateDemande;
    }

    public void setDateDemande(Date dateDemande) {
        this.dateDemande = dateDemande;
    }

    public Date getDateTraitement() {
        return dateTraitement;
    }

    public void setDateTraitement(Date dateTraitement) {
        this.dateTraitement = dateTraitement;
    }

    @Override
    public String getMouchard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
