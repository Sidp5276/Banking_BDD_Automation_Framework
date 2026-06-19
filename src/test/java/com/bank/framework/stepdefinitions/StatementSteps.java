package com.bank.framework.stepdefinitions;

import com.bank.framework.pages.DashboardPage;
import com.bank.framework.pages.StatementPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class StatementSteps {
    private final DashboardPage dash = new DashboardPage();
    private final StatementPage statement = new StatementPage();

    @Given("user is on statement page")
    public void user_on_statement_page() {
        dash.goToStatement();
    }

    @When("user filters statement from {string} to {string}")
    public void user_filters(String from, String to) {
        statement.setFromDate(from);
        statement.setToDate(to);
        statement.clickFilter();
    }

    @Then("statement should be visible")
    public void statement_visible() {
        Assert.assertTrue(statement.isStatementVisible());
    }

    @When("user downloads statement")
    public void user_downloads_statement() {
        statement.clickDownload();
    }

    @Then("no transactions message {string} is shown")
    public void no_transactions_message(String msg) {
        Assert.assertTrue(statement.getNoTransactionsMessage().contains(msg));
    }
}
