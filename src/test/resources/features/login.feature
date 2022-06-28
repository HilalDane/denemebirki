@login
Feature: User should be able to log in

  Background:
    Given the user on the login page

    @1
  Scenario:
    When user hover over Karriere button
    Then the user should be able to see 'Test Automation Engineer'

      @2
    Scenario: 
      When the user clicks Kontakt button
      Then the user should be able to see KONTAKTIEREN SIE UNS
        And the user drags the page down
        Then the user should be able to see kontaktperson is Imad