/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.web.test;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;

/**
 *
 * @author cagecfi
 */
public interface ApplicationContextAware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
