package com.thorium.appium.clickclack.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

@SuppressWarnings({"UnusedReturnValue", "FieldCanBeLocal", "unused"})
public class ClackDetailsPage {

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/clack_details_id_label")
    MobileElement id_label;

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/clack_details_id_value")
    MobileElement id_value;

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/clack_details_attrs_label")
    MobileElement attrs_label;

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/clack_details_attrs_value")
    MobileElement attrs_value;

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/clack_details_btn_update")
    MobileElement btn_update;

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/clack_details_delete_btn")
    MobileElement btn_delete;

    private AndroidDriver driver;

    public ClackDetailsPage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public ClackDetailsPage verifyIdIsPresent() {
        Assert.assertTrue(id_label.isDisplayed());
        Assert.assertTrue(id_value.isDisplayed());
        return this;
    }

    public ClackDetailsPage verifyAttributesIsPresent() {
        Assert.assertTrue(attrs_label.isDisplayed());
        Assert.assertTrue(attrs_value.isDisplayed());
        return this;
    }

    public ClackDetailsPage verifyUpdateButtonIsPresent() {
        Assert.assertTrue(btn_update.isDisplayed());
        return this;
    }

    public ClackDetailsPage verifyDeleteButtonIsPresent() {
        Assert.assertTrue(btn_delete.isDisplayed());
        return this;
    }

    public ClackDetailsPage gotoUpdatePage() {
        btn_update.click();
        return this;
    }

    public ClackDetailsPage delete() {
        btn_delete.click();
        return this;
    }
}
