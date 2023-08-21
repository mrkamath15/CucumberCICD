package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInModule extends BasePage {
    @FindBy(xpath = "//input[@name='userName']")
    private WebElement userName_textField;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement password_textField;

    @FindBy(xpath = "//input[@name='submit']")
    private WebElement submit_button;

    @FindBy(xpath = "//input[@name='password']//following::span")
    private WebElement loginError_label;

    public void enter_username(String username) {
        waitAndSendTextToWebElement(userName_textField, username);
    }

    public void enter_password(String password) {
        waitAndSendTextToWebElement(password_textField, password);
    }

    public void clickSubmit_button() {
        waitAndClickWebElement(submit_button);
    }

    public String getLoginErrorMessage() {
        return waitAndGetTextFromWebElement(loginError_label);
    }
}
