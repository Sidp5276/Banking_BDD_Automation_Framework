# ECommerce BDD Automation Framework

A scalable and maintainable Behavior-Driven Development (BDD) automation framework built using **Java, Selenium WebDriver, Cucumber, TestNG, Maven, and Jenkins**. This framework automates critical E-Commerce workflows such as Login, Product Selection, Cart Validation, and Checkout while supporting parallel execution and reusable test architecture.

---

## 🚀 Tech Stack

* Java 21
* Selenium WebDriver 4
* Cucumber BDD
* TestNG
* Maven
* WebDriverManager
* Jenkins
* Git & GitHub

---

## 🏗 Framework Architecture

```text
src
├── main
│   └── java
│       └── com.ecommerce.framework
│           ├── config
│           ├── driver
│           ├── pages
│           └── utils
│
└── test
    ├── java
    │   └── com.ecommerce.framework
    │       ├── hooks
    │       ├── runners
    │       └── stepdefinitions
    │
    └── resources
        ├── features
        └── testdata
```

### Design Patterns Used

* Page Object Model (POM)
* ThreadLocal Driver Management
* Factory Pattern
* BDD (Behavior Driven Development)

---

## ✨ Key Features

### Selenium Automation

* Cross-browser execution support
* Chrome, Firefox, Edge support
* Explicit Wait implementation
* Reusable BasePage utilities

### BDD Framework

* Gherkin Feature Files
* Step Definitions
* Readable business scenarios
* Stakeholder-friendly test cases

### Parallel Execution

* ThreadLocal WebDriver implementation
* Parallel execution support through TestNG
* Isolated browser sessions

### Reporting

* Cucumber HTML Reports
* JSON Reports
* Screenshot capture on failure

### CI/CD Ready

* Maven build support
* Jenkins integration
* GitHub repository support

---

## 🎯 Application Under Test

### Website

https://www.saucedemo.com/

### Test Users

| Username                | Purpose                   |
| ----------------------- | ------------------------- |
| standard_user           | Normal user               |
| locked_out_user         | Locked account validation |
| problem_user            | Negative behavior testing |
| performance_glitch_user | Performance testing       |
| error_user              | Error scenario testing    |
| visual_user             | UI validation testing     |

Password for all users:

```text
secret_sauce
```

---

## ✅ Automated Test Scenarios

### Login Module

* Valid Login
* Invalid Password
* Empty Username
* Empty Password
* Locked User Validation
* Problem User Login
* Performance User Login
* Error User Login

### Cart Module

* Add Single Product
* Add Multiple Products
* Validate Product Presence
* Cart Navigation Validation

### Checkout Module

* Complete Checkout Flow
* Checkout With Multiple Products
* Shipping Information Validation
* Order Completion Validation

---

## 🔥 Framework Flow

```text
Feature File
      ↓
Step Definition
      ↓
Page Object
      ↓
Base Page
      ↓
DriverFactory
      ↓
Browser
```

---

## ▶️ Run Tests

### Run All Tests

```bash
mvn clean test
```

### Execute Through TestNG

```bash
testng.xml
```

---

## 📊 Sample Reporting

Reports are generated under:

```text
target/
├── cucumber-reports.html
├── cucumber.json
└── screenshots/
```

---

## 💡 Interview Highlights

This project demonstrates:

* Selenium WebDriver Automation
* Page Object Model Design Pattern
* BDD Framework Development
* Cucumber + TestNG Integration
* Parallel Execution using ThreadLocal
* Screenshot Capture on Failures
* Config Driven Framework Design
* CI/CD Ready Automation Architecture

---

## 👨‍💻 Author

**SDET Automation Framework Project**

Built for demonstrating industry-standard automation framework design, maintainability, scalability, and interview-ready Selenium automation practices.
