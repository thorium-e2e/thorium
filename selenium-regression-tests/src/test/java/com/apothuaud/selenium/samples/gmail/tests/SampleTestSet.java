package com.apothuaud.selenium.samples.gmail.tests;

import com.apothuaud.selenium.samples.gmail.pages.GMHomePage;
import com.apothuaud.selenium.samples.gmail.pages.GMLoginPage;
import com.apothuaud.selenium.samples.google.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTestSet {

    // ToDo: create accounts enum
    private Account automAccount1 = new Account(
        "adrianpothuaud@gmail.com",
        "AP@@sswo!rd123"
    );

    // ToDo: Account provider (existing/not)
    @Test(
            groups = { "Gmail", "Sample" },
            description = "Sample Test for Gmail Pages"
    )
    public void test_story_1() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        // ToDo: Create pages and methods
        new GMLoginPage(driver)
            .openPage()
            .login(this.automAccount1);
        new GMHomePage(driver)
            .clearAllMessages()
            .verifyNbUnread(0)
            .sendMail(automAccount1.getMail(), "Test Mail", "Sample mail for automation")
            .verifyNbUnread(1)
            .quit();
    }
}
