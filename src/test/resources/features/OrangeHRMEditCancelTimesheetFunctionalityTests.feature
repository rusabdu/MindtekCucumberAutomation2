@OMT-7930
Feature: Editing and Canceling Timesheet Functionality

  Scenario: Validating Edit and Reset Timesheet Functionality
    Given user navigates to the OrangeHRM application
    When user gives username "Admin" and password "admin123"
    Then user selects time header and clicks on Timesheet dropdown and clicks on My Timesheet option
    And user navigates to the edit page by clicking on edit button
    And user clicks on reset button

