

@login
Feature: user should be able to login successfully
  Scenario: User should be able to login
    Given user is on the home page
    When  user  enter valid username and password click on login button
    Then user see welcome message
