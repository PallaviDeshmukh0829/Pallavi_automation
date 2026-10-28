Feature: Orange Website Login Functionality

  Scenario: Verify login successfull with valid information
    Given Launch Orange website
    When enter username as "Admin" also enter password as "admin123"
    And click on login button of Orangehrm Website
    Then orangehrm login should be successfull
