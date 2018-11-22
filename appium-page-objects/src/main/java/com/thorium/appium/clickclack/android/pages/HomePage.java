package com.thorium.appium.clickclack.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

@SuppressWarnings({"UnusedReturnValue", "unused", "FieldCanBeLocal"})
public class HomePage {

    @AndroidFindBy(id = "button_home_clacks")
    private MobileElement btn_clacks;

    private AndroidDriver driver;

    public HomePage(AndroidDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public HomePage gotoClacks() {
        btn_clacks.click();
        return this;
    }
}
