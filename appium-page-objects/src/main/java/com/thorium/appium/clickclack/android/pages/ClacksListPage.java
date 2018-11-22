package com.thorium.appium.clickclack.android.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

@SuppressWarnings({"unused", "UnusedReturnValue", "MismatchedQueryAndUpdateOfCollection", "FieldCanBeLocal"})
public class ClacksListPage {

    private AndroidDriver driver;

    public ClacksListPage(AndroidDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(this.driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("clack_details_button")));
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public ClacksListPage gotoCreateClack() {
        driver.findElementById("create_clack_btn").click();
        return this;
    }

    public ClacksListPage gotoDetailsFirstClack() {
        List<AndroidElement> btns = driver.findElementsById("clack_details_button");
        btns.get(0).click();
        return this;
    }
}
