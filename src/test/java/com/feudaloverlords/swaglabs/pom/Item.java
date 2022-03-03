package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;

public enum Item {
    BACKPACK(
            "Sauce Labs Backpack",
            "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
            "/static/media/sauce-backpack-1200x1500.34e7aa42.jpg",
            29.99,
            "add-to-cart-sauce-labs-backpack"
    ),
    BIKE_LIGHT(
            "Sauce Labs Bike Light",
            "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.",
            "/static/media/bike-light-1200x1500.a0c9caae.jpg",
            9.99,
            "add-to-cart-sauce-labs-bike-light"
    ),
    BOLT_T_SHIRT(
            "Sauce Labs Bolt T-Shirt",
            "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.",
            "/static/media/bolt-shirt-1200x1500.c0dae290.jpg",
            15.99,
            "add-to-cart-sauce-labs-bolt-t-shirt"
    ),
    FLEECE_JACKET("Sauce Labs Fleece Jacket",
            "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.",
            "/static/media/sauce-pullover-1200x1500.439fc934.jpg",
            49.99,
            "add-to-cart-sauce-labs-fleece-jacket"
    ),
    ONESIE(
            "Sauce Labs Onesie",
            "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
            "/static/media/red-onesie-1200x1500.1b15e1fa.jpg",
            7.99,
            "add-to-cart-sauce-labs-onesie"
    ),
    TEST_ALL_THE_THINGS_T_SHIRT_RED(
            "Test.allTheThings() T-Shirt (Red)",
            "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.",
            "/static/media/red-tatt-1200x1500.e32b4ef9.jpg",
            15.99,
            "add-to-cart-test.allthethings()-t-shirt-(red)"
    );

    final String
            NAME,
            DESCRIPTION,
            IMG_SOURCE;
    final double PRICE;
    final By BY;

    Item(String name, String description, String imgSource, double price, String addToCartButtonId) {
        NAME = name;
        DESCRIPTION = description;
        IMG_SOURCE = imgSource;
        PRICE = price;
        BY = new By.ById(addToCartButtonId);
    }
}
