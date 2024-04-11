Feature: Hotel webpage of MakeMyTrip

  @regression
  Scenario: (6) To verify "Filters" in hotel webpage
    Given the user navigates to page
    Then user close the Ads
    When user click the Hotel icon
    And user enter city, property name or location value "Manali"
    And user select a valid date from CHECK-IN (value="May 13 2024")
    And user select a CHECK-OUT (value="May 15 2024") calendar.
    Then user check for the values in Adult (Value="5") list box.
    And user click the search button
    And user check the filter button

  @regression
  Scenario: (17) To verify working of check-in and check-out calender of hotels page by providing invalid input.
    Given the user navigates to page
    Then user close the Ads
    When user click the Hotel icon
    And user enter city, property name or location value "Chennai"
    And user select a valid date from CHECK-IN (value="May 25 2024")
    And user select a CHECK-OUT (value="May 24 2024") calendar should not able to select.
    Then Unable to locate element exception must arise which must be catched and a message stating "Unable to click INVALID-CHECK-OUT date : Test case passed" should be printed in the console.

  @regression
  Scenario: (18) To verify whether search works properly for invalid input in hotels page.
    Given the user navigates to page
    Then user close the Ads
    When user click the Hotel icon
    And user enter city, property name or location value "Chennai"
    And user select a valid date from CHECK-IN (value="May 05 2024")
    And user select a CHECK-OUT (value="May 27 2024") calendar.
    And user select for the values in room (Value="1") list box.
    Then user check for the values in Adult (Value="10") list box.
    And user click price option is "0-1500" selected
    And user click the search button
    And user navigate to the next page
    And validate a Message "We couldn’t find any properties matching the criteria. Please remove the filters applied and try again." should be displayed or not.
