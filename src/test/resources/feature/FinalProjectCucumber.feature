@SmokeTest
@1a.lv

Feature: Testing 1a.lv page functionality

  Scenario: 1a.lv page functionality

    Given i open base url
    When i validate that page is loaded
    Then i press accept cookies button
    When i fill key word any and i press submit button
    And i chose product brand
    And i choose filter most popular
    And i choose first product
    And i add this product to cart
    And i remember price of this product
    And i go to the shopping cart
    When i press proceed button
    And i fill email testemail@testemail.lv and press submit button
    And i chose get order in office
    And i chose current office
    Then i fill user info name Alisa last name Test phone number 22222222
    And i press proceed button two times
    And i chose pay with cash
    Then i remember user information in the order
    And validate that user information in the order equals user information what i fill
    Then i remember final product price
    And validate that price in product info and in cart is the same

