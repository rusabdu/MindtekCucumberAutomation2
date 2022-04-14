@regression @OMT-7925
Feature: Validating Etsy Application search and filter functionalities

    Background: Repeated first steps in each scenario
    Given user navigates to the Etsy application
    When user searches for "carpet"

  Scenario: Validating price rang filter functionality for search items

    And user applies price filter over 1000
    Then user validates the items price is equal or over 1000.00
@OMT-7926
    Scenario: Validating search results
      Then user validates search result items contain keyword "carpet" or "rug"

