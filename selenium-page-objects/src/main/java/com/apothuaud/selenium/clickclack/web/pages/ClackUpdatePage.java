package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.HashMap;

public class ClackUpdatePage extends PageObject {

    public static String url;
    private String id;

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        ClackUpdatePage.url = url;
    }

    public ClackUpdatePage(WebDriver driver, String id, HashMap env) {
        super(driver, env);
        this.id = id;
        setUrl("/clacks/" + id + "/update");
    }

    public ClackUpdatePage openPage() {
        driver.get(url);
        return this;
    }

    public ClackUpdatePage verifyHeader() {
        Assert.assertEquals(driver.getTitle(), "Update Clack " + id);
        return this;
    }

    public ClackUpdatePage verifyContent() {
        // ToDo: define page content
        return this;
    }
}
