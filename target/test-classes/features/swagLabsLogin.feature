Feature: Login

#  Background:Setting Up the browser
#    Given I am on the login page

  @Login
  Scenario Outline:Getting to Inventory page from login page
    Given I am on the login page
    And I enter "<username>" and "<password>" into the login form
    When I click LOGIN
    Then The result should be <result>

    Examples:
      |username                 |password      |result|
      |"standard_user"          |"secret_sauce"|1     |
      |"locked_out_user"        |"secret_sauce"|0     |
      |"problem_user"           |"secret_sauce"|1     |
      |"performance_glitch_user"|"secret_sauce"|1     |


