package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends PageObject {

    @FindBy(id = "title")
    WebElement h_title;

    @FindBy(id = "intro")
    WebElement div_intro;

    @FindBy(id = "content")
    WebElement div_content;

    @FindBy(id = "content-list")
    WebElement div_contentList;

    @FindBy(className = "content-list-item")
    List<WebElement> li_contentItems;

    @FindBy(id = "content-info")
    WebElement div_contentInfo;

    public static String url = "https://rec-clickclack-web.herokuapp.com/";

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openPage() {
        driver.get(url);
        return this;
    }

    public HomePage verifyHeader() {
        Assert.assertEquals(driver.getTitle(), "ClickClack");
        return this;
    }

    public HomePage verifyContent() {
        Assert.assertTrue(h_title.isDisplayed());
        Assert.assertTrue(div_intro.isDisplayed());
        Assert.assertTrue(div_content.isDisplayed());
        Assert.assertTrue(div_contentList.isDisplayed());
        Assert.assertTrue(div_contentInfo.isDisplayed());
        return this;
    }
}
