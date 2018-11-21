package com.apothuaud.appium.clickclack.android.tests.draft.v1;

import com.apothuaud.appium.clickclack.android.pages.ClacksListPage;
import com.apothuaud.appium.clickclack.android.pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class EndToEndTestSet {

    private AndroidDriver<AndroidElement> mobiledriver;

    @BeforeClass
    public void prepareTests() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.1");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus_5X_API_24");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/adrian/GitHub/thorium/appium-regression-tests/src/test/resources/apk/app-debug.apk");
        capabilities.setCapability("newCommandTimeout", 2000);
        mobiledriver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
    }

    @Test(
            groups = {"e2e"},
            description = "CRUD Clack"
    )
    public void CRUDClack() {
        new HomePage(mobiledriver)
                .gotoClacks();
        new ClacksListPage(mobiledriver)
                .gotoDetailsFirstClack();
    }
}
