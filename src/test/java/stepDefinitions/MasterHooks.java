package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.DriverFactory;

public class MasterHooks extends DriverFactory {

    @Before
    public void setUp() {
       driver = getDriver();
       logger.info("Browser launched successfully");
    }

    @After
    public void tearDown(Scenario scenario) {
        scenario.attach(((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
        driver.quit();
        logger.info("Browser closed successfully");
    }
}
