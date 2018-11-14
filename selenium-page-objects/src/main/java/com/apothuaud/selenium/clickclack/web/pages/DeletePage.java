package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.HashMap;

@SuppressWarnings("UnusedReturnValue")
public class DeletePage extends PageObject {

    @FindBy(id = "confirm-delete-label")
    WebElement lbl_confirmDelete;

    @FindBy(className = "button-delete")
    WebElement btn_delete;

    @FindBy(className = "button-create")
    WebElement btn_create;

    @FindBy(className = "button-link")
    WebElement lnk_listPage;

    public String url = "/clacks/clackId/delete_confirm";

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    private void setUrl(String domain, String id){
        System.out.println("Making Delete Page url with: domain=" + domain + " and id=" + id);
        this.url = domain + "/clacks/" + id + "/delete_confirm";
    }

    private String getUrl(){
        return url;
    }

    public DeletePage(WebDriver driver, HashMap env, String id) {
        super(driver, env);

        System.out.println("Creation of Delete Page with {'env.domain': " + env.get("domain") + "; 'id': " + id + "}");

        setUrl(env.get("domain").toString(), id);
        setId(id);
    }

    public DeletePage openPage() {
        System.out.println("Open page with url: " + url);
        driver.get(getUrl());
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

    public DeletePage gotoListPage() {
        lnk_listPage.click();
        return this;
    }

    public DeletePage refuse() {
        btn_delete.click();
        return this;
    }

    public DeletePage accept() {
        btn_create.click();
        return this;
    }
}
