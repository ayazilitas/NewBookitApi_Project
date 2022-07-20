@mit
  Feature: As a user, I should be able to schedule a meeting and I should be able to select where room is reserved

Scenario: Verification of making reservation of MIT room

  Given User enters email as " " and password as " "
  When User clicks on Sign-in button
  Then System should be able to display "map" and "light-side" header on the left side
  Then User should  be able to see "mit" room on the map
  When User clicks on the "mit" label
  Then System should be able to display "map" and "light-side" header on the left side
  When User clicks on "hunt" menu
  Then System should be able to display "hunt for spot" and "pick date and time" header on the left side
