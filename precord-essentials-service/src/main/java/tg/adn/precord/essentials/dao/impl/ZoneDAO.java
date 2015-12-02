/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.essentials.dao.IZoneDAO;
import tg.adn.precord.essentials.entite.Zone;

/**
 *
 * @author cagecfi
 */
@Repository("zoneDAO")
public class ZoneDAO extends DAO<Zone, Integer> implements IZoneDAO {

    public ZoneDAO() {
        super(Zone.class);
    }

}
