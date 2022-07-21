@xxx
Feature: As a user should book a room for events

  Scenario: USer should book a room

    Given User should go to login page
    When User given the username as "daldie7l@seattletimes.com" and password "ruthannjohnes"
    And User should click the "Yale" room
    And User should click the hunt button
    And User should clicks the calendar image
    And User should clicks the year and month button
    And User Should clicks the <2022> button
    And User should clicks the "JUL" month
    And User should selects the day <24>
    And User should clicks the start time
    And User should select the start time from "8:00am"
    And User should clicks the end time
    And User should selects the end time to "10:00am"
    And User should clicks the search button
    And User should clicks the book button for "Yale" room
    And User should clicks the confirm button
    Then User should see the yey, you got it text on the page
