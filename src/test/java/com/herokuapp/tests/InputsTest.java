package com.herokuapp.tests;

import com.herokuapp.pages.InputsPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.InputsPage.INPUTS_URL;

public class InputsTest extends BaseTest{
    @Test
    public void numberInput(){
        driver = new ChromeDriver();
        driver.get(INPUTS_URL);
        InputsPage inputsPage= new InputsPage(driver);
        inputsPage.enterNumberInInput("450");
        Assert.assertTrue(inputsPage.verifyEnteredNumber().contains("450"));




    }
}








