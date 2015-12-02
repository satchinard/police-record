/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.enquiry.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.enquiry.dao.IDemandeSocieteDAO;
import tg.adn.precord.enquiry.entite.DemandeSociete;

/**
 *
 * @author cagecfi
 */
@Service("demandeSocieteService")
public class DemandeSocieteService extends ServiceModel<DemandeSociete, Integer> {

    @Autowired
    private IDemandeSocieteDAO dmdSocieteDAO;

    @Override
    public IDemandeSocieteDAO getDao() {
        return dmdSocieteDAO;
    }

}
