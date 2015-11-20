/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.web.resources;

import org.apache.wicket.request.Url;
import org.apache.wicket.request.resource.UrlResourceReference;

/**
 *
 * @author cagecfi
 */
public class FontAwesomeCDNCSSReference extends UrlResourceReference {

    private static final long serialVersionUID = 1457879L;
    private static final String CDNURL = "//netdna.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.css";

    /**
     * Singleton instance of this reference
     */
    private static final FontAwesomeCDNCSSReference INSTANCE = new FontAwesomeCDNCSSReference();

    /**
     * @return the single instance of the resource reference
     */
    public static FontAwesomeCDNCSSReference instance() {
        return INSTANCE;
    }

    private FontAwesomeCDNCSSReference() {
        super(Url.parse(CDNURL));
    }

}
