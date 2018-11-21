package com.apothuaud.appium.clickclack.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ClacksListPage {

    @AndroidFindBy(id = "create_clack_btn")
    MobileElement btn_createClack;

    @AndroidFindBy(id = "clack_details_button")
    List<MobileElement> btns_clackDetails;

    @AndroidFindBy(id = "clack_btn_update")
    List<MobileElement> btns_updateClack;

    @AndroidFindBy(id = "clack_btn_delete")
    List<MobileElement> btns_deleteClack;

    @AndroidFindBy(id = "clack_id_value")
    List<MobileElement> txtViews_id;

    private AndroidDriver<AndroidElement> driver;

    public ClacksListPage(AndroidDriver<AndroidElement> driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public AndroidDriver<?> getDriver() {
        return driver;
    }

    public void setDriver(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
    }

    public ClacksListPage gotoCreateClack() {
        btn_createClack.click();
        return this;
    }

    public int getClacksNb() {
        return btns_clackDetails.size();
    }

    public ClacksListPage gotoDetailsFirstClack() {
        btns_clackDetails.get(0).click();
        return this;
    }
}
