/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.enquiry.dao.impl;

import org.springframework.stereotype.Repository;
import tg.adn.precord.data.dao.impl.DAO;
import tg.adn.precord.enquiry.dao.IDemandeDAO;
import tg.adn.precord.enquiry.entite.Demande;

/**
 *
 * @author cagecfi
 */
@Repository("demandeDAO")
public class DemandeDAO extends DAO<Demande, Integer> implements IDemandeDAO {

    public DemandeDAO() {
        super(Demande.class);
    }

}
