package com.feudaloverlords.swaglabs.stepdefs;

import com.feudaloverlords.swaglabs.pom.*;
import com.feudaloverlords.swaglabs.utilities.DriverFactory;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class InventoryStepDefs {

    private static HomePage homePage;
    private static InventoryPage inventoryPage;
    private CartPage cartPage;
    private static WebDriver webDriver;

    @Before
    public void setup() {
        webDriver = DriverFactory.get();
        homePage = new HomePage(webDriver);
    }

    public static void main(String[] args) {
        webDriver = DriverFactory.get();
        homePage = new HomePage(webDriver);
        inventoryPage = homePage.login(User.STANDARD);
        System.out.println(inventoryPage.getCurrentUrl());
    }

    @Given("I am in the inventory page")
    public void ImInTheInventoryPage() {
        inventoryPage = homePage.login(User.STANDARD);
    }
    @When("I click on the Add to cart button for an item")
    public void IClickOnTheAddToCartButton() {
        inventoryPage.
    }


}
