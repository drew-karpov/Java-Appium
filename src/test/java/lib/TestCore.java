package lib;

import junit.framework.TestCase;
import lib.factories.SomePageObjectFactory;
import lib.intefaces.ISomePageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TestCore extends TestCase {

    protected RemoteWebDriver driver;
    protected ISomePageObject somePage;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        driver = Platform.getInstance().getDriver();
        somePage = SomePageObjectFactory.get(driver);
    }

    @Override
    protected void tearDown() throws Exception {
        driver.quit();
        super.tearDown();
    }

}

