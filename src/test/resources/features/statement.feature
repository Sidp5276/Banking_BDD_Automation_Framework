Feature: Account Statement Module
  Users should be able to view and download account statements

  Scenario: View Statement
    Given user is on statement page
    When user filters statement from "2026-01-01" to "2026-06-01"
    Then statement should be visible

  Scenario: Filter By Date
    Given user is on statement page
    When user filters statement from "2026-05-01" to "2026-05-31"
    Then statement should be visible

  Scenario: Download Statement
    Given user is on statement page
    When user downloads statement
    Then statement should be visible

  Scenario: No Transactions Scenario
    Given user is on statement page
    When user filters statement from "1900-01-01" to "1900-12-31"
    Then no transactions message "No transactions found" is shown
