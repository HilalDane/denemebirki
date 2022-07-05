Feature: Login Page

 @start
  Scenario: User should be able to send Email

    Given the user on the login page
    When the user fill the empty field
    And the user click the Senden button
    Then the user should be able to send Email

