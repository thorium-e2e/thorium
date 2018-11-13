package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;

public class ClacksPage extends PageObject {

    @FindBy(tagName = "nav")
    WebElement nav;

    @FindBy(id = "link-back-home")
    WebElement lnk_home;

    @FindBy(id = "link-create-clack")
    WebElement lnk_create;

    @FindBy(id = "clacks-list")
    WebElement ul_clacksList;

    @FindBy(className = "clack")
    List<WebElement> li_clacksItems;

    @FindBy(id = "no-clacks")
    WebElement err_noClacks;

    public static String url = "/clacks";

    public ClacksPage(WebDriver driver, HashMap env) {
        super(driver, env);
    }

    public ClacksPage openPage() {
        driver.get(url);
        return this;
    }

    public ClacksPage verifyHeader() {
        Assert.assertEquals(driver.getTitle(), "Clacks");
        return this;
    }

    public ClacksPage verifyContent() {
        Assert.assertTrue(nav.isDisplayed());
        Assert.assertTrue(lnk_home.isDisplayed());
        Assert.assertTrue(lnk_create.isDisplayed());
        Assert.assertTrue(ul_clacksList.isDisplayed());
        return this;
    }

    public ClacksPage gotoHomePage() {
        lnk_home.click();
        return this;
    }

    public ClacksPage gotoCreatePage() {
        lnk_create.click();
        return this;
    }
}
