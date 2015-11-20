/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.web.login;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.StatelessForm;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.Strings;
import tg.adn.precord.core.web.models.page.PageModel;

/**
 *
 * @author cagecfi
 */
public class LoginPage extends PageModel {

    public LoginPage(PageParameters params) {
        super(params);
    }

    private String username;
    private String password;

    @Override
    protected void onInitialize() {
        super.onInitialize();

        StatelessForm form = new StatelessForm("form") {
            @Override
            protected void onSubmit() {
                if (Strings.isEmpty(username) || Strings.isEmpty(password)) {
                    return;
                }

                boolean authResult = AuthenticatedWebSession.get().signIn(username, password);

                if (authResult) {
                    continueToOriginalDestination();
                }
            }
        };

        form.setDefaultModel(new CompoundPropertyModel(this));

        form.add(new TextField("username"));
        form.add(new PasswordTextField("password"));

        add(form);
    }

}
