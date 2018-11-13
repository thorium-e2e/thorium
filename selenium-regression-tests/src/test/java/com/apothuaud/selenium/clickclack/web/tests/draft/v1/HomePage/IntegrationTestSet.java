package com.apothuaud.selenium.clickclack.web.tests.draft.v1.HomePage;

import com.apothuaud.selenium.clickclack.web.pages.ClacksPage;
import com.apothuaud.selenium.clickclack.web.pages.HomePage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationTestSet extends TestSet {

    @Test(
            suiteName = "Integration tests",
            testName = "Access to List page from Home page",
            description = "I can navigate to List page from Home page",
            groups = { "int", "dev", "rec", "prod" }
    )
    public void testHomePageToListPage() throws InterruptedException {
        new HomePage(driver, env)
                .openPage()
                .gotoListPage();
        Assert.assertEquals(driver.getCurrentUrl(), ClacksPage.url);
    }
}
