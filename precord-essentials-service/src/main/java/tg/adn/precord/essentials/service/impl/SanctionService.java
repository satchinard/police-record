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
import tg.adn.precord.essentials.dao.ISanctionDAO;
import tg.adn.precord.essentials.entite.Sanction;
import tg.adn.precord.essentials.service.ISanctionService;

/**
 *
 * @author cagecfi
 */
@Service("sanctionService")
public class SanctionService extends ServiceModel<Sanction, Integer>
        implements ISanctionService {

    @Autowired(required = true)
    private ISanctionDAO sanctionDAO;

    @Override
    public IDAO<Sanction, Integer> getDao() {
        return sanctionDAO;
    }

}
