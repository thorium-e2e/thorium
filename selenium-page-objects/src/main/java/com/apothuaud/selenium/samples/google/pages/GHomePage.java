package com.apothuaud.selenium.samples.google.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class GHomePage {

    private WebDriver driver;

    private String url = "http://www.google.com";

    @FindBy(how = How.ID, using = "lst-ib")
    private WebElement input_search;

    @FindBy(how = How.ID, using = "resultStats")
    private WebElement div_resultStats;

    @FindBy(how = How.CLASS_NAME, using = "r")
    private List<WebElement> div_results;

    public GHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public GHomePage openPage() {
        this.driver.navigate().to(this.url);
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(20, TimeUnit.SECONDS);
        PageFactory.initElements(driver, this);
        return this;
    }

    public GHomePage search(String s) {
        input_search.clear();
        input_search.sendKeys(s);
        input_search.submit();
        waitForResults();
        return this;
    }

    private void waitForResults() {
        WebDriverWait wait = new WebDriverWait(this.driver, 20);
        ExpectedCondition<WebElement> resultsAppear = ExpectedConditions.visibilityOf(div_resultStats);
        wait.until(resultsAppear);
    }

    public void quit() {
        this.driver.close();
        this.driver.quit();
    }
}
