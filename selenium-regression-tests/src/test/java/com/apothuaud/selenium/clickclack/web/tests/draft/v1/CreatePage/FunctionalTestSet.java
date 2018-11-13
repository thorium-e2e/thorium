package com.apothuaud.selenium.clickclack.web.tests.draft.v1.CreatePage;

import com.apothuaud.selenium.clickclack.web.pages.CreatePage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.annotations.Test;

public class FunctionalTestSet extends TestSet {

    // 1. add fields in create clack form
    @Test(
            suiteName = "Functional tests",
            testName = "add fields in create clack form",
            description = "I can add fields in create clack form",
            groups = { "fun", "dev", "rec", "prod" }
    )
    public void testCreateFormAddFields(){
        new CreatePage(driver, env)
                .openPage()
                .verifyNbFields(1)
                .addFields()
                .verifyNbFields(2);
    }

    // 1. remove fields in create clack form
    @Test(
            suiteName = "Functional tests",
            testName = "remove fields in create clack form",
            description = "I can remove fields in create clack form",
            groups = { "fun", "dev", "rec", "prod" },
            dependsOnMethods = "testCreateFormAddFields"
    )
    public void testCreateFormRemoveFields(){
        new CreatePage(driver, env)
                .removeFields()
                .verifyNbFields(1);
    }
}
