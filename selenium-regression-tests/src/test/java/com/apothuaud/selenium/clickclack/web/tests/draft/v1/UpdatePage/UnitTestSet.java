package com.apothuaud.selenium.clickclack.web.tests.draft.v1.UpdatePage;

import com.apothuaud.selenium.clickclack.Clack;
import com.apothuaud.selenium.clickclack.web.pages.ClackUpdatePage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class UnitTestSet extends TestSet {

    private static final Map<String, String> testClackAttrs;
    static
    {
        testClackAttrs = new HashMap<String, String>();
        testClackAttrs.put("id", "5be27598fb6fc00d3af597a9");
        testClackAttrs.put("name", "REC Clack 1");
        testClackAttrs.put("description", "Clack example for automation tests");
        testClackAttrs.put("author", "Adrian Pothuaud");
        testClackAttrs.put("usedBy", "Selenium");
    }
    private Clack testClack = new Clack(
            testClackAttrs
    );

    // 1 Clacks update page open and have attributes and form
    @Test(
            suiteName = "Unit tests",
            testName = "I can open Clacks update page with success",
            description = "I can open clacks update page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenClackUpdatePage(){
        new ClackUpdatePage(driver, testClack.getID(), env)
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }
}
