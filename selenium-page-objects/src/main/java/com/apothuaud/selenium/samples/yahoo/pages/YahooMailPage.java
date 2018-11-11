package com.apothuaud.selenium.samples.yahoo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class YahooMailPage {

    private WebDriver driver;

    private String url = "https://mail.yahoo.com";

    @FindBy(how = How.XPATH, using = "//*[@data-test-id=\"message-list-item\"]")
    private List<WebElement> links_emails;

    public YahooMailPage(WebDriver driver) {
        this.driver = driver;
    }

    public YahooMailPage openPage() {
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

    private int getNbMails() {
        return links_emails.size();
    }

    public YahooMailPage verifyNbMails(int expected) {
        assert expected == this.getNbMails();
        return this;
    }
}
