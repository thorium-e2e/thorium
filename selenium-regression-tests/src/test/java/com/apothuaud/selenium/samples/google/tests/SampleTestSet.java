package com.apothuaud.selenium.samples.google.tests;

import com.apothuaud.selenium.samples.google.pages.GHomePage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestSet {

    @Test(
        groups = { "Google", "Sample" },
        dataProviderClass = com.apothuaud.selenium.samples.google.QueryProvider.class,
        dataProvider = "getGoogleQueries",
        description = "Sample Test for Google Pages",
        priority = 5,
        successPercentage = 80
    )
    public void test_search_for_anything(String query) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        new GHomePage(new ChromeDriver()).openPage().search(query).quit();
    }
}
