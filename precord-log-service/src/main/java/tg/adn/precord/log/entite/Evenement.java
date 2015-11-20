/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.log.entite;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.Type;
import tg.adn.precord.data.entite.EntiteModel;
import tg.adn.precord.log.utils.TypeEvenementEnum;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "EVENEMENTS")
@SequenceGenerator(name = "EVENEMENTS_GEN", sequenceName = "EVENEMENTS_GEN")
public class Evenement extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "EVENEMENTS_GEN")
    private Integer id;
    @Column(name = "EVT_MESSAGE")
    private String description;
    @Column(name = "EVT_HEURE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();
    @Type(parameters = {}, type = "")
    private TypeEvenementEnum type;

    public Evenement() {
    }

    public Evenement(String message, TypeEvenementEnum type) {
        this.description = message;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public TypeEvenementEnum getType() {
        return type;
    }

    public void setType(TypeEvenementEnum type) {
        this.type = type;
    }

    @Override
    public String getMouchard() {
        return "Evenement -> id ("
                + getId() + "), description (" + ((getDescription() != null) ? getDescription() : ")")
                + ", type (" + ((getType() != null) ? getType().getTypeEventString() : "") + ")"
                + ", date (" + ((getDate() != null) ? getDate().toString() : "") + ")";
    }
}
