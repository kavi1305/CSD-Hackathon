Feature: Functionality of CabPage

  @regression
  Scenario: (2) To verify the enability of OUTSTATION-ONEWAY radio button field
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    And check the radio button is enabled.

  @regression
  Scenario: (3) To verify the the functionality of "From" dropdown button of the cab webpage with invalid date
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    When user entered from "txtdsaj"
    Then check whether the entered detail is valid

  @regression
  Scenario: (4) To verify the the functionality of "To" dropdown button of the cab webpage with invalid date
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    When user enter from "Delhi"
    And user entered to "sdcdrr"
    Then check whether the entered detail is valid.

  @regression
  Scenario: (5) To verify the enability of OUTSTATION-Round-TRIP radio button field
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    When user click the Outstation Round-Trip
    Then check the radio button is enabled.

  @regression
  Scenario: (7) verify "SORTED BY" list box field from cab webpage
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    When user enter from "Delhi"
    And user enter to "Manali, Himachal Pradesh"
    And user enter Departure "Apr 21 2024"
    And user enter Pickup Time-Hours "6"
    And user enter Pickup Time-Min "30"
    And user enter Pickup Time-Meridiam "AM"
    Then Click on Apply button
    And Click on Search button
    And user select the price lowest to Highest Filter in sort option
    And check that filter is applied

  @regression
  Scenario: (8) To verify "Filters" in Cab webpage
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    When user enter from "Delhi"
    And user enter to "Manali, Himachal Pradesh"
    And user enter Departure "Apr 21 2024"
    And user enter Pickup Time-Hours "6"
    And user enter Pickup Time-Min "30"
    And user enter Pickup Time-Meridiam "AM"
    Then Click on Apply button
    And Click on Search button
    When user Check SUV cab type option in filter
    Then check that cab type filter is applied

  @regression
  Scenario: (11) To verify the the functionality of "From" dropdown button of the cab webpage with valid date
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    When user enter from "Delhi"
    And user enter to "Manali, Himachal Pradesh"
    Then check the function of Departure date with valid input "May 13 2024"

  @regression
  Scenario: (12) To verify the the functionality of "From" dropdown button of the cab webpage with invalid date
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    When user enter from "Delhi"
    And user enter to "Manali, Himachal Pradesh"
    Then check the function of Departure date with invalid input "May 13 2023"

  @regression
  Scenario: (13) To verify the functionality of Return date in "OUTSTATION-round trip" with valid date
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    When user click the Outstation Round-Trip
    And user enter from "Delhi"
    And user enter to "Manali, Himachal Pradesh"
    Then check the function of Departure date with valid input "May 13 2024"

  @regression
  Scenario: (14) To verify the functionality of Return date in "OUTSTATION-round trip" with valid date
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    When user click the Outstation Round-Trip
    And user enter from "Delhi"
    And user enter to "Manali, Himachal Pradesh"
    Then check the function of Departure date with invalid input "May 13 2023"

  @regression
  Scenario: (15) To verify that whether the distance covered for the selected is route is displayed in Cab page
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    When user enter from "Delhi"
    And user enter to "Manali, Himachal Pradesh"
    And user enter Departure "Apr 21 2024"
    And user enter Pickup Time-Hours "6"
    And user enter Pickup Time-Min "30"
    And user enter Pickup Time-Meridiam "AM"
    Then Click on Apply button
    And Click on Search button
    And check the distance coverd is displayed

  @regression
  Scenario: (16) To verify that the check box to select the car model is enabled in the cab page
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    When user enter from "Delhi"
    And user enter to "Manali, Himachal Pradesh"
    And user enter Departure "Apr 21 2024"
    And user enter Pickup Time-Hours "6"
    And user enter Pickup Time-Min "30"
    And user enter Pickup Time-Meridiam "AM"
    Then Click on Apply button
    And Click on Search button
    And check that car model is enabled
