/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.essentials.dao.INiveauZoneDAO;
import tg.adn.precord.essentials.entite.NiveauZone;
import tg.adn.precord.essentials.service.INiveauZoneService;

/**
 *
 * @author cagecfi
 */
public class NiveauZoneService extends ServiceModel<NiveauZone, Integer> implements INiveauZoneService {

    @Autowired(required = true)
    private INiveauZoneDAO niveauZoneDAO;

    @Override
    public INiveauZoneDAO getDao() {
        return niveauZoneDAO;
    }

}
