package com.apothuaud.thorium.wikipedia.pages;

import com.apothuaud.thorium.framework.core.WebPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@SuppressWarnings({"WeakerAccess", "FieldCanBeLocal", "unused"})
public class HomePage extends WebPageObject {

    @FindBy(id = "searchInput")
    private WebElement input_search;

    private static String url = "https://www.wikipedia.org/";

    public HomePage openPage() {
        this.driver.navigate().to(getUrl());
        this.driver.manage().window().maximize();
        return this;
    }

    public HomePage search(String query) {
        input_search.clear();
        input_search.sendKeys(query);
        // take snapshot
        // log
        input_search.submit();
        return this;
    }
}
