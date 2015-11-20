/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.data.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 *
 * @author cagecfi
 */
public class SpringContextHolder implements ApplicationContextAware {

    private static String path = null;
    @Autowired(required = true)
    private static ApplicationContext context = null;

    public String getPath() {
        return path;
    }

    public ApplicationContext getContext() {
        return context;
    }

    @Override
    public void setApplicationContext(ApplicationContext ac) throws BeansException {
        SpringContextHolder.context = ac;
    }

}
