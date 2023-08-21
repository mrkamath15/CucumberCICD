package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

public class DriverFactory {
    public static WebDriver driver;
    ReadConfig readConfig;
    public static SignInModule signInModule;
    public static LoginSuccessPage loginSuccessPage;
    public static HomePage homePage;
    public static RegisterPage registerPage;
    public static UnderConstructionModule underConstructionModule;
    public static ExtentReports extentReports;
    public static ExtentTest extentTest;

    public static Logger logger = LogManager.getLogger();

    public DriverFactory() {
        readConfig = new ReadConfig();
    }

    public WebDriver getDriver() {
        try {
            String browser = readConfig.getBrowser();

            if (browser != null && !browser.isEmpty()) {
                switch (browser.toUpperCase()) {
                    case "CHROME":
                        System.setProperty("webdriver.chrome.driver", readConfig.getChromeDriverPath());
                        driver = new ChromeDriver();
                        break;
                    case "IE":
                        System.setProperty("webdriver.ie.driver", readConfig.getIEDriverPath());
                        driver = new InternetExplorerDriver();
                        break;
                    case "FIREFOX":
                        System.setProperty("webdriver.gecko.driver", readConfig.getFirefoxDriverPath());
                        driver = new FirefoxDriver();
                        break;
                    default:
                        logger.error("Invalid browser passed");
                }
                driver.manage().window().maximize();
                logger.info("Browser : " + browser + ", Initiated successfully");
                initializePages();
            }
        }
        catch (Exception e) {
            logger.error("Error initiating the browser : " + e.getMessage());
            e.printStackTrace();
        }
        return driver;
    }

    public void initializePages() {
        signInModule = PageFactory.initElements(driver, SignInModule.class);
        loginSuccessPage = PageFactory.initElements(driver, LoginSuccessPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        underConstructionModule = PageFactory.initElements(driver, UnderConstructionModule.class);
    }
}
