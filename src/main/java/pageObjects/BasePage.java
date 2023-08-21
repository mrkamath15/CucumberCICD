package pageObjects;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.DriverFactory;

import java.time.Duration;

public class BasePage extends DriverFactory {
    private WebDriverWait wait;

    public BasePage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public boolean waitUntilWebElementIsVisible(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            logger.info("Element is visible : " + element.toString());
            return true;
        }
        catch (Exception e) {
            logger.error("WebElement is not visible exception : " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    public void waitAndSendTextToWebElement(WebElement element, String text) {
        try {
            waitUntilWebElementIsVisible(element);
            element.clear();
            element.sendKeys(text);
            logger.info("Successfully sent text : " + text + " to WebElement : " + element.toString());
        }
        catch (Exception e) {
            logger.error("Unable to send text : " + text + " to WebElement : " + element.toString() + " exception : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void waitAndClickWebElement(WebElement element) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            logger.info("Successfully clicked the web element : " + element.toString());

        }
        catch (Exception e) {
            logger.error("Unable to click the web element : " + element.toString() + " exception : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void waitAndClickWebElementNoAssert(WebElement element) {
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            logger.info("Successfully clicked the web element : " + element.toString());
    }

    public String waitAndGetTextFromWebElement(WebElement element) {
        try {
            waitUntilWebElementIsVisible(element);
            String text = element.getText();
            logger.info("Successfully retrieved text : " + text + ", from webelement : " + element.toString());
            return text;
        }
        catch (Exception e) {
            logger.error("Unable to get text from web element : " + element.toString() + " exception : " + e.getMessage());
            e.printStackTrace();
            return "";
        }
    }

    public void waitAndSwitchToFrameByWebElement(WebElement element) {
        try {
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
            logger.info("Successfully switched to frame : " + element.toString());
        }
        catch (Exception e) {
            logger.error("Unable to switch to frame : " + element.toString() + ", Exception : " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void switchToDefaultContent() {
        try {
            driver.switchTo().defaultContent();
            logger.info("Switched to default content");
        }
        catch (Exception e) {
            logger.error("Unable to switch to default content");
            e.printStackTrace();
        }
    }
}
