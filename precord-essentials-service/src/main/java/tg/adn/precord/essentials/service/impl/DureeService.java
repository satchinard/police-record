/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tg.adn.precord.data.dao.IDAO;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.essentials.dao.IDureeDAO;
import tg.adn.precord.essentials.entite.Duree;
import tg.adn.precord.essentials.service.IDureeService;

/**
 *
 * @author cagecfi
 */
public class DureeService extends ServiceModel<Duree, Integer> implements IDureeService {

    @Autowired(required = true)
    private IDureeDAO dureeDAO;

    @Override
    public IDAO<Duree, Integer> getDao() {
        return dureeDAO;
    }

}
