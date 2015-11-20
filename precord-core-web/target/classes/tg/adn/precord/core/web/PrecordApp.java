/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tg.adn.precord.core.web;

import org.apache.wicket.Page;
import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.authroles.authentication.AbstractAuthenticatedWebSession;
import org.apache.wicket.authroles.authentication.AuthenticatedWebApplication;
import org.apache.wicket.core.request.mapper.CryptoMapper;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.pages.InternalErrorPage;
import org.apache.wicket.protocol.http.ClientProperties;
import org.apache.wicket.request.resource.IResource;
import org.apache.wicket.spring.injection.annot.SpringComponentInjector;
import org.apache.wicket.util.file.Folder;
import org.apache.wicket.util.lang.Bytes;
import tg.adn.precord.core.web.auth.PrecordAuthWebSession;
import tg.adn.precord.core.web.index.Index;
import tg.adn.precord.core.web.login.LoginPage;
import tg.adn.precord.core.web.models.error.AccessDeniedPage;
import tg.adn.precord.core.web.models.error.SessionTimedOutErrorPage;
import tg.adn.precord.core.web.resources.print.PrecordPrinter;

/**
 *
 * @author cagecfi
 */
public class PrecordApp extends AuthenticatedWebApplication {

    private static final String DEFAULT_ENCODING = "utf-8";
    private Folder uploadFolder;

    public Folder getUploadFolder() {
        return uploadFolder;
    }

    @Override
    public Class<? extends Page> getHomePage() {
        return Index.class;
    }

    @Override
    protected void init() {

        // super.init();
        setConfigurationType(RuntimeConfigurationType.DEPLOYMENT);

        // upload file settings
        getApplicationSettings().setUploadProgressUpdatesEnabled(true);
        getApplicationSettings().setDefaultMaximumUploadSize(Bytes.kilobytes(10240));
        try {
            uploadFolder = new Folder(System.getenv("PATH"), "uploads");
        } catch (Exception e) {
            uploadFolder = new Folder(System.getProperty("java.io.tmpdir"), "uploads");
        }
        // créer le dossier des fichiers uploadés
        try {
            uploadFolder.mkdir();
        } catch (SecurityException se) {
        }

        // url encryption
        setRootRequestMapper(new CryptoMapper(getRootRequestMapper(), this));

        // debug settings
        getDebugSettings().setAjaxDebugModeEnabled(true);
        getDebugSettings().setOutputMarkupContainerClassName(false);

        // page settings
        getPageSettings().setRecreateBookmarkablePagesAfterExpiry(true);
        getPageSettings().setVersionPagesByDefault(false);

        // security settings
        getSecuritySettings().setEnforceMounts(true);

        // store settings
        getStoreSettings().setMaxSizePerSession(Bytes.kilobytes(5120));
        getStoreSettings().setInmemoryCacheSize(10);

        // markup settings
        getMarkupSettings().setStripWicketTags(true);
        getMarkupSettings().setStripComments(true);
        getMarkupSettings().setCompressWhitespace(true);

        // mounting application
//        mountPackage("concours", Login.class);
        // error pages settings
        getApplicationSettings().setInternalErrorPage(InternalErrorPage.class);
        getApplicationSettings().setAccessDeniedPage(AccessDeniedPage.class);
        getApplicationSettings().setPageExpiredErrorPage(SessionTimedOutErrorPage.class);

        // client properties
        ClientProperties cp = new ClientProperties();

        // JavaScript resources references
//        JavaScriptResourceReference jsResourceRef = new JavaScriptResourceReference(PrecordApp.class, "");
//        getResourceBundles().addJavaScriptBundle(PrecordApp.class, jQueryReference, jQueryUiResource);
//        getResourceBundles().addCssBundle(PrecordApp.class, cssReference, jQueryUiResource);
//        addResourceReplacement(
//                JQueryResourceReference.get(),
//                new UrlResourceReference(Url.parse("https://ajax.googleapis.com/ajax/libs/dojo/1.7.3/dojo/dojo.js"))
//        );
//        addResourceReplacement(
//                Bootstrap.BOOTSTRAP_CSS,
//                new UrlResourceReference(Url.parse("https://ajax.googleapis.com/ajax/libs/dojo/1.7.3/dojo/dojo.js"))
//        );
//        addResourceReplacement(
//                Bootstrap.BOOTSTRAP_RESPONSIVE_CSS,
//                new UrlResourceReference(Url.parse("https://ajax.googleapis.com/ajax/libs/dojo/1.7.3/dojo/dojo.js"))
//        );
//        if (usesDeploymentConfig()) {
//            addResourceReplacement(DojoResourceReference.get(), new UrlResourceReference(Url.parse("https://ajax.googleapis.com/ajax/libs/dojo/1.7.3/dojo/dojo.js")));
//        }
//        getResourceBundles().addJavaScriptBundle(ResourceManagementApplication.class, "bundle.js", new BundlesPage.BundledResourceReferenceA(), new BundlesPage.BundledResourceReferenceB(), new BundlesPage.BundledResourceReferenceC());
//        setHeaderResponseDecorator(new IHeaderResponseDecorator() {
//            @Override
//            public IHeaderResponse decorate(IHeaderResponse response) {
//                String headBucket = "headBucket";
//                List<FilteringHeaderResponse.IHeaderResponseFilter> filters = new ArrayList<FilteringHeaderResponse.IHeaderResponseFilter>();
//                AbstractHeaderResponseFilter bucketAcceptingFilter = new AbstractHeaderResponseFilter(JS_IN_FOOTER_FILTER_NAME) {
//                    @Override
//                    public boolean accepts(HeaderItem item) {
//                        boolean accepts = false;
//                        if (item instanceof FilteredHeaderItem) {
//                            FilteredHeaderItem filteredHeaderItem = (FilteredHeaderItem) item;
//                            if (JS_IN_FOOTER_FILTER_NAME.equals(filteredHeaderItem.getFilterName())) {
//                                accepts = true;
//                            }
//                        }
//                        return accepts;
//                    }
//                };
//                filters.add(bucketAcceptingFilter);
//                filters.add(new OppositeHeaderResponseFilter(headBucket, bucketAcceptingFilter));
//                return new FilteringHeaderResponse(response, headBucket, filters);
//            }
//        }
//        );
        // resource settings
        getResourceSettings().setUseMinifiedResources(true);
        getResourceSettings().setUseDefaultOnMissingResource(true);
        getResourceSettings().setThrowExceptionOnMissingResource(false);
        getResourceSettings().setEncodeJSessionId(true);
        PrecordPrinter precordPrinter = new PrecordPrinter("printer");
        getSharedResources().add("printer", (IResource) precordPrinter);
        //        getResourceSettings().getResourceFinders().add(
        //                new WebApplicationPath(getServletContext(), "props"));

        // spring settings
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        getComponentInstantiationListeners().add(new SpringComponentInjector(this, context));
        getComponentInstantiationListeners().add(new SpringComponentInjector(this));
    }

    @Override
    protected Class<? extends AbstractAuthenticatedWebSession> getWebSessionClass() {
        return PrecordAuthWebSession.class;
    }

    @Override
    protected Class<? extends WebPage> getSignInPageClass() {
        return LoginPage.class;
    }

}
