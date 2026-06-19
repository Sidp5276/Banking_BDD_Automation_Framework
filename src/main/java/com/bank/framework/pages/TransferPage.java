package com.bank.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Transfer page object.
 */
public class TransferPage extends BasePage {

    @FindBy(id = "beneficiary")
    private WebElement beneficiaryInput;

    @FindBy(id = "amount")
    private WebElement amountInput;

    @FindBy(id = "transferBtn")
    private WebElement transferButton;

    @FindBy(id = "transferMsg")
    private WebElement transferMsg;

    public void enterBeneficiary(String b) {
        type(beneficiaryInput, b);
    }

    public void enterAmount(String amt) {
        type(amountInput, amt);
    }

    public void clickTransfer() {
        clickWhenVisible(transferButton);
    }

    public String getTransferMessage() {
        return getText(transferMsg);
    }
}
