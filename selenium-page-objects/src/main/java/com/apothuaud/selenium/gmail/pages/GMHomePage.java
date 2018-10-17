package com.apothuaud.selenium.gmail.pages;

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
public class GMHomePage {

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
    @FindBy(how = How.XPATH, using = "//*[@id=\":31\"]/div[1]/span")
    private WebElement cb_all;

    @FindBy(how = How.XPATH, using = "//*[@id=\":5\"]/div/div[1]/div[1]/div/div/div[2]/div[3]/div")
    private WebElement btn_trash;

    @FindBy(how = How.XPATH, using = "//*[@id=\":35\"]")
    private WebElement table_messages;

    @FindBy(how = How.XPATH, using = "//*[@id=\":kv\"]/div/div[2]/div")
    private WebElement div_nbMessages;

    @FindBy(how = How.XPATH, using = "//*[@id=\":ko\"]/div/div")
    private WebElement btn_compose;

    @FindBy(how = How.NAME, using = "to")
    private WebElement input_receiver;

    @FindBy(how = How.NAME, using = "subjectbox")
    private WebElement input_subject;

    @FindBy(how = How.XPATH, using = "//*[@id=\":738\"]")
    private WebElement input_message;

    @FindBy(how = How.XPATH, using = "//*[@id=\":71i\"]")
    private WebElement btn_send;

    /*
        Methods
     */
    // COMMON
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

    public void quit() {
        this.driver.close();
        this.driver.quit();
    }

    private void waitForVisibilityOfElement(WebElement element) {
        wait = new WebDriverWait(this.driver, this.WAIT_TIMEOUT);
        ExpectedCondition<WebElement> cdtn = ExpectedConditions.visibilityOf(element);
        wait.until(cdtn);
    }

    private boolean isElementPresent(WebElement element) {
        try {
            element.getTagName();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    // SPECIFIC
    public GMHomePage clearAllMessages() {
        while (isElementPresent(table_messages)) {
            cb_all.click();
            btn_trash.click();
        }
        return this;
    }

    private int getNbUnread() {
        return Integer.valueOf(div_nbMessages.getText());
    }

    public GMHomePage verifyNbUnread(int i) {
        assert i == getNbUnread();
        return this;
    }

    public GMHomePage sendMail(String receiver, String subject, String content) {
        btn_compose.click();
        waitForVisibilityOfElement(input_receiver);
        input_receiver.click();
        input_receiver.sendKeys(receiver);
        input_subject.click();
        input_subject.sendKeys(subject);
        input_message.sendKeys(content);
        btn_send.click();
        wait = new WebDriverWait(this.driver, 10);
        ExpectedCondition<Boolean> cdtn = ExpectedConditions.invisibilityOf(input_receiver);
        wait.until(cdtn);
        return this;
    }
}
