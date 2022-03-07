package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOnePage extends Page {

    public enum Links implements LinksInterface {
        CANCEL {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_CANCEL).click();
                return new CartPage(driver);
            }
        },
        CONTINUE {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_CONTINUE).click();
                return new CheckoutTwoPage(driver);
            }
        };
        private static final By BY_CANCEL = new By.ByXPath("//*[@id=\"cancel\"]"),
                BY_CONTINUE = new By.ByXPath("//*[@id=\"continue\"]");


    }

    public CheckoutOnePage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-one.html");
    }

    public CheckoutTwoPage continueCheckout (String firstName, String lastName, String postCode){
        driver.findElement(By.xpath("//*[@id=\"first-name\"]")).sendKeys(firstName);
        driver.findElement(By.xpath("//*[@id=\"last-name\"]")).sendKeys(lastName);
        driver.findElement(By.xpath("//*[@id=\"postal-code\"]")).sendKeys(postCode);
        return (CheckoutTwoPage) Links.CONTINUE.getPage(driver);
    }

}
