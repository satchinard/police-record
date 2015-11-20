/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.entite;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import tg.adn.precord.data.entite.EntiteModel;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "ZONE")
@SequenceGenerator(name = "ZONE_GEN", sequenceName = "ZONE_GEN")
public class Zone extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "ZONE_GEN")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "ID_NIVEAU_ZONE", nullable = false)
    private NiveauZone niveauZone;
    @Column(name = "NOM_ZONE", nullable = false, unique = true)
    private String nom;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ZONE_PARENT")
    private Zone zoneParent;
    @OneToMany(mappedBy = "zoneParent", fetch = FetchType.LAZY)
    private List<Zone> zoneFilles;

    public Zone() {
    }

    public Zone(NiveauZone niveauZone, String nom, Zone zoneParent,
            List<Zone> zoneFilles) {
        this.niveauZone = niveauZone;
        this.nom = nom;
        this.zoneParent = zoneParent;
        this.zoneFilles = zoneFilles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public NiveauZone getNiveauZone() {
        return niveauZone;
    }

    public void setNiveauZone(NiveauZone niveauZone) {
        this.niveauZone = niveauZone;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Zone getZoneParent() {
        return zoneParent;
    }

    public void setZoneParent(Zone zoneParent) {
        this.zoneParent = zoneParent;
    }

    public List<Zone> getZoneFilles() {
        return zoneFilles;
    }

    public void setZoneFilles(List<Zone> zoneFilles) {
        this.zoneFilles = zoneFilles;
    }

    @Override
    public String getMouchard() {
        return "Zone -> id ("
                + getId() + "), nom (" + ((getNom() != null) ? getNom() : ")")
                + ", niveauZone (" + ((getNiveauZone() != null
                && getNiveauZone().getNom() != null) ? getNiveauZone().getNom() : ")")
                + ", zoneParent (" + ((getNiveauZone().getNom() != null)
                        ? getNiveauZone().getNom() : ")") + ")";
    }

}
