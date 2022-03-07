package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InventoryPage extends ShopPage{

    public enum SortOption {
        NAME_A_TO_Z(
                "az",
                new Item[] {Item.BACKPACK, Item.BIKE_LIGHT, Item.BOLT_T_SHIRT, Item.FLEECE_JACKET, Item.ONESIE, Item.TEST_ALL_THE_THINGS_T_SHIRT_RED}
        ),
        NAME_Z_TO_A(
                "za",
                new Item[] {Item.TEST_ALL_THE_THINGS_T_SHIRT_RED, Item.ONESIE, Item.FLEECE_JACKET, Item.BOLT_T_SHIRT, Item.BIKE_LIGHT, Item.BACKPACK}
        ),
        PRICE_LOW_TO_HIGH(
                "lohi",
                new Item[] {Item.ONESIE, Item.BIKE_LIGHT, Item.BOLT_T_SHIRT, Item.TEST_ALL_THE_THINGS_T_SHIRT_RED, Item.BACKPACK, Item.FLEECE_JACKET}
        ),
        PRICE_HIGH_TO_LOW(
                "hilo",
                new Item[] {Item.FLEECE_JACKET, Item.BACKPACK, Item.BOLT_T_SHIRT, Item.TEST_ALL_THE_THINGS_T_SHIRT_RED, Item.BIKE_LIGHT, Item.ONESIE}
        );

        private static final String CSS_SELECTOR = "option[value=\"%s\"]";
        final String OPTION_VALUE;
        final Item[] ITEMS;
        SortOption(String optionValue, Item[] items) {
            OPTION_VALUE = optionValue;
            ITEMS = items;
        }
    }

    private static final By
            BY_IMG = new By.ByClassName("inventory_item_img"),
            BY_ITEM_NAME = new By.ByClassName("inventory_item_name"),
            BY_DROPDOWN_SORT = new By.ByClassName("product_sort_container");
    private static final String IMG_SOURCE_DOG = "/static/media/sl-404.168b1cce.jpg";

    public InventoryPage(WebDriver driver) {
        super(driver, "https://www.saucedemo.com/inventory.html");
    }

    /**
     * Checks if all item images are the dog.
     * @return true if all images are the dog, otherwise false.
     */
    public static boolean areAllImagesTheDog() {
        return driver.findElements(BY_IMG).stream()
                .filter(w -> w.getTagName().equals("img"))
                .allMatch(w -> w.getAttribute("src").contains(IMG_SOURCE_DOG));
    }

    /**
     * Clicks on the given sort option.
     * @param so The sort option to select.
     */
    public void sort(SortOption so) {
        (new Select(driver.findElement(BY_DROPDOWN_SORT))).selectByValue(so.OPTION_VALUE);
    }

    /**
     * Checks if the order of the items on the page is correct according to the given SortOption.
     * @param so The SortOption defining the expected order.
     * @return true if the order is correct, otherwise false.
     */
    public boolean isOrderCorrect(SortOption so) {
        List<WebElement> items = driver.findElements(BY_ITEM_NAME);
        for(int i = 0; i < items.size(); i++) if(!so.ITEMS[i].NAME.equals(items.get(i).getText())) return false; // else
        return true;
    }
}
