package com.apothuaud.selenium.clickclack.tests;

import com.apothuaud.selenium.clickclack.data.Clack;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class Draft1TestSet {

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

    // *************
    // 1. Unit tests
    // verify the availability of all pages
    // verify the content of all pages
    // verify the navigation between all pages
    // *************

    // 1.1 Open pages
    // --------------

    // 1.1.1 Home page open and have introduction, content list and clacks link
    @Test(
            suiteName = "Unit tests",
            testName = "I can open Home page with success",
            description = "I can open home page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenHomePage() {
        new HomePage()
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }

    // 1.1.2 Clacks list page open and have list
    @Test(
            suiteName = "Unit tests",
            testName = "I can open Clacks page with success",
            description = "I can open clacks page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenClacksPage(){
        new ClacksPage()
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }

    // 1.1.3 Clacks create page open and have form
    @Test(
            suiteName = "Unit tests",
            testName = "I can open Clacks create page with success",
            description = "I can open clacks create page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenCreateClackPage(){
        new CreateClackPage()
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }

    // 1.1.4 Clacks details page open and have attributes
    @Test(
            suiteName = "Unit tests",
            testName = "I can open Clacks details page with success",
            description = "I can open clacks details page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenClackDetailsPage(){
        new ClackDetailsPage(testClack.getID())
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }

    // 1.1.5 Clacks update page open and have attributes and form
    @Test(
            suiteName = "Unit tests",
            testName = "I can open Clacks update page with success",
            description = "I can open clacks update page and see header and content",
            groups = { "unit", "dev", "rec", "prod" }
    )
    public void testOpenClackUpdatePage(){
        new ClackUpdatePage(testClack.getID())
                .openPage()
                .verifyHeader()
                .verifyContent()
        ;
    }

    // 1.2 Navigate between pages
    // --------------------------

    // 1.2.1 From Home Page I can goto clacks list page

    // 1.2.2 From Clacks list page I can go to Home, Create Clack, Clack Details and Update Clack pages

    // 1.2.3 From Create Clack page I can go to Clacks list page

    // 1.2.4 From Clack details page I can go to Clacks List and Update Clack pages

    // 1.2.5 From Clack update page I can go to Clacks List page

    // *******************
    // 2. Functional tests
    // verify technical specifications
    // *******************

    // 2.1

    // *******************
    // 3. End to End tests
    // *******************

    // 3.1 CRUD Clack
    // --------------
}
