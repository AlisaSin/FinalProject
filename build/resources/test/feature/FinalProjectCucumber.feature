@SmokeTest
@1a.lv

Feature: Testing 1a.lv page functionality

  Scenario: 1a.lv page functionality

    Given I open base url
    Then I validate that page is loaded
    Then I press accept cookies button
    When I fill key word any and i press submit button
    And I chose product brand logitech
    And I choose filter most popular
    And I choose product computer mouse Logitech MX Anywhere 3 pink
    And I add this product to cart
    And I get price of this product
    And I go to the shopping cart
    When I press proceed button
    And I fill email testemail@testemail.lv and press submit button
    And I chose get order in office
    And I chose current office
    Then I fill user info name Alisa last name Test phone number 22222222
    And I press proceed button two times
    And I chose pay with cash
    Then I remember user information in the order
    And Validate that user information in the order equals user information what i fill
    Then I remember final product price
    And Validate that price in product info and in cart is the same

