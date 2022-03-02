package com.feudaloverlords.swaglabs.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs {
    private String username;
    private String password;
    
    @Given("I am on the login page")
    public void iAmOnTheLoginPage() {

    }


    @When("I click LOGIN")
    public void iClickLOGIN() {


    }


    @And("I enter {string} and {string} into the login form")
    public void iEnterAndIntoTheLoginForm(String username, String password) {
        this.password = password;
        this.username = username;
    }

    @Then("The result should be {int}")
    public void theResultShouldBeResult(int arg1) {

    }

    @And("I enter {string} and {string} into the login form")
    public void iEnterAndIntoTheLoginForm(String arg0, String arg1) {
    }
}
