package com.apothuaud.selenium.clickclack.web.tests;

import com.apothuaud.selenium.clickclack.Clack;
import com.apothuaud.selenium.clickclack.web.pages.CreatePage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class EndToEndTestSet extends TestSet {

    private int nbClacksBefore;
    private static final Map<String, String> testClackAttrs;
    static
    {
        testClackAttrs = new HashMap<String, String>();
        testClackAttrs.put("ID", "5be27598fb6fc00d3af597a9");
        testClackAttrs.put("name", "REC Clack 1");
        testClackAttrs.put("description", "Clack example for automation tests");
        testClackAttrs.put("author", "Adrian Pothuaud");
        testClackAttrs.put("usedBy", "Selenium");
    }
    private Clack testClack = new Clack(
            testClackAttrs
    );

    // *******************
    // 3. End to End tests
    // *******************

    // 3.1 CRUD Clack
    // --------------

    /*@Test(
            suiteName = "End to end tests",
            testName = "Create - Read - Update - Delete a clack",
            description = "I can CRUD clack",
            groups = { "e2e", "dev", "rec" }
    )
    public void testCRUDClack(){
        new CreatePage(driver, env)
                .openPage()
                .createClack(testClack);
        new DetailsPage(driver, testClack.getAttributes().get("id"), env)
                .openPage()
                .verifyAttributes();
        new UpdatePage(driver, testClack.getAttributes().get("id"), env)
                .openPage()
                .addFields()
                .addRandom();
        new ListPage(driver, env)
                .openPage()
                .delete(testClack.getAttributes().get("id"));
    }*/
}
