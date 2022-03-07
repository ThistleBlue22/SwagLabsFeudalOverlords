Feature: Login
  Simple login page that takes a username and password

  @NormalLogin
  Scenario: Normal Login
    Given I have access to the SwagLabs website
    And I have a normal username and password
    When I initiate a login
    Then The resulting page should be that of a logged in user
    And The browser will close


  @LockedOutUser
  Scenario: Locked Out User
    Given I have access to the SwagLabs website
    And I have a locked out username and their password
    When I initiate a login
    Then The browser URL will not change and an error message will be displayed
    And The browser will close

  @ProblemUser
  Scenario: Problem User
    Given I have access to the SwagLabs website
    And I have the username problem_user and password for that account
    When I initiate a login
    Then The resulting page should be that of a logged in user with issues regarding product images
    And The browser will close

  @PerformanceIssueUser
  Scenario: Performance Issue User
    Given I have access to the SwagLabs website
    And I have the username performance_glitch_user and password for that account
    When I initiate a login
    Then The resulting page should be that of a logged in user
    And The browser will close

  @InvalidUserDetails
  Scenario: Invalid User Details
    Given I have access to the SwagLabs website
    And I have an incorrect username and incorrect password
    When I initiate a login
    Then The browser URL will not change and an error message will be displayed
    And The browser will close

  @InvalidUsername
  Scenario: Invalid Username
    Given I have access to the SwagLabs website
    And I have an incorrect username and correct password
    When I initiate a login
    Then The browser URL will not change and an error message will be displayed
    And The browser will close

  @InvalidPassword
  Scenario: Invalid Password
    Given I have access to the SwagLabs website
    And I have an correct username and incorrect password
    When I initiate a login
    Then The browser URL will not change and an error message will be displayed
    And The browser will close