package com.apothuaud.selenium.yahoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class OathConfirmPage {

    private WebDriver driver;

    private String url = "https://www.yahoo.com";

    @FindBy(how = How.NAME, using = "agree")
    private WebElement btn_confirm;

    public OathConfirmPage(WebDriver driver) {
        this.driver = driver;
    }

    public OathConfirmPage openPage() {
        this.driver.navigate().to(this.url);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        System.out.println("Openned page " + this.getClass().getName() + " @ " + this.url);
        return this;
    }

    public OathConfirmPage confirm() {
        btn_confirm.click();
        return this;
    }

    public void quit() {
        System.out.println("Quit " + this.getClass().getName());
        this.driver.close();
        this.driver.quit();
    }

    public boolean isThere() throws InterruptedException {
        Thread.sleep(5000);
        if(btn_confirm.isDisplayed()){
            return true;
        }
        return false;
    }
}
