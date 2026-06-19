package com.bank.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Statement page object.
 */
public class StatementPage extends BasePage {

    @FindBy(id = "statementTable")
    private WebElement statementTable;

    @FindBy(id = "fromDate")
    private WebElement fromDate;

    @FindBy(id = "toDate")
    private WebElement toDate;

    @FindBy(id = "filterBtn")
    private WebElement filterBtn;

    @FindBy(id = "downloadBtn")
    private WebElement downloadBtn;

    @FindBy(id = "noTxMsg")
    private WebElement noTxMsg;

    public boolean isStatementVisible() {
        return statementTable.isDisplayed();
    }

    public void setFromDate(String date) {
        type(fromDate, date);
    }

    public void setToDate(String date) {
        type(toDate, date);
    }

    public void clickFilter() {
        clickWhenVisible(filterBtn);
    }

    public void clickDownload() {
        clickWhenVisible(downloadBtn);
    }

    public String getNoTransactionsMessage() {
        return getText(noTxMsg);
    }
}
