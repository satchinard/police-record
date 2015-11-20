/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.log.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tg.adn.precord.data.dao.IDAO;
import tg.adn.precord.data.service.impl.ServiceModel;
import tg.adn.precord.log.dao.IActionsLogDAO;
import tg.adn.precord.log.entite.ActionsLog;
import tg.adn.precord.log.service.IActionsLogService;

/**
 *
 * @author cagecfi
 */
@Service("actionsLogService")
public class ActionsLogService extends ServiceModel<ActionsLog, Integer>
        implements IActionsLogService {

    @Autowired(required = true)
    private IActionsLogDAO logDAO;

    @Override
    public IDAO<ActionsLog, Integer> getDao() {
        return logDAO;
    }

}
