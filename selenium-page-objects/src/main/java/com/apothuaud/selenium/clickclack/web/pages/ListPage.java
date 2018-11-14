package com.apothuaud.selenium.clickclack.web.pages;

import com.apothuaud.selenium.samples.common.PageObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ListPage extends PageObject {

    @FindBy(className = "content-item")
    List<WebElement> clacks;

    public static String url = "/clacks";

    public ListPage(WebDriver driver, HashMap env) {
        super(driver, env);
    }

    public String getLastClackId() throws IOException {
        WebElement lastClackElement = clacks.get(clacks.size()-1).findElement(By.tagName("a")).findElement(By.tagName("p"));
        JsonNode lastClack = new ObjectMapper().readTree(lastClackElement.getText());
        String lastClackId = lastClack.findValue("_id").toString().replace("\"", "");
        return lastClackId;
    }

    public boolean verifyPresenceOfClackById(String testClackId) throws IOException {
        for (int i = 0; i < clacks.size(); i++) {
            WebElement clack = clacks.get(i);
            WebElement clackElement = clack.findElement(By.tagName("a")).findElement(By.tagName("p"));
            JsonNode clackNode = new ObjectMapper().readTree(clackElement.getText());
            String clackId = clackNode.findValue("_id").toString().replace("\"", "");
            if(clackId.equals(testClackId)){
                return true;
            }
        }
        return false;
    }
}
