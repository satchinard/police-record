package tg.adn.precord.core.web.app;

import org.apache.wicket.Application;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import tg.adn.precord.core.web.PrecordApp;
import tg.adn.precord.core.web.auth.PrecordAuthWebSession;
import tg.adn.precord.core.web.index.Index;
import tg.adn.precord.core.web.models.page.PageModel;

/**
 *
 * @author cagecfi
 */
public class PrecordHome extends PageModel {

    public PrecordHome(PageParameters params) {
        super(params);
    }

    @Override
    protected void onConfigure() {
        PrecordApp app = (PrecordApp) Application.get();
        if (!PrecordAuthWebSession.get().isSignedIn()) {
            app.restartResponseAtSignInPage();
        }
    }

    @Override
    protected void onInitialize() {
        super.onInitialize();
        add(new Link("google") {

            @Override
            public void onClick() {
                setResponsePage(PrecordHome.class);
            }
        });
        add(new Link("logout") {

            @Override
            public void onClick() {
                PrecordAuthWebSession.get().invalidate();
                setResponsePage(Index.class);
            }
        });
    }

}
