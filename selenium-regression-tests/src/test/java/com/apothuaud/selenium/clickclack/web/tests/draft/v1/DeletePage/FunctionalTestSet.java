package com.apothuaud.selenium.clickclack.web.tests.draft.v1.DeletePage;

import com.apothuaud.selenium.clickclack.web.pages.CreatePage;
import com.apothuaud.selenium.clickclack.web.pages.DeletePage;
import com.apothuaud.selenium.clickclack.web.pages.ListPage;
import com.apothuaud.selenium.samples.common.TestSet;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class FunctionalTestSet extends TestSet {

    private String newClackId;

    @BeforeMethod
    public void beforeMethod() throws IOException {
        System.out.println("BEFORE TEST");
        new CreatePage(driver, env)
                .openPage()
                .createEmpty();
        System.out.println("Clack created");
        newClackId = new ListPage(driver, env)
                .getLastClackId();
        System.out.println("New clack ID: " + newClackId);
    }

    // 1. On Delete page I can refuse delete
    @Test(
            description = "On Delete page I can refuse delete",
            groups = { "fun", "dev", "rec", "prod" }
    )
    public void testDeletePageRefuseToDelete() throws IOException {
        new DeletePage(driver, env, newClackId)
                .openPage()
                .refuse();
        Assert.assertTrue(new ListPage(driver, env)
                .verifyPresenceOfClackById(newClackId)
        );
    }

    // 1. On Delete page I can confirm delete
    @Test(
            description = "On Delete page I can confirm delete",
            groups = { "int", "dev", "rec", "prod" }
    )
    public void testDeletePageConfirmToDelete() throws IOException {
        new DeletePage(driver, env, newClackId)
                .openPage()
                .accept();
        Assert.assertFalse(new ListPage(driver, env)
                .verifyPresenceOfClackById(newClackId)
        );
    }
}
