package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class InputsPage extends BasePage{
    public final static String INPUTS_URL = BASE_URL+"inputs";

    public InputsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="input[type=number]")
    private WebElement numberInput;

    public void enterNumberInInput(String number){
        numberInput.click();
        numberInput.sendKeys(number);
    }

    public String verifyEnteredNumber(){
        return numberInput.getAttribute("value");
    }
}
