package com.apothuaud.selenium.samples.common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;

public class PageObject {

    protected final HashMap env;
    protected WebDriver driver;

    public PageObject(WebDriver driver, HashMap env){
        this.env = env;
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
