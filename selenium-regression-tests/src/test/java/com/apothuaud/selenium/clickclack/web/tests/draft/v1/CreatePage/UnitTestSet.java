package com.apothuaud.selenium.clickclack.web.tests.draft.v1.CreatePage;

import com.apothuaud.selenium.clickclack.web.pages.CreatePage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.annotations.Test;


public class UnitTestSet extends TestSet {

    // 1 Clacks create page open and have form
    @Test(
            description = "I can open clacks create page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenCreateClackPage(){
        new CreatePage(driver, env)
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }
}
