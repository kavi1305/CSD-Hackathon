Feature: Train webpage of MakeMyTrip

  @regression
  Scenario: (9) To verify the enability of Live Train-Status radio button field from Train webpage.
    Given the user navigates to page
    Then user close the Ads
    When user click the train icon
    And user select the Live Train Status
    Then user check the Live Train Status is enabled or not

  @regression
  Scenario: (10) To verify the SEARCH functionality of Trains by providing valid inputs
    Given the user navigates to page
    Then user close the Ads
    When user click the train icon
    And user enter from "Delhi"
    And user enter to "chennai"
    And user enter Departure "May 05 2024"
    And user enter class as "2A"
    Then Click on Search button
    And check the Navigating Page

  @regression
  Scenario: (19) To verify working of check PNR status in train page.
    Given the user navigates to page
    Then user close the Ads
    When user click the train icon
    And PNR status button should be clicked by user
    And user enter the number "1234567890"
    And user click the check status button
    Then Navigate to next page and a message "This PNR is either not generated or flushed"  should be shown.

  @regression
  Scenario: (20) To verify working of live train status in trains page.
    Given the user navigates to page
    Then user close the Ads
    When user click the train icon
    And user select the Live Train Status
    And user enter the train number "12635"
    And user click the today option
    Then Navigated to next page  and live train status of vaigai express is displayed.
