package com.apothuaud.thorium.google.pages;

import com.apothuaud.thorium.framework.core.WebPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

@SuppressWarnings({"WeakerAccess", "FieldCanBeLocal", "unused"})
public class HomePage extends WebPageObject {

    @FindBy(id = "lst-ib")
    private WebElement input_lst_ib;

    @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div[1]/div/div/div[1]/a")
    private WebElement link_first_result;

    private static String url = "http://www.google.com";

    public HomePage openPage() {
        this.driver.navigate().to(getUrl());
        this.driver.manage().window().maximize();
        return this;
    }

    public HomePage search(String query) {
        input_lst_ib.clear();
        input_lst_ib.sendKeys(query);
        // this.takeSnapShot();
        input_lst_ib.submit();
        return this;
    }

    public HomePage verifyFirstResultIsLinkedInProfileOf(String profile) {
        String link = link_first_result.getAttribute("href");
        Assert.assertTrue(link.contains("linkedin"));
        Assert.assertTrue(link.contains(profile.toLowerCase().replace(" ", "-")));
        return this;
    }
}
