/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.web.test;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import tg.adn.precord.core.web.app.PrecordHome;

/**
 *
 * @author cagecfi
 */
@Component
public class CoreWebTest extends WebApplication implements ApplicationContextAware {

    ApplicationContext ctx;

    @Override
    protected void init() {
        getComponentInstantiationListeners().add(new SpringComponentInjector(this, ctx, true));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.ctx = applicationContext;
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return PrecordHome.class;
    }

}
