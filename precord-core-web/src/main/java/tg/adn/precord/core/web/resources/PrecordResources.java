/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.web.resources;

import java.util.ArrayList;
import java.util.List;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

/**
 *
 * @author cagecfi
 */
public class PrecordResources extends JavaScriptResourceReference {

    public PrecordResources(Class<?> scope, String name) {
        super(scope, name);
    }

    @Override
    public List<HeaderItem> getDependencies() {
        List<HeaderItem> dependencies = new ArrayList<HeaderItem>();
//        Url dojoGoogleCdn = Url.parse("https://ajax.googleapis.com/ajax/libs/dojo/1.7.2/dojo/dojo.js");
//        ExternalUrlResourceReference externalUrlResourceReference = new ExternalUrlResourceReference(dojoGoogleCdn);
//        dependencies.add(JavaScriptHeaderItem.forReference(externalUrlResourceReference));
//        dependencies.add(CssHeaderItem.forReference(new CssResourceReference(PrecordResources.class, "a.css")));
        return dependencies;
    }

}
