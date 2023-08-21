package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class SignInSteps extends MasterHooks {

    @Given("user navigates to {string}")
    public void user_navigates_to_url( String appUrl) {
        System.out.println("URL");
    }

    @When("user enters username {string}")
    public void user_enters_username( String username) {
        System.out.println("USERNAME");
    }

    @When("user enters password {string}")
    public void user_enters_password( String password) {
        System.out.println("PASSWORD");
    }

    @When("user clicks on submit button")
    public void user_clicks_on_submit_button() {
        System.out.println("SUBMIT");
    }

    @When("user login is successful")
    public void user_login_is_successful() {
        System.out.println("LOGIN");
    }
}
