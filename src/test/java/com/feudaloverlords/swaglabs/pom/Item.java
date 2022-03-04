package com.feudaloverlords.swaglabs.pom;

import org.openqa.selenium.By;

public enum Item {
    BIKE_LIGHT(
            0,
            "Sauce Labs Bike Light",
            "A red light isn't the desired state in testing but it sure helps when riding your bike at night. Water-resistant with 3 lighting modes, 1 AAA battery included.",
            "/static/media/bike-light-1200x1500.a0c9caae.jpg",
            9.99,
            "sauce-labs-bike-light"
    ), BOLT_T_SHIRT(
            1,
            "Sauce Labs Bolt T-Shirt",
            "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather gray with red bolt.",
            "/static/media/bolt-shirt-1200x1500.c0dae290.jpg",
            15.99,
            "sauce-labs-bolt-t-shirt"
    ), ONESIE(
            2,
            "Sauce Labs Onesie",
            "Rib snap infant onesie for the junior automation engineer in development. Reinforced 3-snap bottom closure, two-needle hemmed sleeved and bottom won't unravel.",
            "/static/media/red-onesie-1200x1500.1b15e1fa.jpg",
            7.99,
            "sauce-labs-onesie"
    ), TEST_ALL_THE_THINGS_T_SHIRT_RED(
            3,
            "Test.allTheThings() T-Shirt (Red)",
            "This classic Sauce Labs t-shirt is perfect to wear when cozying up to your keyboard to automate a few tests. Super-soft and comfy ringspun combed cotton.",
            "/static/media/red-tatt-1200x1500.e32b4ef9.jpg",
            15.99,
            "test.allthethings()-t-shirt-(red)"
    ), BACKPACK(
            4,
            "Sauce Labs Backpack",
            "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.",
            "/static/media/sauce-backpack-1200x1500.34e7aa42.jpg",
            29.99,
            "sauce-labs-backpack"
    ), FLEECE_JACKET(
            5,
            "Sauce Labs Fleece Jacket",
            "It's not every day that you come across a midweight quarter-zip fleece jacket capable of handling everything from a relaxing day outdoors to a busy day at the office.",
            "/static/media/sauce-pullover-1200x1500.439fc934.jpg",
            49.99,
            "sauce-labs-fleece-jacket"
    );

    final int ID;
    final String
            NAME,
            DESCRIPTION,
            IMG_SOURCE,
            ADD_PREFIX = "add-to-cart-",
            REMOVE_PREFIX = "remove-";
    final double PRICE;
    final By
            BY_ADD,
            BY_REMOVE;

    Item(int id, String name, String description, String imgSource, double price, String buttonId) {
        ID = id;
        NAME = name;
        DESCRIPTION = description;
        IMG_SOURCE = imgSource;
        PRICE = price;
        BY_ADD = new By.ById((ADD_PREFIX + buttonId));
        BY_REMOVE = new By.ById((REMOVE_PREFIX + buttonId));
    }
}
