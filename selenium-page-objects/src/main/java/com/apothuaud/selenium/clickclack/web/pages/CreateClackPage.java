package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class CreateClackPage extends PageObject {

    public static String url = "https://rec-clickclack-web.herokuapp.com/clacks/create";

    public CreateClackPage(WebDriver driver, HashMap env) {
        super(driver, env);
    }

    public CreateClackPage openPage() {
        driver.get(url);
        return this;
    }
}
