#language: en

@scenario1
Feature: Login
  As a potencial user, I would like to make a login in Facebook to see my Facebook


  Scenario: Facebook login
    Given that the user accessed the site
    When the user clicks on "UserName" and types the username
    And the user clicks on "UserPassword" and types the password
    And the user clicks on "EnterButton"
    Then the user can make a login
