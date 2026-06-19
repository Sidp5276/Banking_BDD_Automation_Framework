package com.bank.framework.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utility to capture screenshots on failure.
 */
public class ScreenshotUtil {
    public static String takeScreenshot(WebDriver driver, String name) {
        try {
            if (!(driver instanceof TakesScreenshot)) return null;
            File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            String ts = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            Path target = Path.of("target", "screenshots", name + "_" + ts + ".png");
            Files.createDirectories(target.getParent());
            Files.copy(src.toPath(), target, StandardCopyOption.REPLACE_EXISTING);
            return target.toString();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
