/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.web.behaviors;

import org.apache.wicket.Component;
import org.apache.wicket.behavior.Behavior;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.request.Response;

/**
 *
 * @author cagecfi
 */
public class RequiredBehavior extends Behavior {

    @Override
    public void beforeRender(Component component) {
        Response response = component.getResponse();
        StringBuffer requiredStyle = new StringBuffer();
        if (component instanceof FormComponent
                && ((FormComponent) component).isRequired()) {
            requiredStyle.append("<b style='color:red;font-size:medium'>*</b>");
        }
        response.write(requiredStyle);
    }

}
