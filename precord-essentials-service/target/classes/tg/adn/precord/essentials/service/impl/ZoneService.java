/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.essentials.dao.IZoneDAO;
import tg.adn.precord.essentials.entite.Zone;
import tg.adn.precord.essentials.service.IZoneService;

/**
 *
 * @author cagecfi
 */
@Service("zoneService")
public class ZoneService extends ServiceModel<Zone, Integer> implements IZoneService {

    @Autowired(required = true)
    private IZoneDAO zoneDAO;

    @Override
    public IZoneDAO getDao() {
        return zoneDAO;
    }

}
