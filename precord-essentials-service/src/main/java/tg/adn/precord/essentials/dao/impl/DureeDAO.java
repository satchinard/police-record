/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.essentials.dao.IDureeDAO;
import tg.adn.precord.essentials.entite.Duree;

/**
 *
 * @author cagecfi
 */
@Repository("dureeDAO")
public class DureeDAO extends DAO<Duree, Integer> implements IDureeDAO {

    public DureeDAO() {
        super(Duree.class);
    }

}
