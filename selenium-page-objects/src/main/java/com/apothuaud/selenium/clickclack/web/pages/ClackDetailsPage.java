package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.HashMap;

public class ClackDetailsPage extends PageObject {

    public static String url;
    private String id;

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        ClackDetailsPage.url = url;
    }

    public ClackDetailsPage(WebDriver driver, String id, HashMap env) {
        super(driver, env);
        this.id = id;
        setUrl("https://rec-clickclack-web.herokuapp.com/clacks/" + id);
    }

    public ClackDetailsPage openPage() {
        driver.get(url);
        return this;
    }

    public ClackDetailsPage verifyHeader() {
        Assert.assertEquals(driver.getTitle(), "Clack " + id);
        return this;
    }

    public ClackDetailsPage verifyContent() {
        // ToDo: define page content
        return this;
    }
}
