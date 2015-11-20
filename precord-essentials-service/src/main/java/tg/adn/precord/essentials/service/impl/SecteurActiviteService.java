/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.adn.precord.data.dao.IDAO;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.essentials.dao.ISecteurActiviteDAO;
import tg.adn.precord.essentials.entite.SecteurActivite;
import tg.adn.precord.essentials.service.ISecteurActiviteService;

/**
 *
 * @author cagecfi
 */
@Service("secteurActiviteService")
public class SecteurActiviteService extends ServiceModel<SecteurActivite, Integer>
        implements ISecteurActiviteService {

    @Autowired(required = true)
    private ISecteurActiviteDAO secteurActiviteDAO;

    @Override
    public IDAO<SecteurActivite, Integer> getDao() {
        return secteurActiviteDAO;
    }

}
