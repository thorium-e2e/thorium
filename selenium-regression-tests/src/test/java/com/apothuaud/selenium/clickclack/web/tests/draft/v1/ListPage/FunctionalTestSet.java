package com.apothuaud.selenium.clickclack.web.tests.draft.v1.ListPage;

import com.apothuaud.selenium.clickclack.web.pages.ClacksPage;
import com.apothuaud.selenium.clickclack.web.pages.CreatePage;
import com.apothuaud.selenium.clickclack.web.pages.HomePage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FunctionalTestSet extends TestSet {

    /*// 1.2.2 From Clacks list page I can go to Home, Create Clack, Clack Details and Update Clack pages
    @Test(
            suiteName = "Integration tests",
            testName = "Access to Home page from List page",
            description = "I can navigate to Home page from List page",
            groups = { "int", "dev", "rec", "prod" }
    )
    public void testListPageToHomePage(){
        new ClacksPage(driver, env)
                .openPage()
                .gotoHomePage();
        Assert.assertEquals(driver.getCurrentUrl(), HomePage.url);
    }

    @Test(
            suiteName = "Integration tests",
            testName = "Access to Create page from List page",
            description = "I can navigate to Create page from List page",
            groups = { "int", "dev", "rec", "prod" }
    )
    public void testListPageToCreatePage(){
        new ClacksPage(driver, env)
                .openPage()
                .gotoCreatePage();
        Assert.assertEquals(driver.getCurrentUrl(), CreatePage.url);
    }

    // 2.3 no clacks message
    @Test(
            suiteName = "Integration tests",
            testName = "Access to Home page from List page",
            description = "I can navigate to Home page from List page",
            groups = { "int", "dev", "rec", "prod" }
    )
    public void testListPageToHomePage(){
        new ClacksPage(driver)
                .openPage()
                .gotoHomePage();
        Assert.assertEquals(driver.getCurrentUrl(), HomePage.url);
    }*/
}
