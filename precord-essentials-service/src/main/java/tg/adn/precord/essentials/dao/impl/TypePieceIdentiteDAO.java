/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.essentials.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.essentials.dao.ITypePieceIdentiteDAO;
import tg.adn.precord.essentials.entite.TypePieceIdentite;

/**
 *
 * @author cagecfi
 */
@Repository("typePieceIdentiteDAO")
public class TypePieceIdentiteDAO extends DAO<TypePieceIdentite, Integer> implements ITypePieceIdentiteDAO {

    public TypePieceIdentiteDAO() {
        super(TypePieceIdentite.class);
    }

}
