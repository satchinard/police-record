/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import tg.adn.precord.data.entite.EntiteModel;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "ADRESSE")
@SequenceGenerator(name = "ADRESSE_SEQ_GEN", sequenceName = "ADRESSE_SEQ_GEN")
public class Adresse extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ADRESSE_SEQ_GEN")
    @Column(name = "ID")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Pays pays;
    @Column(name = "VILLE")
    private String ville;
    @Column(name = "ADRESSE")
    private String adresse;
    @Column(name = "BP")
    private String bp;
    @Column(name = "MOBILE_PHONE")
    private String mobilePhone;
    @Column(name = "OFFICE_PHONE")
    private String officePhone;
    @Column(name = "PERSONNAL_EMAIL")
    private String personnalEmail;
    @Column(name = "OFFICE_EMAIL")
    private String officeEmail;
    @Column(name = "WEB_SITE")
    private String siteWeb;

    @Override
    public String getMouchard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
