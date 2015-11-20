/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.data.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "PARAMETRES_CONFIG_LONG")
public class ParametreConfigLong extends ParametreConfig {

    @Column(nullable = false)
    private Long valeur;

    public Long getValeur() {
        return valeur;
    }

    public void setValeur(Long valeur) {
        this.valeur = valeur;
    }

    @Override
    public String getMouchard() {
        return "ParametreConfigLong -> nom (" + ((getNom() != null) ? getNom() : "") + ")"
                + ", valeur (" + ((getValeur() != null)
                        ? getValeur() : "") + ")";
    }

}
