package com.apothuaud.selenium.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class SPage {

    private WebDriver driver;

    private String url = "myUrl";

    @FindBy(how = How.ID, using = "myId")
    private WebElement input_search;

    public SPage(WebDriver driver) {
        this.driver = driver;
    }

    public SPage openPage() {
        this.driver.navigate().to(this.url);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        return this;
    }

    public SPage myMethod() {
        // actions
        return this;
    }

    public void quit() {
        this.driver.close();
        this.driver.quit();
    }
}
