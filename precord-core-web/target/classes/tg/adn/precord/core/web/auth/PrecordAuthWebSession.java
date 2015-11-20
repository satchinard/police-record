package tg.adn.precord.core.web.auth;

import org.apache.wicket.authroles.authentication.AuthenticatedWebSession;
import org.apache.wicket.authroles.authorization.strategies.role.Roles;
import org.apache.wicket.request.Request;

/**
 *
 * @author cagecfi
 */
public class PrecordAuthWebSession extends AuthenticatedWebSession {

    public PrecordAuthWebSession(Request request) {
        super(request);
    }

    @Override
    protected boolean authenticate(String username, String password) {
        return username.equals(password) && username.equals("wicketer");
    }

    @Override
    public Roles getRoles() {
        return null;
    }

}
