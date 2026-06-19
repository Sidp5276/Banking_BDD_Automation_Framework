package com.bank.framework.stepdefinitions;

import com.bank.framework.pages.DashboardPage;
import com.bank.framework.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * Reusable login step definitions.
 */
public class LoginSteps {

    private final LoginPage login = new LoginPage();
    private final DashboardPage dash = new DashboardPage();

    @Given("user is on login page")
    public void user_on_login_page() {
        // URL already opened by Hooks
    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in(String user, String pass) {
        login.enterUsername(user);
        login.enterPassword(pass);
        login.clickLogin();
    }

    @Then("login should be successful and show welcome message")
    public void login_successful() {
        String welcome = dash.getWelcome();
        Assert.assertTrue(welcome.toLowerCase().contains("welcome"));
    }

    @Then("login should fail with error {string}")
    public void login_should_fail(String msg) {
        String err = login.getError();
        Assert.assertTrue(err.contains(msg));
    }
}
