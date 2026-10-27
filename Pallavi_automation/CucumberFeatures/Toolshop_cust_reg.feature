Feature: Toolshop register


Background:
Given practice software testing should be launch

  Scenario: Verify Customer registration should be successful
    When user navigate to register page,enter firstname,lastname
    And enter date of birth,enter country
    And click on register
    Then Customer register should be successful
    
    
  Scenario: Verify Customer login should be successful
    Given practice software testing should be launch
    When user navigate to login page,enter Email,Password
    And click on login button   
    Then Customer login should be successful
