package com.bank.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Page object for Login screen.
 */
public class LoginPage extends BasePage {

    @FindBy(id = "username")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "loginBtn")
    private WebElement loginButton;

    @FindBy(id = "error")
    private WebElement errorMessage;

    public void enterUsername(String username) {
        type(usernameInput, username);
    }

    public void enterPassword(String password) {
        type(passwordInput, password);
    }

    public void clickLogin() {
        clickWhenVisible(loginButton);
    }

    public String getError() {
        return getText(errorMessage);
    }
}
