Feature: Fund Transfer Module
  Users should be able to transfer funds with validations

  Scenario: Successful Transfer
    Given user is on transfer page
    When user transfers "100.00" to beneficiary "Alice"
    Then transfer should be successful with message "Transfer completed"

  Scenario: Insufficient Balance
    Given user is on transfer page
    When user transfers "1000000.00" to beneficiary "Alice"
    Then transfer should fail with message "Insufficient balance"

  Scenario: Invalid Beneficiary
    Given user is on transfer page
    When user transfers "50.00" to beneficiary "Unknown"
    Then transfer should fail with message "Beneficiary not found"

  Scenario: Transfer Limit Validation
    Given user is on transfer page
    When user transfers "10000.00" to beneficiary "Alice"
    Then transfer should fail with message "Transfer limit exceeded"

  Scenario: Negative Amount Validation
    Given user is on transfer page
    When user transfers "-50" to beneficiary "Alice"
    Then transfer should fail with message "Invalid amount"
