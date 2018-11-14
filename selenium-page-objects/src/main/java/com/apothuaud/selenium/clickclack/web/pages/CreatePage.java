package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;

public class CreatePage extends PageObject {

    @FindBy(className = "input-free-form")
    List<WebElement> fields;

    @FindBy(id = "btn-add-fields")
    WebElement btn_addFields;

    @FindBy(id = "btn-rm-fields")
    WebElement btn_rmFields;

    @FindBy(className = "button-submit")
    WebElement btn_submit;

    @FindBy(id = "lnk-clacks")
    WebElement lnk_clacksPage;

    public static String url = "/clacks/create";

    public CreatePage(WebDriver driver, HashMap env) {
        super(driver, env);
    }

    public CreatePage openPage() {
        driver.get(env.get("domain") + url);
        return this;
    }

    public CreatePage verifyHeader() {
        Assert.assertEquals(driver.getTitle(), "Create Clack");
        return this;
    }

    public CreatePage verifyContent() {
        Assert.assertTrue(btn_addFields.isDisplayed());
        Assert.assertTrue(lnk_clacksPage.isDisplayed());
        return this;
    }

    public CreatePage verifyNbFields(int expected) {
        Assert.assertEquals(fields.size(), expected);
        return this;
    }

    public CreatePage addFields() {
        btn_addFields.click();
        return this;
    }

    public CreatePage gotoClacksPage() {
        lnk_clacksPage.click();
        return this;
    }

    public CreatePage removeFields() {
        btn_rmFields.click();
        return this;
    }

    public CreatePage gotoListPage() {
        lnk_clacksPage.click();
        return this;
    }

    public CreatePage createEmpty() {
        btn_submit.click();
        return this;
    }
}
