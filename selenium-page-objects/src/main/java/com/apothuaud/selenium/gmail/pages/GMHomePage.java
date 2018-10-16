package com.apothuaud.selenium.gmail.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class GMHomePage {

    private WebDriver driver;

    private String url = "https://mail.google.com";

//    @FindBy(how = How.ID, using = "myId")
//    private WebElement input_search;

    public GMHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public GMHomePage openPage() {
        this.driver.navigate().to(this.url);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        return this;
    }

//    public GMHomePage myMethod() {
//        // actions
//        return this;
//    }

    public void quit() {
        this.driver.close();
        this.driver.quit();
    }
}
