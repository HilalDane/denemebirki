@3
Feature: Contact with Kontakt Page
  @4
  Scenario: User should be able to send a Message

    Given the user on the login page
    When the user clicks Kontakt button
    And the user fill the empty fields
    Then the user should be able to send Emaill
