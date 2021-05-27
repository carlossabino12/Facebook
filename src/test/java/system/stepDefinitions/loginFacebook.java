package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import system.setup.DriverManeger;
import system.page.FacebookLoginPage;

public class loginFacebook {

    private WebDriver driver;

    FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
    DriverManeger driverManeger = new DriverManeger();

    @Given("that the user accessed the site")
    public void thatTheUserAccessedTheSite() {
        DriverManeger.getDriver();

    }
    @When("the user clicks on {string} and types the username")
    public void theUserClicksOnAndTypesTheUsername(String string) {

        facebookLoginPage.typeEmailOrTelefone();
    }
    @And("the user clicks on {string} and types the password")
    public void theUserClicksOnAndTypesThePassword(String string) {

        facebookLoginPage.typePassword();
    }
    @And("the user clicks on {string}")
    public void theUserClicksOn(String string) {
        facebookLoginPage.clickEnterBtn();
    }
    @Then("the user can make a login")
    public void theUserCanMakeALogin() {

    }

}
