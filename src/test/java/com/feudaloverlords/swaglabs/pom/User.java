package com.feudaloverlords.swaglabs.pom;

/**
 * The enum that defines the possible users of the site.
 */
public enum User {
    STANDARD("standard_user"),
    LOCKED_OUT("locked_out_user"),
    PROBLEM("problem_user"),
    PERFORMANCE_GLITCH("performance_glitch_user");

    final String USERNAME;
    final String PASSWORD = "secret_sauce";

    User(String username) {
        this.USERNAME = username;
    }
}
