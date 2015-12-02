/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.essentials.dao.IProfessionDAO;
import tg.adn.precord.essentials.entite.Profession;
import tg.adn.precord.essentials.service.IProfessionService;

/**
 *
 * @author cagecfi
 */
@Service("professionService")
public class ProfessionService extends ServiceModel<Profession, Integer> implements IProfessionService {

    @Autowired(required = true)
    private IProfessionDAO professionDAO;

    @Override
    public IProfessionDAO getDao() {
        return professionDAO;
    }

}
