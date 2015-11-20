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
import tg.adn.precord.essentials.dao.ITypePieceIdentiteDAO;
import tg.adn.precord.essentials.entite.TypePieceIdentite;
import tg.adn.precord.essentials.service.ITypePieceIdentiteService;

/**
 *
 * @author cagecfi
 */
@Service("typePieceIdentiteService")
public class TypePieceIdentiteService extends ServiceModel<TypePieceIdentite, Integer>
        implements ITypePieceIdentiteService {

    @Autowired(required = true)
    private ITypePieceIdentiteDAO typePieceIdentiteDAO;

    @Override
    public IDAO<TypePieceIdentite, Integer> getDao() {
        return typePieceIdentiteDAO;
    }

}
