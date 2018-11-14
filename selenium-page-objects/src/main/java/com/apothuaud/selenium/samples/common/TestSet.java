package com.apothuaud.selenium.samples.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class TestSet {

    protected static HashMap env;

    protected static WebDriver driver;

    @SuppressWarnings("unused")
    @BeforeSuite
    public static void setUp() throws IOException {
        String JSON_SOURCE_PATH = "src/test/resources/config/env.json";
        File JSON_SOURCE = new File(JSON_SOURCE_PATH);
        env = new ObjectMapper().readValue(JSON_SOURCE, HashMap.class);
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterSuite
    public void cleanUp(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
