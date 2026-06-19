# Banking BDD Automation Framework

## Project Overview

This repository contains a production-style but fresher-friendly BDD automation framework using Java, Selenium WebDriver, Cucumber, TestNG, Maven, WebDriverManager, and Jenkins.

## Architecture

- Page Object Model (POM)
- Reusable `BasePage`
- `DriverFactory` for thread-safe drivers
- `ConfigReader` to load properties
- `Hooks` class for lifecycle management
- `Step Definitions` and `Feature` files
- `TestRunner` using Cucumber + TestNG

## Folder Structure

- `pom.xml`
- `testng.xml`
- `Jenkinsfile`
- `README.md`
- `src/main/java/com/bank/framework/driver`
- `src/main/java/com/bank/framework/pages`
- `src/main/java/com/bank/framework/config`
- `src/main/java/com/bank/framework/utils`
- `src/test/java/com/bank/framework/stepdefinitions`
- `src/test/java/com/bank/framework/hooks`
- `src/test/java/com/bank/framework/runners`
- `src/test/resources/features`
- `src/test/resources/testdata`

## Setup Instructions

1. Install JDK 21 and Maven.
2. Open the project folder in VS Code.
3. Run:

```bash
mvn clean test
```

## Maven Commands

- `mvn clean test` : Run the test suite

## Jenkins Integration

The `Jenkinsfile` runs `mvn clean test` and archives the generated Cucumber reports and screenshots.

## Reporting

- HTML report: `target/cucumber-reports.html`
- JSON report: `target/cucumber.json`
- Screenshots on failures: `target/screenshots`

## Interview Explanation

- `DriverFactory` uses ThreadLocal for parallel-safe drivers.
- `BasePage` centralizes common page actions.
- `Hooks` manages browser setup and teardown.
- Keep step definitions simple and reusable.
