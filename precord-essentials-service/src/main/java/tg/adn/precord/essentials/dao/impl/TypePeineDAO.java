/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.essentials.dao.ITypePeineDAO;
import tg.adn.precord.essentials.entite.TypePeine;

/**
 *
 * @author cagecfi
 */
@Repository("typePeineDAO")
public class TypePeineDAO extends DAO<TypePeine, Integer> implements ITypePeineDAO {

    public TypePeineDAO() {
        super(TypePeine.class);
    }

}
