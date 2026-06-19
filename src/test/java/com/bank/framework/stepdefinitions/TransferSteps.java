package com.bank.framework.stepdefinitions;

import com.bank.framework.pages.DashboardPage;
import com.bank.framework.pages.TransferPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class TransferSteps {
    private final DashboardPage dash = new DashboardPage();
    private final TransferPage transfer = new TransferPage();

    @Given("user is on transfer page")
    public void user_on_transfer_page() {
        dash.goToTransfer();
    }

    @When("user transfers {string} to beneficiary {string}")
    public void user_transfers(String amount, String beneficiary) {
        transfer.enterBeneficiary(beneficiary);
        transfer.enterAmount(amount);
        transfer.clickTransfer();
    }

    @Then("transfer should be successful with message {string}")
    public void transfer_successful(String msg) {
        Assert.assertTrue(transfer.getTransferMessage().contains(msg));
    }

    @Then("transfer should fail with message {string}")
    public void transfer_should_fail(String msg) {
        Assert.assertTrue(transfer.getTransferMessage().contains(msg));
    }
}
