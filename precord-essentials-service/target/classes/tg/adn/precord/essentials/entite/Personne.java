/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.entite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import tg.adn.precord.data.entite.EntiteModel;
import tg.adn.precord.essentials.utils.SexeEnum;

/**
 *
 * @author cagecfi
 */
@Entity
@Table(name = "PERSONNES")
public class Personne extends EntiteModel {

    @Id
    private Integer id;
    @Column(name = "NOM", nullable = false)
    private String nom;
    @Column(name = "PRENOMS")
    private String prenoms;
    @Type(type = "tg.adn.precord.data.utils.EnumUserType",
            parameters = {
                @Parameter(name = "enumClass", value = "tg.adn.precord.essentials.utils.SexeEnum"),
                @Parameter(name = "reCreateEnumMthd", value = "reCreateSexe"),
                @Parameter(name = "reCreateStringMthd", value = "reCreateString")})
    @Column(name = "PERS_SEXE", nullable = false)
    private SexeEnum sexe;
    @Column(name = "PERS_ADRESSE", nullable = false)
    private Adresse adresse;

    @Override
    public String getMouchard() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
