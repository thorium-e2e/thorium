package com.apothuaud.selenium.clickclack;

import com.apothuaud.selenium.clickclack.web.pages.CreatePage;
import com.apothuaud.selenium.samples.common.TestSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class TestSetWithClack extends TestSet {

    private static final Map<String, String> testClackAttrs;
    static
    {
        testClackAttrs = new HashMap<String, String>();
        testClackAttrs.put("id", "5beb568a154e3d428a66df0c");
    }
    protected Clack testClack = new Clack(
            testClackAttrs
    );

    @BeforeSuite
    public static void setUp() throws IOException {
        String JSON_SOURCE_PATH = "src/test/resources/config/env.json";
        File JSON_SOURCE = new File(JSON_SOURCE_PATH);
        env = new ObjectMapper().readValue(JSON_SOURCE, HashMap.class);
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
}
