package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.DriverFactory;

public class LoginPageStepdefs {
    LoginPage lp = new LoginPage(DriverFactory.getDriver());

    @Given("user is on Login Page")
    public void userIsOnLoginPage() {
        lp.checkLoginPage();
    }

    @Then("should see Logo")
    public void shouldSeeLogo() {
        lp.checkLogo();
    }

    @Then("should see Icon")
    public void shouldSeeIcon() {
        lp.checkIcon();
    }

    @Then("should see usernameBox {string}")
    public void shouldSeeUsernameBox(String str) {
        lp.checkUsernameBox(str);
    }

    @Then("should see passwordBox {string}")
    public void shouldSeePasswordBox(String str) {
        lp.checkPasswordBox(str);
    }

    @Then("should see Login Button {string}")
    public void shouldSeeLoginButton(String str) {
        lp.checkLoginButton(str);
    }

    @When("sendkeys password {string}")
    public void sendkeysPassword(String str) {
        lp.sendKeyPasswordText(str);
    }

    @When("click Login Button")
    public void clickLoginButton() {
        lp.clickLoginButton();
    }

    @Then("should see Error Message Genel {string}")
    public void shouldSeeErrorMessageGenel(String str) {
        lp.checkErrorMessageGenel(str);
    }

    @When("sendkeys username {string}")
    public void sendkeysUsername(String str) {
        lp.senkeysUsernameText(str);
    }

    @Then("should see Username Error Message {string}")
    public void shouldSeeUsernameErrorMessage(String str) {
        lp.checkUsernameErrorMessage(str);
    }

    @Then("should see Password Error Message {string}")
    public void shouldSeePasswordErrorMessage(String str) {
        lp.checkPasswordErrorMessage(str);
    }
}
