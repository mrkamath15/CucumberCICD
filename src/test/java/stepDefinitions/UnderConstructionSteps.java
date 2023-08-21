package stepDefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import utility.DriverFactory;

public class UnderConstructionSteps extends DriverFactory {

    @Then("under construction page is displayed")
    public void under_construction_page_is_displayed() {
        Assert.assertTrue(underConstructionModule.isUnderConstructionLabelDisplayed());
        Assert.assertTrue(underConstructionModule.isBackToHomeButtonDisplayed());
    }
}
