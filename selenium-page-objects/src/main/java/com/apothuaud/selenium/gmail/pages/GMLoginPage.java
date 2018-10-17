package com.apothuaud.selenium.gmail.pages;

import com.apothuaud.selenium.google.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

@SuppressWarnings({"FieldCanBeLocal", "unused"})
public class GMLoginPage {

    /*
        ATTRS
     */
    // COMMON
    private WebDriver driver;
    private WebDriverWait wait;
    private String url = "https://accounts.google.com/ServiceLogin?hl=fr&service=mail";
    private int WAIT_TIMEOUT = 10;
    // SPECIFIC

    /*
        Web Elements
     */
    @FindBy(how = How.ID, using = "identifierId")
    private WebElement input_identifier;

    @FindBy(how = How.XPATH, using = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
    private WebElement input_password;

    /*
        Methods
     */
    // COMMON
    public GMLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public GMLoginPage openPage() {
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

    private void waitForVisibilityOfElement(WebElement element) {
        wait = new WebDriverWait(this.driver, this.WAIT_TIMEOUT);
        ExpectedCondition<WebElement> cdtn = ExpectedConditions.visibilityOf(element);
        wait.until(cdtn);
    }

    // SPECIFIC
    public void login(Account account) {
        this.waitForEmailField();
        this.typeEmail(account);
        this.waitForPasswordField();
        this.typePassword(account);
    }

    private void typePassword(Account account) {
        input_password.clear();
        input_password.sendKeys(account.getPassword());
        input_password.submit();
    }

    private void waitForPasswordField() {
        this.waitForVisibilityOfElement(input_password);
    }

    private void waitForEmailField() {
        this.waitForVisibilityOfElement(input_identifier);
    }

    private void typeEmail(Account account) {
        input_identifier.clear();
        input_identifier.sendKeys(account.getMail());
        input_identifier.submit();
    }
}
