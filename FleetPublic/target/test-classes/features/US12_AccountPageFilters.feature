Feature: Users should be able to filter customer's

  @wip
  Scenario Outline: Verify that users see 8 filter items on the Accounts page
  Expected filter names: Account Name, Contact Name, Contact Email, Contact
  Phone, Owner, Business Unit, Created At, Updated At
    Given the user logged in as "<userType>"
    When user is on the "Customers" on "Accounts" page
    Then user can see filter items below
    |Account name|
    |Contact name|
    |Contact email|
    |Contact phone|
    |Owner|
    |Business Unit|
    |Created At|
    |Updated At|

    Examples:
    |userType|
    |sales manager|
    |store manager|
    