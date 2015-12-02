/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tg.adn.precord.data.dao.IDAO;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.essentials.dao.IJusticeDAO;
import tg.adn.precord.essentials.entite.Justice;
import tg.adn.precord.essentials.service.IJusticeService;

/**
 *
 * @author cagecfi
 */
public class JusticeService extends ServiceModel<Justice, Integer> implements IJusticeService {

    @Autowired(required = true)
    private IJusticeDAO justiceDAO;

    @Override
    public IDAO<Justice, Integer> getDao() {
        return justiceDAO;
    }

}
