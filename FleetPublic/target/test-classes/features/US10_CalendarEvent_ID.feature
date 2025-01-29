@us10
Feature: Users should be able to type into the Description field upon event
  creation


  Scenario Outline: Verify that users can type messages in to the Description
  field on the Calendar Events page.
    Given the user logged in as "<userType>"
    When user is on the "Activities" on "Calendar Events" page
    And user clicks on the Create Calendar event button
    And user checks the repeat checkbox
    And user types "This is my message" in to the Desription Field
    Then "This is my message" is displayed
    Examples:
      | userType      |
      | sales manager |
      | store manager |
      | driver        |
