package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import org.openqa.selenium.WebDriver;

import java.util.HashMap;

public class ListPage extends PageObject {

    public static String url = "/clacks";

    public ListPage(WebDriver driver, HashMap env) {
        super(driver, env);
    }
}
