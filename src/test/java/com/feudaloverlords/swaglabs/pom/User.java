package com.feudaloverlords.swaglabs.pom;

/**
 * The enum that defines the possible users of the site.
 */
public enum User {
    STANDARD("standard_user"),
    LOCKED_OUT("locked_out_user"),
    PROBLEM("problem_user"),
    PERFORMANCE_GLITCH("performance_glitch_user"),
    INCORRECT_USERNAME("incorrect_username"),
    INCORRECT_PASSWORD("standard_user", "incorrect_password"),
    INCORRECT_USERNAME_AND_PASSWORD("incorrect_username", "incorrect_password");

    final String USERNAME;
    final String PASSWORD;

    User(String username) {
        this(username, "secret_sauce");
    }
    User(String username, String password) {
        USERNAME = username;
        PASSWORD = password;
    }
}
