package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.HomePage;
import utilities.DriverFactory;

public class HomePageStepdefs {
    HomePage hp = new HomePage(DriverFactory.getDriver());

    @Then("should see Home Page")
    public void shouldSeeHomePage() {
        hp.checkHomePage();
    }
}
