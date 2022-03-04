package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutTwoPage extends Page {

    public enum Links implements LinksInterface {
        CANCEL {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_CANCEL).click();
                return new InventoryPage(driver);
            }
        },
        FINISH {
            @Override
            public Page getPage(WebDriver driver) {
                driver.findElement(BY_FINISH).click();
                return new CheckoutThreePage(driver);
            }
        };
        private static final By BY_CANCEL = new By.ByXPath("//*[@id=\"cancel\"]"),
                BY_FINISH = new By.ByXPath("//*[@id=\"finish\"]");
    }


    public CheckoutTwoPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/checkout-step-two.html");
    }

    public double getItemTotal (WebDriver webDriver){
        double itemTotal = Double.valueOf(driver.findElement(new By.ByClassName("summary_subtotal_label")).getText());
        return itemTotal;
    }

    public double getTotal (WebDriver webDriver){
        double total = Double.valueOf(driver.findElement(new By.ByClassName("summary_total_label")).getText());
        return total;
    }

    public double getTax (WebDriver webDriver){
        double tax = Double.valueOf(driver.findElement(new By.ByClassName("summary_tax_label")).getText());
        return tax;
    }



}
