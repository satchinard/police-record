/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.essentials.dao.IProfessionDAO;
import tg.adn.precord.essentials.entite.Profession;

/**
 *
 * @author cagecfi
 */
@Repository("professionDAO")
public class ProfessionDAO extends DAO<Profession, Integer> implements IProfessionDAO {

    public ProfessionDAO() {
        super(Profession.class);
    }

}
