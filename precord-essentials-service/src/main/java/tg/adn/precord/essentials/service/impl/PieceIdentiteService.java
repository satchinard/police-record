/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.service.impl;

import tg.adn.precord.data.dao.IDAO;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.essentials.entite.PieceIdentite;
import tg.adn.precord.essentials.service.IPieceIdentiteService;

/**
 *
 * @author cagecfi
 */
public class PieceIdentiteService extends ServiceModel<PieceIdentite, Integer> implements IPieceIdentiteService {

    @Override
    public IDAO<PieceIdentite, Integer> getDao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
