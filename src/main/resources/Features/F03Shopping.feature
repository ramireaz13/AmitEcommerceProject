Feature: user can shopping
  Scenario: User can Select product type
    Given user login into system
    And user Select the product
    And user click add to cart
    And user click on shopping cart icon
    And user click on I agree with the terms of service
    And user click on checkout Button
    And user enter the Country
    And user enter the City
    And user enter the Address
    And user enter the Zip postal code
    And user enter the Phone number
    And click on continue button1
    And user Select the Shipping method
    And click on continue button2
    And user Select the Payment method
    And click on continue button3
    And user Select the Payment information
    And click on continue button4
    And user confirm order
    And click on confirm button
    Then your order has been successfully processed!