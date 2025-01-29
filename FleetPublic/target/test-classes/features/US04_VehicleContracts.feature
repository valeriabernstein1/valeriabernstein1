Feature: User should access to the Vehicle Contracts Page.


    Given the user is on the login page

  @userstory4

  Scenario Outline: Verify that Store Manager and sales Manager can access Vehicle Contracts Page
    When the user logged in as "<userType>"
Then user see the title name All - Vehicle Contract - Entities - System - Car - Entities - System

    Examples:

      | userType      |
      | sales manager |
     # | store manager |
  @userstory4
Scenario Outline: Verify that drivers cannot access vehicle contracts page
  Given the user logged in as "<userType>"
  When driver navigates to the Vehicle Contracts page
  Then user sees the message "You do not have permission to perform this action."
  Examples:
    | userType      |
    | driver |






