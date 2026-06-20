package com.ecommerce.framework.stepdefinitions;

import com.ecommerce.framework.pages.LoginPage;
import com.ecommerce.framework.pages.ProductsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * Reusable login step definitions.
 */
public class LoginSteps {

    private LoginPage login;
    private ProductsPage products;

    private LoginPage loginPage() {
        if (login == null) login = new LoginPage();
        return login;
    }

    private ProductsPage productsPage() {
        if (products == null) products = new ProductsPage();
        return products;
    }

    @Given("user is on login page")
    public void user_on_login_page() {
        // URL already opened by Hooks
    }

    @When("user logs in with username {string} and password {string}")
    public void user_logs_in(String user, String pass) {
        loginPage().enterUsername(user);
        loginPage().enterPassword(pass);
        loginPage().clickLogin();
    }

    @Then("login should be successful and show products page")
    public void login_successful() {
        Assert.assertTrue(productsPage().isOnProductsPage());
    }

    @Then("login should fail with error {string}")
    public void login_should_fail(String msg) {
        String err = loginPage().getError();
        Assert.assertTrue(err.contains(msg));
    }
}
