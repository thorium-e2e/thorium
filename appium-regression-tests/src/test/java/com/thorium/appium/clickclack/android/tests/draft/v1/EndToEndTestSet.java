package com.thorium.appium.clickclack.android.tests.draft.v1;

import com.thorium.appium.clickclack.android.pages.ClacksListPage;
import com.thorium.appium.clickclack.android.pages.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EndToEndTestSet {

    private AndroidDriver mobiledriver;

    @BeforeClass
    public void prepareTests() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.android();
        capabilities.setCapability(MobileCapabilityType.APPIUM_VERSION, "1.9.1");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "7.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_API_24");
        capabilities.setCapability(MobileCapabilityType.APP, "/Users/adrian/GitHub/thorium/appium-regression-tests/src/test/resources/apk/app-debug.apk");
        mobiledriver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        mobiledriver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        mobiledriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
