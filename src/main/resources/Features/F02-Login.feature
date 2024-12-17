@Regression
Feature: user login To The System
    Scenario: User Login With Valid Data
      Given user click on login icon
      And user Enter Email
      And Enter Password
      And user click on remmber me
      Then click on Log in button
