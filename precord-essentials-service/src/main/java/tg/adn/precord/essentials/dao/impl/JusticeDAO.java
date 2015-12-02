/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.essentials.dao.IJusticeDAO;
import tg.adn.precord.essentials.entite.Justice;

/**
 *
 * @author cagecfi
 */
@Repository("justiceDAO")
public class JusticeDAO extends DAO<Justice, Integer> implements IJusticeDAO {

    public JusticeDAO() {
        super(Justice.class);
    }

}
