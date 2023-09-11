package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginSuccessPage extends BasePage {
  @FindBy(xpath = "//*[text()[contains(.,'Thank you for Loggin.')]]")
  private WebElement loginSuccess_label;

  public boolean isLoginSuccessMessageDisplayed() {
    return waitUntilWebElementIsVisible(loginSuccess_label);
  }
}
