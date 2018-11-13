package com.apothuaud.selenium.clickclack.web.tests.draft.v1.ListPage;

import com.apothuaud.selenium.clickclack.web.pages.ClacksPage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.annotations.Test;

public class UnitTestSet extends TestSet {

    // 1 Clacks list page open and have list
    @Test(
            suiteName = "Unit tests",
            testName = "I can open Clacks page with success",
            description = "I can open clacks page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenClacksPage(){
        new ClacksPage(driver, env)
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }
}
