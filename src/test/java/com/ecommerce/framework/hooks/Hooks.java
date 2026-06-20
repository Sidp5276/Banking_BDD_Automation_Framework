package com.ecommerce.framework.hooks;

import com.ecommerce.framework.config.ConfigReader;
import com.ecommerce.framework.driver.DriverFactory;
import com.ecommerce.framework.utils.ScreenshotUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

/**
 * Cucumber hooks: start/stop driver and take screenshots on failure.
 */
public class Hooks {

    @Before
    public void beforeScenario() {
        String browser = ConfigReader.get("browser");
        if (browser == null) browser = "chrome";
        DriverFactory.createDriver(browser);
        WebDriver driver = DriverFactory.getDriver();
        String base = ConfigReader.get("base.url");
        if (base != null) driver.get(base);
    }

    @After
    public void afterScenario(Scenario scenario) {
        WebDriver driver = DriverFactory.getDriver();
        if (scenario.isFailed() && driver != null) {
            ScreenshotUtil.takeScreenshot(driver, scenario.getName().replaceAll("[^a-zA-Z0-9-_]","_"));
        }
        DriverFactory.quitDriver();
    }
}
