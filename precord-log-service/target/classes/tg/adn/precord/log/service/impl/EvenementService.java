/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tg.adn.precord.data.dao.IDAO;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.log.dao.IEvenementDAO;
import tg.adn.precord.log.entite.Evenement;
import tg.adn.precord.log.service.IEvenementService;

/**
 *
 * @author cagecfi
 */
public class EvenementService extends ServiceModel<Evenement, Integer>
        implements IEvenementService {

    @Autowired(required = true)
    IEvenementDAO evenementDAO;

    @Override
    public IDAO<Evenement, Integer> getDao() {
        return evenementDAO;
    }

}
