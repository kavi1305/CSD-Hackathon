Feature: Data Driven Test

  @regression
  Scenario Outline: To do the data driven test on gift card with valid and invalid mailId
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And Click on Search button
    When the user clicks on more options
    And user click the gift Cards
    Given the user is on the gift card page and selects Birthday gift
    And the user select the Email button
    And enter the required details3 "<row_val>"
    Then check the details entered is valid sender Recipient mailid "<row_val>"

    Examples: 
      | row_val |
      |       1 |
      |       2 |
      |       3 |
      |       4 |

  @regression
  Scenario Outline: To do the data driven test on the functionality of "From" dropdown button of the cab webpage with invalid date
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And user click the One-Way cab
    Then user entered driven test on from "<row_index>"

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |

  @regression
  Scenario Outline: To do the data driven test on gift card with valid and invalid Recipient Name
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And Click on Search button
    When the user clicks on more options
    And user click the gift Cards
    Given the user is on the gift card page and selects Birthday gift
    And the user select the Email button
    And enter the required details1 "<row_val>"
    Then check the details entered is valid recipient name "<row_val>"

    Examples: 
      | row_val |
      |       1 |
      |       2 |
      |       3 |
      |       4 |

  @regression
  Scenario Outline: To do the data driven test on gift card with valid and invalid mobileNo
    Given the user navigates to page
    Then user close the Ads
    And user click the Cab icon
    And Click on Search button
    When the user clicks on more options
    And user click the gift Cards
    Given the user is on the gift card page and selects Birthday gift
    And the user select the Email button
    And enter the required details2 "<row_val>"
    Then check the details entered is valid sender mobile Number "<row_val>"

    Examples: 
      | row_val |
      |       1 |
      |       2 |
      |       3 |
      |       4 |
