Feature: Users should be able to see content of the OverflowMenu
  Background: User is already in the log in page

  @us6
  Scenario Outline: Verify that users see “view, edit, delete” options when they hover the mouse
  over the overflow menu
    Given the user logged in as "<userType>"
    When user is on the "Fleet" on "Vehicles" page
    When user hover the mouse over the three dots
    Then user can see folowing options displayed
      | View   |
      | Edit   |
      | Delete |

    Examples:
      | userType      |
      | driver        |
      | store manager |
     | sales manager |
