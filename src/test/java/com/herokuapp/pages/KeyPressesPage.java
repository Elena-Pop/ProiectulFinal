package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KeyPressesPage extends BasePage{
    public final static String KEY_PRESSES_URL = BASE_URL+"key_presses";
    @FindBy(id = "target")
    WebElement keyPresses;
    @FindBy(id="result")
    WebElement youEntered;
    public KeyPressesPage(WebDriver driver) {
        super(driver);
    }
    public void enterKey(String y){
        keyPresses.click();
        keyPresses.sendKeys(y);
    }
    public String checkYouEntered(){
        return youEntered.getText();
    }
    public boolean youEnteredIsDisplayed(){
        return youEntered.isDisplayed();
    }

}
