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
        return Double.parseDouble(getDoubleString("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]"));
    }

    public double getTotal (WebDriver webDriver){
        return Double.parseDouble(getDoubleString("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[6]"));
    }

    public double getTax (WebDriver webDriver){
        return Double.parseDouble(getDoubleString("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[7]"));
    }

    private String getDoubleString(String xpath)
    {
        String extracted = String.valueOf(driver.findElement(new By.ByXPath(xpath)).getText());
        String[] split = extracted.split("\\$");
        return split[1];
    }



}
