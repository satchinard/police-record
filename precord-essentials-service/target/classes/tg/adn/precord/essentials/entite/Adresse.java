/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.entite;

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
@Table(name = "ADRESSE")
@SequenceGenerator(name = "ADRESSE_SEQ_GEN", sequenceName = "ADRESSE_SEQ_GEN")
public class Adresse extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ADRESSE_SEQ_GEN")
    private Integer id;
    private String adresse;
    private String bp;
    private String telMob;
    private String telWork;
    private String email;
    private String siteWeb;

    @Override
    public String getMouchard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
