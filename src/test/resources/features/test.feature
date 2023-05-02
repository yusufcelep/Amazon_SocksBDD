@smoke
Feature: As a customer, I want to buy socks on Amazon.

  Scenario: I want to buy socks on Amazon.
    Given Guest user is on the Amazon HomePage
    When Search for "Socks"
    And Click on first item tile
    And Add item into cart
    Then Proceed to check out
