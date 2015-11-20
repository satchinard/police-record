/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.web;

import org.apache.wicket.Application;
import org.apache.wicket.IInitializer;

/**
 *
 * @author cagecfi
 */
public class PrecordAppInit implements IInitializer {

    @Override
    public void init(Application app) {
        // application name
        app.setName("Precord App");
        // debug settings
        app.setDebugSettings(app.getDebugSettings().setAjaxDebugModeEnabled(false)
                .setDevelopmentUtilitiesEnabled(true)
                .setLinePreciseReportingOnAddComponentEnabled(true));
        // security settings
        app.setSecuritySettings(app.getSecuritySettings()
                .setEnforceMounts(true));
    }

    @Override
    public void destroy(Application arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
