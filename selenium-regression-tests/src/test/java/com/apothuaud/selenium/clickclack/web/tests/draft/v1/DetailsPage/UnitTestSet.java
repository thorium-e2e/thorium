package com.apothuaud.selenium.clickclack.web.tests.draft.v1.DetailsPage;

import com.apothuaud.selenium.clickclack.Clack;
import com.apothuaud.selenium.clickclack.web.pages.ClackDetailsPage;
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

    // 1 Clacks details page open and have attributes
    @Test(
            suiteName = "Unit tests",
            testName = "I can open Clacks details page with success",
            description = "I can open clacks details page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenClackDetailsPage(){
        new ClackDetailsPage(driver, testClack.getID(), env)
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }
}
