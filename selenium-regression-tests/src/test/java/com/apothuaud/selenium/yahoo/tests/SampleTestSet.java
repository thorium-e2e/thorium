package com.apothuaud.selenium.yahoo.tests;

import com.apothuaud.selenium.yahoo.Account;
import com.apothuaud.selenium.yahoo.pages.OathConfirmPage;
import com.apothuaud.selenium.yahoo.pages.YahooHomePage;
import com.apothuaud.selenium.yahoo.pages.YahooLoginPage;
import com.apothuaud.selenium.yahoo.pages.YahooMailPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestSet {

    private Account automUser1 = new Account(
        "Autom",
        "Training",
        "automtraining@yahoo.com",
        "tDhG2YbghXvKSbe"
    );

    @Test
    public void test_sample_yahoo_scenario() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        // new OathConfirmPage(driver)
        //     .openPage()
        //     .confirm();
        new YahooHomePage(driver)
            .openPage()
            .confirmOathIfNecessary()
            .goToLoginPage();
        new YahooLoginPage(driver)
            .typeEmail(automUser1)
            .typePassword(automUser1);
        new YahooHomePage(driver)
            .goToMailPage();
        new YahooMailPage(driver)
            .verifyNbMails(1);
    }
}
