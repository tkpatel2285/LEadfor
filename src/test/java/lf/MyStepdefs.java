package lf;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class MyStepdefs extends Utils {
    HomePage homepage = new HomePage();
    RegisterPage reg = new RegisterPage();
    LogInButton login = new LogInButton();

    @Given("^user is on the home page$")
    public void userIsOnTheHomePage() { }

    @When("^user click register Button$")
    public void userClickRegisterButton() {
        click_Element(By.linkText("Register"));
    }

    @And("^user needs to select gender$")
    public void userNeedsToSelectGender() { click_Element(By.id("gender-male")); }

    @And("^user provide first name,last name and date of birth$")
    public void userProvideFirstNameLastNameAndDateOfBirth() { reg.names(); }

    @And("^user provide Email address,company Name,$")
    public void userProvideEmailAddressCompanyName() {
        reg.emailCompany();
    }

    @And("^user select newsletter$")
    public void userSelectNewsletter() { click_Element(By.id("Newsletter")); }

    @And("^user enter password and reenter password$")
    public void userEnterPasswordAndReenterPassword() {
        reg.passwordAndRenterPassword();
    }

    @And("^user needs to click on Register Page$")
    public void userNeedsToClickOnRegisterPage() {
        click_Element(By.id("register-button"));
    }

    @Then("^user will see welcome message$")
    public void userWillSeeWelcomeMessage() {
        reg.registerSuccessMessage();
    }


    @When("^user  enter valid username and password click on login button$")
    public void userEnterValidUsernameAndPasswordClickOnLoginButton() {

    }

    @Then("^user see welcome message$")
    public void userSeeWelcomeMessage() {
        login.userDetail();
    }
}

