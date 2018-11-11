package com.apothuaud.selenium.samples.yahoo.pages;

import com.apothuaud.selenium.samples.yahoo.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class YahooLoginPage {

    private WebDriver driver;

    private String url = "https://login.yahoo.com/";

    @FindBy(how = How.ID, using = "login-username")
    private WebElement input_loginUsername;

    @FindBy(how = How.ID, using = "login-signin")
    private WebElement btn_loginSignIn;

    @FindBy(how = How.ID, using = "login-passwd")
    private WebElement input_loginPasswd;

    public YahooLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public YahooLoginPage openPage() {
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

    public YahooLoginPage typeEmail(Account account) {
        input_loginUsername.clear();
        input_loginUsername.sendKeys(account.getEmail());
        btn_loginSignIn.click();
        return this;
    }

    public YahooLoginPage typePassword(Account account) {
        input_loginPasswd.clear();
        input_loginPasswd.sendKeys(account.getPassword());
        btn_loginSignIn.click();
        return this;
    }
}
