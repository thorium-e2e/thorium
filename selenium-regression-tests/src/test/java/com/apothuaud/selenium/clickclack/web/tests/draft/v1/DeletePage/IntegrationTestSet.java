package com.apothuaud.selenium.clickclack.web.tests.draft.v1.DeletePage;

import com.apothuaud.selenium.clickclack.TestSetWithClack;
import com.apothuaud.selenium.clickclack.web.pages.DeletePage;
import com.apothuaud.selenium.clickclack.web.pages.ListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationTestSet extends TestSetWithClack {

    // 1. From Delete page I can go to Clacks page
    @Test(
            description = "I can navigate to Clacks page from Delete page",
            groups = { "int", "dev", "rec", "prod" }
    )
    public void testDeletePageToListPage(){
        new DeletePage(driver, env, testClack.getID())
                .openPage()
                .gotoListPage();
        Assert.assertEquals(driver.getCurrentUrl(), env.get("domain") + ListPage.url);
    }
}
