package com.apothuaud.selenium.gmail.tests;

import com.apothuaud.selenium.gmail.pages.GMHomePage;
import com.apothuaud.selenium.google.pages.GHomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestSet {

    @Test(
            groups = { "Gmail", "Sample" },
            //dataProviderClass = com.apothuaud.selenium.google.QueryProvider.class,
            //dataProvider = "getGoogleQueries",
            description = "Sample Test for Gmail Pages",
            priority = 5,
            successPercentage = 80
    )
    public void test_login() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/bin/chromedriver");
        new GMHomePage(new ChromeDriver()).openPage();



    }
}
