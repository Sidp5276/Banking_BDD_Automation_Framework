package com.bank.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Dashboard page object.
 */
public class DashboardPage extends BasePage {

    @FindBy(id = "welcome")
    private WebElement welcomeText;

    @FindBy(id = "transferNav")
    private WebElement transferNav;

    @FindBy(id = "statementNav")
    private WebElement statementNav;

    public String getWelcome() {
        return getText(welcomeText);
    }

    public void goToTransfer() {
        clickWhenVisible(transferNav);
    }

    public void goToStatement() {
        clickWhenVisible(statementNav);
    }
}
