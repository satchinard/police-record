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
import tg.adn.precord.essentials.dao.ITypeSanctionDAO;
import tg.adn.precord.essentials.entite.TypeSanction;
import tg.adn.precord.essentials.service.ITypeSanctionService;

/**
 *
 * @author cagecfi
 */
@Service("typeSanctionService")
public class TypeSanctionService extends ServiceModel<TypeSanction, Integer>
        implements ITypeSanctionService {

    @Autowired(required = true)
    private ITypeSanctionDAO typeSanctionDAO;

    @Override
    public IDAO<TypeSanction, Integer> getDao() {
        return typeSanctionDAO;
    }

}
