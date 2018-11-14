package com.apothuaud.selenium.clickclack.web.tests.draft.v1.CreatePage;

import com.apothuaud.selenium.clickclack.web.pages.CreatePage;
import com.apothuaud.selenium.clickclack.web.pages.ListPage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntegrationTestSet extends TestSet {

    // 1. From Create Clack page I can go to Clacks list page
    @Test(
            description = "I can navigate to Clacks page from Create page",
            groups = { "int", "dev", "rec", "prod" }
    )
    public void testCreatePageToListPage(){
        new CreatePage(driver, env)
                .openPage()
                .gotoListPage();
        Assert.assertEquals(driver.getCurrentUrl(), env.get("domain") + ListPage.url);
    }
}
