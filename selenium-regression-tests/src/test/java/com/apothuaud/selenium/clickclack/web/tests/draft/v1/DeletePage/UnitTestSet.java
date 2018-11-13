package com.apothuaud.selenium.clickclack.web.tests.draft.v1.DeletePage;

import com.apothuaud.selenium.clickclack.TestSetWithClack;
import com.apothuaud.selenium.clickclack.web.pages.DeletePage;
import org.testng.annotations.Test;

public class UnitTestSet extends TestSetWithClack {

    // 1 Clacks create page open and have form
    @Test(
            description = "I can open clacks create page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenCreateClackPage(){
        new DeletePage(driver, env, testClack.getID())
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }
}
