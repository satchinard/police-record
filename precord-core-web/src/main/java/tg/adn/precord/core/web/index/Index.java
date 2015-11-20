/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.web.index;

import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import tg.adn.precord.core.web.login.LoginPage;
import tg.adn.precord.core.web.models.page.PageModel;

/**
 *
 * @author cagecfi
 */
public class Index extends PageModel {

    public Index(PageParameters params) {
        super(params);
        add(new Link("login") {

            @Override
            public void onClick() {
                setResponsePage(LoginPage.class);
            }
        });
    }

}
