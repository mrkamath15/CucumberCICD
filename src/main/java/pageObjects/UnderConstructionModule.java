package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnderConstructionModule extends BasePage {

    @FindBy(xpath = "//*[text()[contains(.,'This section of our web site is currently under construction.')]]")
    private WebElement underConstruction_label;

    @FindBy(xpath = "//img[@src='images/home.gif']")
    private WebElement backToHome_button;

    public boolean isUnderConstructionLabelDisplayed() {
        return waitUntilWebElementIsVisible(underConstruction_label);
    }

    public boolean isBackToHomeButtonDisplayed() {
        return waitUntilWebElementIsVisible(backToHome_button);
    }

    public void clickBackToHome_button() {
        waitAndClickWebElement(backToHome_button);
    }
}
