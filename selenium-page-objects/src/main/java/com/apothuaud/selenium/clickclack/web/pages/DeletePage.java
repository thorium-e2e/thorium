package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.HashMap;

public class DeletePage extends PageObject {

    @FindBy(id = "confirm-delete-label")
    WebElement lbl_confirmDelete;

    @FindBy(className = "button-delete")
    WebElement btn_delete;

    @FindBy(className = "button-create")
    WebElement btn_create;

    public static String url = "/clacks/clackId/delete_confirm";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    private void setUrl(String u){
        url = u;
    }

    public DeletePage(WebDriver driver, HashMap env, String id) {

        super(driver, env);
        setUrl(env.get("domain") + url.replace("clackId", id));
        setId(id);
    }

    public DeletePage openPage() {
        System.out.println("Open page with url: " + url);
        driver.get(url);
        return this;
    }

    public DeletePage verifyHeader() {
        Assert.assertEquals(driver.getTitle(), "Delete Clack " + getId());
        return this;
    }

    public DeletePage verifyContent() {
        Assert.assertTrue(lbl_confirmDelete.isDisplayed());
        Assert.assertTrue(btn_create.isDisplayed());
        Assert.assertTrue(btn_delete.isDisplayed());
        return this;
    }
}
