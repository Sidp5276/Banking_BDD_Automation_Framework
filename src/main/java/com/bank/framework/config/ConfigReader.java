package com.bank.framework.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * Simple config reader for properties in test resources.
 */
public class ConfigReader {
    private static final Properties props = new Properties();

    static {
        try (InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("testdata/config.properties")) {
            if (is != null) props.load(is);
        } catch (IOException e) {
            throw new RuntimeException("Cannot load config.properties", e);
        }
    }

    public static String get(String key) {
        return props.getProperty(key);
    }
}
