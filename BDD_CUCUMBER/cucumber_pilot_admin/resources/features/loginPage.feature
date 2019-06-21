#Author: brajbhandari@uspto.gov
#US1111
@tag
Feature: Login to Pilot Admin application
  User should be able to login with valid crediential

  @tag1
  Scenario: Login to Pilot Admin page
    Given I am in the login page
    When I enter "username" and "password"
    And select the login button
    Then I should land to search page
