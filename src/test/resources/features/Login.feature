Feature: Login
  Simple login page that takes a username and password

  @NormalLogin
  Scenario: Normal Login
    Given I have access to the SwagLabs website
    And I have a normal username and password
    And I enter the normal username into the username field and the password in the password field
    When I initiate a login
    Then The resulting page should be that of a logged in user


  @LockedOutUser
  Scenario: Locked Out User
    Given I have access to the SwagLabs website
    And I have a locked out username and their password
    And I enter the locked out username in the username field and the password in the password field
    When I initiate a login
    Then The browser URL will not change and an error message will be displayed

  @ProblemUser
  Scenario: Problem User
    Given I have access to the SwagLabs website
    And I have a normal username and password
    And I enter the normal username into the username field and the password in the password field
    When I initiate a login
    Then The resulting page should be that of a logged in user with issues regarding product images


  @PerformanceIssueUser
  Scenario: Performance Issue User
    Given I have access to the SwagLabs website
    And I have a normal username and password
    And I enter the normal username in the username field and the password in the password field
    When I initiate a login
    Then The resulting outcome should be a seeming performance issue which is resolved after a 5 second wait

  @InvalidUserDetails
  Scenario: Invalid User Details
    Given I have access to the SwagLabs website
    And I have an incorrect username and incorrect password
    And I enter the incorrect username into the username field and incorrect password into the password field
    When I initiate a login
    Then The browser URL will not change and an error message will be displayed

  @InvalidUsername
  Scenario: Invalid Username
    Given I have access to the SwagLabs website
    And I have an incorrect username and correct password
    And I enter the incorrect username into the username field and correct password into the password field
    When I initiate a login
    Then The browser URL will not change and an error message will be displayed

  @InvalidPassword
  Scenario: Invalid Password
    Given I have access to the SwagLabs website
    And I have an correct username and incorrect password
    And I enter the correct username into the username field and incorrect password into the password field
    When I initiate a login
    Then The browser URL will not change and an error message will be displayed