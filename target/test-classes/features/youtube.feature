
  Feature: User should be able to listen the music

    @youtube
    Scenario: Sevda Cicegi
      Given the user on the Youtube main page
      When the user clicks "Sevda Cicegi"
      Then the user should be able to listen this music
