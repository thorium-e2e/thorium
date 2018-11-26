package com.thorium.appium.clickclack.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

@SuppressWarnings({"UnusedReturnValue", "unused", "FieldCanBeLocal"})
public class ClacksCreatePage {

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/clack-create-btn-reset")
    private MobileElement btn_reset;

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/clack-create-btn-add")
    private MobileElement btn_add;

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/clack-create-btn-submit")
    private MobileElement btn_submit;

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/create_clack_key")
    List<MobileElement> fields_key;

    @FindBy(xpath = "//*[@resource-id='clickclack.apothuaud.com.clickclack:id/create_clack_key']")
    MobileElement first_field_key;

    @FindBy(id = "clickclack.apothuaud.com.clickclack:id/create_clack_value")
    List<MobileElement> fields_value;

    @FindBy(xpath = "//*[@resource-id='clickclack.apothuaud.com.clickclack:id/create_clack_value']")
    MobileElement first_field_value;

    private AndroidDriver driver;

    public ClacksCreatePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public ClacksCreatePage send() {
        btn_submit.click();
        return this;
    }

    public ClacksCreatePage verifyKeyFieldIsPresent() {
        Assert.assertTrue(first_field_key.isDisplayed());
        return this;
    }

    public ClacksCreatePage verifyValueFieldIsPresent() {
        Assert.assertTrue(first_field_value.isDisplayed());
        return this;
    }

    public ClacksCreatePage verifyResetButtonIsPresent() {
        Assert.assertTrue(btn_reset.isDisplayed());
        return this;
    }

    public ClacksCreatePage verifyAddButtonIsPresent() {
        Assert.assertTrue(btn_add.isDisplayed());
        return this;
    }

    public ClacksCreatePage verifySubmitButtonIsPresent() {
        Assert.assertTrue(btn_submit.isDisplayed());
        return this;
    }

    public ClacksCreatePage verifyNbFieldsPair(int i) {
        Assert.assertEquals(fields_key.size(), i);
        return this;
    }

    public ClacksCreatePage addFields() {
        btn_add.click();
        return this;
    }

    public ClacksCreatePage fillKeyField(int pos, String key) {
        fields_key.get(pos).sendKeys(key);
        return this;
    }

    public ClacksCreatePage fillValueField(int pos, String value) {
        fields_value.get(pos).sendKeys(value);
        return this;
    }

    public ClacksCreatePage reset() {
        btn_reset.click();
        return this;
    }

    public ClacksCreatePage verifyEmptyKeyField(int pos) {
        Assert.assertEquals(fields_key.get(pos).getText(), "key");
        return this;
    }

    public ClacksCreatePage verifyEmptyValueField(int pos) {
        Assert.assertEquals(fields_value.get(pos).getText(), "value");
        return this;
    }
}
