
Feature: Gmail Login
 
 
   Scenario: verify after entering valid email and password gmail login successfull
     Given User should be registered
     When open gmail login page,enter valid credentials
     Then Gmail login should be successfull
    
