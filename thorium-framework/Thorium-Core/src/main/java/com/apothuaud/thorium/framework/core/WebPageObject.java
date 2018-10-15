package com.apothuaud.thorium.framework.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebPageObject {

    protected WebDriver driver;
    private WebDriverWait wait;

    public WebPageObject() {
        // ToDo: Read config from json file
        System.setProperty("webdriver.chrome.driver", "src/test/resources/bin/chromedriver");
        this.driver = new ChromeDriver();
        PageFactory.initElements(driver, this);
    }

    public void quit() {
        this.driver.close();
        this.driver.quit();
    }

    protected void waitForElementToAppear(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    protected void waitForElementToDisappear(By locator) {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    protected void waitForTextToAppear(By locator, String text) {
        wait.until(ExpectedConditions.textToBe(locator, text));
    }

    protected void waitForTextToDisappear(By locator, String text) {
        wait.until(ExpectedConditions.not(ExpectedConditions.textToBe(locator, text)));
    }
}
