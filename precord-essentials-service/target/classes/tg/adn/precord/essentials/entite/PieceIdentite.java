/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.entite;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "PIECE_IDENTITE")
@SequenceGenerator(name = "PIECE_IDENTITE_GEN", sequenceName = "PIECE_IDENTITE_GEN")
public class PieceIdentite extends EntiteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "PIECE_IDENTITE_GEN")
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TYPE_PIECE_IDENTITE")
    private TypePieceIdentite typePieceIdentite;
    @Column(name = "NUM_PIECE", unique = true, nullable = false)
    private String numero;
    @Column(name = "LIEU_ETABLISSEMENT", nullable = false)
    private String lieuEtablissement;
    @Column(name = "DATE_ETABLISSEMENT", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date dateEtablissement;
    @Column(name = "DATE_EXPIRATION")
    @Temporal(TemporalType.DATE)
    private Date dateExpiration;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAYS_ETABLISSEMENT", nullable = false)
    private Pays paysEtablissement;

    public PieceIdentite() {
    }

    public PieceIdentite(TypePieceIdentite typePieceIdentite, String numero,
            String lieuEtablissement, Date dateEtablissement, Date dateExpiration,
            Pays paysEtablissement) {
        this.typePieceIdentite = typePieceIdentite;
        this.numero = numero;
        this.lieuEtablissement = lieuEtablissement;
        this.dateEtablissement = dateEtablissement;
        this.dateExpiration = dateExpiration;
        this.paysEtablissement = paysEtablissement;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TypePieceIdentite getTypePieceIdentite() {
        return typePieceIdentite;
    }

    public void setTypePieceIdentite(TypePieceIdentite typePieceIdentite) {
        this.typePieceIdentite = typePieceIdentite;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLieuEtablissement() {
        return lieuEtablissement;
    }

    public void setLieuEtablissement(String lieuEtablissement) {
        this.lieuEtablissement = lieuEtablissement;
    }

    public Date getDateEtablissement() {
        return dateEtablissement;
    }

    public void setDateEtablissement(Date dateEtablissement) {
        this.dateEtablissement = dateEtablissement;
    }

    public Date getDateExpiration() {
        return dateExpiration;
    }

    public void setDateExpiration(Date dateExpiration) {
        this.dateExpiration = dateExpiration;
    }

    public Pays getPaysEtablissement() {
        return paysEtablissement;
    }

    public void setPaysEtablissement(Pays paysEtablissement) {
        this.paysEtablissement = paysEtablissement;
    }

    @Override
    public String getMouchard() {
        return "PieceIdentite -> id (" + getId()
                + "), typePieceIdentite (" + ((getTypePieceIdentite() != null
                && getTypePieceIdentite().getNom() != null) ? getTypePieceIdentite().getNom() : ")")
                + "), lieuEtablissement (" + ((getLieuEtablissement() != null) ? getLieuEtablissement() : ")")
                + "), dateEtablissement (" + ((getDateEtablissement() != null) ? getDateEtablissement() : ")")
                + "), dateExpiration (" + ((getDateExpiration() != null) ? getDateExpiration() : ")")
                + "), numero (" + ((getNumero() != null) ? getNumero() : ")")
                + "), pays (" + ((getPaysEtablissement() != null
                && getPaysEtablissement().getNom() != null) ? getPaysEtablissement().getNom() : ")");
    }
}
