package tg.adn.precord.test.coreweb;

import javax.transaction.Transactional;
import org.apache.wicket.util.tester.WicketTester;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import tg.adn.precord.core.web.PrecordApp;
import tg.adn.precord.core.web.login.LoginPage;

/**
 *
 * @author cagecfi
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/WEB-INF/beans.xml"})
@TransactionConfiguration(transactionManager = "txManager", defaultRollback = false)
public class TestCoreWeb {

    private WicketTester tester;
//    @Autowired
//    private ApplicationContext ctx;
    @Autowired
    private PrecordApp precordApp;

    public TestCoreWeb() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        tester = new WicketTester(precordApp);
    }

    @After
    public void tearDown() {
    }

    @Test
    @Transactional
    @Rollback(true)
    public void testRenderMyPage() {
        tester.startPage(LoginPage.class);
        tester.assertRenderedPage(LoginPage.class);
    }
}
