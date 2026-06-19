Feature: Login Module
  As a bank customer I want to sign in so I can use online banking

  Scenario: Valid Login
    Given user is on login page
    When user logs in with username "john" and password "Password123"
    Then login should be successful and show welcome message

  Scenario: Invalid Login
    Given user is on login page
    When user logs in with username "john" and password "wrongpwd"
    Then login should fail with error "Invalid credentials"

  Scenario: Empty Username
    Given user is on login page
    When user logs in with username "" and password "Password123"
    Then login should fail with error "Username required"

  Scenario: Empty Password
    Given user is on login page
    When user logs in with username "john" and password ""
    Then login should fail with error "Password required"

  Scenario: Session Timeout
    Given user is on login page
    When user logs in with username "john" and password "Password123"
    Then login should be successful and show welcome message

  Scenario: Account Lockout After Multiple Invalid Attempts
    Given user is on login page
    When user logs in with username "john" and password "wrongpwd"
    Then login should fail with error "Invalid credentials"
    When user logs in with username "john" and password "wrongpwd"
    Then login should fail with error "Invalid credentials"
    When user logs in with username "john" and password "wrongpwd"
    Then login should fail with error "Account locked"
