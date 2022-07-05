@3
Feature: user should kontakt with Imad

  Scenario: User should be able to contact with Imad with Jetzt Afragen
    Given the user on the login page
    When the user clicks Jetzt Anfragen button
    Then the user should be on the kontakt page


  Scenario: User should be able to contact with Imad with Kontakt
    Given the user on the login page
    When the user clicks Kontaktt button
    Then the user should be on the kontakt page

  Scenario: User should be able to contact with Imad with Fragen
    Given the user on the login page
    When the user clicks Fragen button
    Then the user should be on the kontakt page


