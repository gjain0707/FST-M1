@activity1_4
Feature: LoginTest with data

Scenario: Testing Login with credentials
    Given User is on Login page
    When User enters "admin" and "password"
    Then Read the page title and confirmation message
    And Close the Browser
