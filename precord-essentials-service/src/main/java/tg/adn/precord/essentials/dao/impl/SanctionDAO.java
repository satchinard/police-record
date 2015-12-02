/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.essentials.dao.ISanctionDAO;
import tg.adn.precord.essentials.entite.Sanction;

/**
 *
 * @author cagecfi
 */
@Repository("sanctionDAO")
public class SanctionDAO extends DAO<Sanction, Integer> implements ISanctionDAO {

    public SanctionDAO() {
        super(Sanction.class);
    }

}
