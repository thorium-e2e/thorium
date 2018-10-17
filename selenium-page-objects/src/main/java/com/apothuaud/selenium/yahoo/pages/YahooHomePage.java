package com.apothuaud.selenium.yahoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class YahooHomePage {

    private WebDriver driver;

    private String url = "https://yahoo.com";

    @FindBy(how = How.ID, using = "uh-signin")
    private WebElement btn_signIn;

    @FindBy(how = How.ID, using = "uh-mail-link")
    private WebElement btn_mail;

    public YahooHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public YahooHomePage openPage() {
        this.driver.navigate().to(this.url);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        return this;
    }

    public void quit() {
        this.driver.close();
        this.driver.quit();
    }
    public YahooHomePage goToLoginPage() {
        btn_signIn.click();
        return this;
    }

    public YahooHomePage goToMailPage() {
        btn_mail.click();
        return this;
    }

    public YahooHomePage confirmOathIfNecessary() throws InterruptedException {
        OathConfirmPage oathPage = new OathConfirmPage(this.driver);
        if(oathPage.isThere()){
            oathPage.confirm();
        }
        return this;
    }
}
