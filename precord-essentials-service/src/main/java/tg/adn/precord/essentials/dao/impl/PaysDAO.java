/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.essentials.dao.IPaysDAO;
import tg.adn.precord.essentials.entite.Pays;

/**
 *
 * @author cagecfi
 */
@Repository("paysDAO")
public class PaysDAO extends DAO<Pays, Integer> implements IPaysDAO {

    public PaysDAO() {
        super(Pays.class);
    }

}
