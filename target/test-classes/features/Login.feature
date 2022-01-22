Feature: application login

  Scenario: Home Page Default Login
  
   Given User is on Yatra home Page
    When User login to yatra Page with Username and Password
    Then User should be able to Login
    And On the home page It desplayed as logged in user
