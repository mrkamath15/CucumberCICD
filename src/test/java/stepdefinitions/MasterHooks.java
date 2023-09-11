package stepdefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utility.Constants;
import utility.DriverFactory;

public class MasterHooks extends DriverFactory {
  private static ExtentSparkReporter extentSparkReporter;

  @BeforeAll
  public static void beforeAll() {
    extentSparkReporter = new ExtentSparkReporter(Constants.EXTENT_REPORTS_PATH);
    extentSparkReporter.config().setDocumentTitle("Cucumber Automation");
    extentSparkReporter.config().setReportName("Cucumber Report");
    extentSparkReporter.config().setTheme(Theme.DARK);
    extentSparkReporter.config().setEncoding("utf-8");

    extentReports = new ExtentReports();
    extentReports.attachReporter(extentSparkReporter);
  }

  @Before
  public void setUp(Scenario scenario) {
    driver = getDriver();
    logger.info("Browser launched successfully");
    extentTest = extentReports.createTest(scenario.getName());
  }

  @After
  public void tearDown(Scenario scenario) {
    if (scenario.isFailed()) {
      extentTest.log(Status.FAIL, "Test Failed ");
    }
    scenario.attach(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES), "image/png", scenario.getName());
    driver.quit();
    logger.info("Browser closed successfully");
  }

  @AfterAll
  public static void afterAll() {
    extentReports.flush();
  }
}
