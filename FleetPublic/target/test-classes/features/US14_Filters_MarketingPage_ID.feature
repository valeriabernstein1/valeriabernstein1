@us14
Feature: Users should be able to manage filters on
  the Marketing page


  Scenario Outline: Verify that Store and Sales managers see all 5 filter options
  as checked by default.
    Given the user logged in as "<userType>"
    When user is on the "Marketing" on "Campaigns" page
    Then the user can see five filter options as checked by default

      | Name       |
      | Code       |
      | Start Date |
      | End Date   |
      | Budget     |


    Examples:
      | userType      |
      | sales manager |
      | store manager |

  Scenario Outline: Verify that any amount of boxes can be unchecked. (Can check only 1 or multiple)
    Given the user logged in as "<userType>"
    When user is on the "Marketing" on "Campaigns" page
    Then user can uncheck any amount of checked boxes

    Examples:
      | userType      |
      | sales manager |
      | store manager |