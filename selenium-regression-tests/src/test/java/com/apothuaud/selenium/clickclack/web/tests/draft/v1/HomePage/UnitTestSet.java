package com.apothuaud.selenium.clickclack.web.tests.draft.v1.HomePage;

import com.apothuaud.selenium.clickclack.web.pages.HomePage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.annotations.Test;

public class UnitTestSet extends TestSet {

    // 1 Home page open and have introduction, content list and clacks link
    @Test(
            suiteName = "Unit tests",
            testName = "I can open Home page with success",
            description = "I can open home page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenHomePage() {
        new HomePage(driver, env)
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }
}
