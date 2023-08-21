package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import utility.DriverFactory;

public class SignInSteps extends DriverFactory {

    @Given("user navigates to {string}")
    public void user_navigates_to_url( String appUrl) {
        driver.get(appUrl);
    }

    @When("user enters username {string}")
    public void user_enters_username( String username) {
        signInModule.enter_username(username);
    }

    @When("user enters password {string}")
    public void user_enters_password( String password) {
        signInModule.enter_password(password);
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        signInModule.clickSubmit_button();
    }

    @When("user login is successful")
    public void user_login_is_successful() {
        Assert.assertTrue(loginSuccessPage.isLoginSuccessMessageDisplayed(), "Login Unsuccessful");
    }

    @Then("login error message {string} is displayed")
    public void login_error_message_is_displayed(String expectedText) {
        Assert.assertEquals(signInModule.getLoginErrorMessage(), expectedText);
    }
}
