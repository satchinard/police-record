/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.enquiry.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.enquiry.dao.IDemandeSocieteDAO;
import tg.adn.precord.enquiry.entite.DemandeSociete;

/**
 *
 * @author cagecfi
 */
@Repository("demandeSocieteDAO")
public class DemandeSocieteDAO extends DAO<DemandeSociete, Integer> implements IDemandeSocieteDAO {

    public DemandeSocieteDAO() {
        super(DemandeSociete.class);
    }

}
