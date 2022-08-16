Feature: Apply

  @bewerbung
  Scenario: User can apply
    Given the user on the login page
    When the user cliks Karriere button
    And the user fill  the empty field
    Then the user should be able to send apply
