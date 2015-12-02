/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.essentials.dao.IPaysDAO;
import tg.adn.precord.essentials.entite.Pays;
import tg.adn.precord.essentials.service.IPaysService;

/**
 *
 * @author cagecfi
 */
public class PaysService extends ServiceModel<Pays, Integer> implements IPaysService {

    @Autowired(required = true)
    private IPaysDAO paysDAO;

    @Override
    public IPaysDAO getDao() {
        return paysDAO;
    }

}
