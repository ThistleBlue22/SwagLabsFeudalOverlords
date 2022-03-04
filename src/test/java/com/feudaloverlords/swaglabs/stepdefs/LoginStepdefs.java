package com.feudaloverlords.swaglabs.stepdefs;

import com.feudaloverlords.swaglabs.pom.HomePage;
import com.feudaloverlords.swaglabs.pom.Page;
import com.feudaloverlords.swaglabs.pom.User;
import com.feudaloverlords.swaglabs.utilities.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class LoginStepdefs {
    private HomePage page;
    private WebDriver driver = DriverFactory.get();
    private User user;

    @Given("I have access to the SwagLabs website")
    public void iHaveAccessToTheSwagLabsWebsite() {
        page = new HomePage(driver);
    }

    @And("I have a normal username and password")
    public void iHaveANormalUsernameAndPassword() {
        user = User.STANDARD;
    }

    @When("I initiate a login")
    public void iInitiateALogin() {
        page.login(user);
    }

    @And("I have the username problem_user and password for that account")
    public void iHaveTheUsernameProblem_userAndPasswordForThatAccount() {
        user = User.PROBLEM;
    }

    @And("I have the username performance_glitch_user and password for that account")
    public void iHaveTheUsernamePerformance_glitch_userAndPasswordForThatAccount() {
        user = User.PERFORMANCE_GLITCH;
    }
    @And("I have a locked out username and their password")
    public void iHaveALockedOutUsernameAndTheirPassword() {
        user = User.LOCKED_OUT;
    }

    @And("I have an incorrect username and correct password")
    public void iHaveAnIncorrectUsernameAndCorrectPassword() {
    }

    @And("I have an correct username and incorrect password")
    public void iHaveAnCorrectUsernameAndIncorrectPassword() {
    }

    @Then("The browser URL will not change and an error message will be displayed")
    public void theBrowserURLWillNotChangeAndAnErrorMessageWillBeDisplayed() {
        Assertions.assertEquals("https://www.saucedemo.com/", driver.getCurrentUrl());

    }

    @Then("The resulting page should be that of a logged in user with issues regarding product images")
    public void theResultingPageShouldBeThatOfALoggedInUserWithIssuesRegardingProductImages() {

    }
    @Then("The resulting page should be that of a logged in user")
    public void theResultingPageShouldBeThatOfALoggedInUser() {
        Assertions.assertTrue(Page.isCookieSet(driver));
    }

    @Then("The resulting outcome should be a seeming performance issue which is resolved after a five second wait")
    public void theResultingOutcomeShouldBeASeemingPerformanceIssueWhichIsResolvedAfterASecondWait() {

    }

    @And("I have an incorrect username and incorrect password")
    public void iHaveAnIncorrectUsernameAndIncorrectPassword() {

    }

    @And("The browser will close")
    public void theBrowserWillClose() {
        DriverFactory.closeDriver();
    }
}
