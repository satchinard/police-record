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
import tg.adn.precord.data.entite.EntiteModel;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "ACTION_LOGS")
@SequenceGenerator(name = "ACTION_LOG_GEN", sequenceName = "ACTION_LOG_GEN")
public class ActionsLog extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ACTION_LOG_GEN")
    private Integer id;
    @Column(name = "ACTION_LOG_IP", nullable = false)
    private String adresseIp;
    @Column(name = "ACTION_LOG_URL", nullable = false)
    private String urlAction;
    @Column(name = "ACTION_LOG_HEURE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAction;
    @Column(name = "ACTION_DESCRIPTION")
    private String description;
    @Column(name = "ACTION_MODULE")
    private String module;
    @Column(name = "ACTION_DATA_JSON")
    private String jsonString;
    @Column(name = "ACTION_NOM_CLASSE")
    private String nomClasse;
    @Column(name = "ACTION_TYPE")
    private String typeAction;

    public ActionsLog() {
    }

    public ActionsLog(Integer id, String adresseIp, String urlAction,
            Date dateAction, String nomAction, String module, String jsonString,
            String nomClasse) {
        this.id = id;
        this.adresseIp = adresseIp;
        this.urlAction = urlAction;
        this.dateAction = dateAction;
        this.description = nomAction;
        this.module = module;
        this.jsonString = jsonString;
        this.nomClasse = nomClasse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdresseIp() {
        return adresseIp;
    }

    public void setAdresseIp(String adresseIp) {
        this.adresseIp = adresseIp;
    }

    public String getUrlAction() {
        return urlAction;
    }

    public void setUrlAction(String urlAction) {
        this.urlAction = urlAction;
    }

    public Date getDateAction() {
        return dateAction;
    }

    public void setDateAction(Date dateAction) {
        this.dateAction = dateAction;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public String getJsonString() {
        return jsonString;
    }

    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    public String getNomClasse() {
        return nomClasse;
    }

    public void setNomClasse(String nomClasse) {
        this.nomClasse = nomClasse;
    }

    public String getTypeAction() {
        return typeAction;
    }

    public void setTypeAction(String typeAction) {
        this.typeAction = typeAction;
    }

    @Override
    public String getMouchard() {
        return null;
    }

}
