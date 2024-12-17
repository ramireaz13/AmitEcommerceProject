#@regression
Feature: user can register to the system
  Scenario: user register to the system with valid data
    Given user click to register icon
    When enter the first name
    And enter the last name
    And enter the email
    And enter the password
    And enter the Confirm password
    Then click on Register button
