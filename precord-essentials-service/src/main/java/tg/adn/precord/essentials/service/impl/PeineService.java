/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.essentials.dao.IPeineDAO;
import tg.adn.precord.essentials.entite.Peine;
import tg.adn.precord.essentials.service.IPeineService;

/**
 *
 * @author cagecfi
 */
public class PeineService extends ServiceModel<Peine, Integer> implements IPeineService {

    @Autowired(required = true)
    private IPeineDAO peineDAO;

    @Override
    public IPeineDAO getDao() {
        return peineDAO;
    }

}
