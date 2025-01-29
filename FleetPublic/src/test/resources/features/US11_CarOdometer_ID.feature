@us11
Feature: Users should be able to view car odometer info on the Vehicles Odometer page



  Scenario Outline: Verify that Store and Sales managers see the error message “You do not have
  permission to perform this action.” when they click the Vehicle Odometer module.
    Given the user logged in as "<userType>"
    When user is on the "Fleet" on "Vehicle Odometer" page
    Then user can see the error message "You do not have permission to perform this action."

    Examples:
      |userType|
      |sales manager|
      |store manager|

  Scenario: Verify that Drivers see the default page as 1.
    Given the user logged in as "driver"
    When user is on the "Fleet" on "Vehicle Odometer" page
    Then user can see the default page as 1

  Scenario: Verify that Drivers see the View Per Page as 25 by default.
    Given the user logged in as "driver"
    When user is on the "Fleet" on "Vehicle Odometer" page
    Then user can see the View Per Page as 25 by default.
