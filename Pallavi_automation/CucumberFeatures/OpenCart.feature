Feature: Open Cart Register form & login form

  Scenario: Verify user registration with valid credentials
    Given practice form should open
    When click on register button
    And Enter Username,first name,last name,e-mail,country,password
    Then user should be register successfully

  Scenario: verify user login with valid information
    Given login form should be open
    When click on login button
    And Enter E-mail & Password
    Then User should be login successfully
