package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

  @FindBy(linkText = "SIGN-ON")
  private WebElement signOn_link;

  @FindBy(linkText = "REGISTER")
  private WebElement register_link;

  @FindBy(linkText = "SUPPORT")
  private WebElement support_link;

  @FindBy(linkText = "CONTACT")
  private WebElement contact_link;

  @FindBy(linkText = "Flights")
  private WebElement flights_link;

  @FindBy(linkText = "Hotels")
  private WebElement hotels_link;

  @FindBy(linkText = "Car Rentals")
  private WebElement carRentals_link;

  @FindBy(linkText = "Cruises")
  private WebElement cruises_link;

  @FindBy(linkText = "Destinations")
  private WebElement destinations_link;

  @FindBy(linkText = "Vacations")
  private WebElement vacations_link;

  @FindBy(xpath = "//iframe[contains(@name,'google_ads_iframe') or contains(@title,'3rd party ad content')]")
  private WebElement advertisement_frame;

  @FindBy(xpath = "//iframe[@id='ad_iframe']")
  private WebElement adInner_frame;

  @FindBy(xpath = "//*[@id='dismiss-button' or text()='Close']")
  private WebElement closeAd_button;

  public void clickSignOn_link() {
    waitAndClickWebElement(signOn_link);
    handleAd();
  }

  public void clickRegister_link() {
    waitAndClickWebElement(register_link);
    handleAd();
  }

  public void clickSupport_link() {
    waitAndClickWebElement(support_link);
    handleAd();
  }

  public void clickContact_link() {
    waitAndClickWebElement(contact_link);
    handleAd();
  }

  public void clickFlights_link() {
    waitAndClickWebElement(flights_link);
    handleAd();
  }

  public void clickHotels_link() {
    waitAndClickWebElement(hotels_link);
    handleAd();
  }

  public void clickCarRentals_link() {
    waitAndClickWebElement(carRentals_link);
    handleAd();
  }

  public void clickCruises_link() {
    waitAndClickWebElement(cruises_link);
    handleAd();
  }

  public void clickDestinations_link() {
    waitAndClickWebElement(destinations_link);
    handleAd();
  }

  public void clickVacations_link() {
    waitAndClickWebElement(vacations_link);
    handleAd();
  }

  public void handleAd() {
    if (driver.getCurrentUrl().endsWith("google_vignette")) {
      waitAndSwitchToFrameByWebElement(advertisement_frame);
      try {
        closeAd_button.click();
      } catch (Exception e) {
        System.out.println("Unable to close Ad! Switching to Inner frame!!");
        waitAndSwitchToFrameByWebElement(adInner_frame);
        System.out.println("Switched to inner frame successfully");
        waitAndClickWebElement(closeAd_button);
        System.out.println("Closed the ad!!!");
        switchToDefaultContent();
      }
    }
  }
}
