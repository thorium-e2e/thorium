package com.thorium.appium.clickclack.android.tests.draft.v1.activities.clacks.create;

import com.thorium.appium.clickclack.android.pages.ClacksCreatePage;
import com.thorium.appium.clickclack.android.pages.ClacksListPage;
import com.thorium.appium.clickclack.android.pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ClacksCreateActivityIntegrationTestSet {

    private AndroidDriver mobileDriver;

    @BeforeClass
    public void prepareTests() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.android();
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.1");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_API_24");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/adrian/GitHub/clickclack-android/app/build/outputs/apk/debug/app-debug.apk");
        mobileDriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        mobileDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        new HomePage(mobileDriver)
                .gotoClacks();

        new ClacksListPage(mobileDriver)
                .gotoCreateClack();
    }

    @Test(
            groups = {"int"},
            description = "When I go back I am on Clacks List Page"
    )
    public void toClacksListPageWhenGoingBack() {
        mobileDriver.pressKey(new KeyEvent().withKey(AndroidKey.BACK));
        String activity = mobileDriver.currentActivity();
        Assert.assertTrue(activity.contains("ClacksListActivity"));
    }

    @Test(
            groups = {"int"},
            description = "When I submit I am on Clacks List Page"
    )
    public void toClacksListPageOnSubmit() {
        new ClacksCreatePage(mobileDriver)
                .send();
        String activity = mobileDriver.currentActivity();
        Assert.assertTrue(activity.contains("ClacksListActivity"));
    }
}
