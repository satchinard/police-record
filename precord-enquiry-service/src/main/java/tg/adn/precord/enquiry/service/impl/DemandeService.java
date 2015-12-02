/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.enquiry.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.enquiry.dao.IDemandeDAO;
import tg.adn.precord.enquiry.entite.Demande;
import tg.adn.precord.enquiry.service.IDemandeService;

/**
 *
 * @author cagecfi
 */
@Service("demandeService")
public class DemandeService extends ServiceModel<Demande, Integer> implements IDemandeService {

    @Autowired
    private IDemandeDAO demandeDAO;

    @Override
    public IDemandeDAO getDao() {
        return demandeDAO;
    }

}
