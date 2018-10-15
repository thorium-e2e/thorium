package com.apothuaud.thorium.web.google.scenarios;

import com.apothuaud.thorium.framework.test.WebTestSet;
import com.apothuaud.thorium.google.pages.HomePage;
import org.testng.annotations.Test;

public class Sample extends WebTestSet {

    @Test
    public void searchAndVerifyFirstResult() {
        new HomePage()
                .openPage()
                .search("Adrian Pothuaud")
                .verifyFirstResultIsLinkedInProfileOf("Adrian Pothuaud")
                .quit();
    }
}
