package stepdefinitions;

import io.cucumber.java.en.When;
import utility.DriverFactory;

public class HomePageSteps extends DriverFactory {

  @When("user clicks on sign-on link")
  public void user_clicks_on_sign_on_link() {
    homePage.clickSignOn_link();
  }

  @When("user clicks on register link")
  public void user_clicks_on_register_link() {
    homePage.clickRegister_link();
  }

  @When("user clicks on support link")
  public void user_clicks_on_support_link() {
    homePage.clickSupport_link();
  }

  @When("user clicks on contact link")
  public void user_clicks_on_contact_link() {
    homePage.clickContact_link();
  }

  @When("user clicks on flights link")
  public void user_clicks_on_flights_link() {
    homePage.clickFlights_link();
  }

  @When("user clicks on hotels link")
  public void user_clicks_on_hotels_link() {
    homePage.clickHotels_link();
  }

  @When("user clicks on car rentals link")
  public void user_clicks_on_car_rentals_link() {
    homePage.clickCarRentals_link();
  }

  @When("user clicks on cruises link")
  public void user_clicks_on_cruises_link() {
    homePage.clickCruises_link();
  }

  @When("user clicks on destinations link")
  public void user_clicks_on_destinations_link() {
    homePage.clickDestinations_link();
  }

  @When("user clicks on vacations link")
  public void user_clicks_on_vacations_link() {
    homePage.clickVacations_link();
  }

}
