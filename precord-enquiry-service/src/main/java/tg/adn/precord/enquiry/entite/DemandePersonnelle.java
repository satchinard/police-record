/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.enquiry.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import tg.adn.precord.data.entite.EntiteModel;
import tg.adn.precord.essentials.entite.Personne;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "DEMANDE_PERSONNELLE")
public class DemandePersonnelle extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "DMD_PERSONNE", nullable = false)
    @OneToOne(fetch = FetchType.LAZY)
    private Personne personne;

    @Override
    public String getMouchard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
