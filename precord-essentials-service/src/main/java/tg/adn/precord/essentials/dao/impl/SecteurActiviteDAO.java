/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.essentials.dao.ISecteurActiviteDAO;
import tg.adn.precord.essentials.entite.SecteurActivite;

/**
 *
 * @author cagecfi
 */
@Repository("secteurActiviteDAO")
public class SecteurActiviteDAO extends DAO<SecteurActivite, Integer> implements ISecteurActiviteDAO {

    public SecteurActiviteDAO() {
        super(SecteurActivite.class);
    }

}
