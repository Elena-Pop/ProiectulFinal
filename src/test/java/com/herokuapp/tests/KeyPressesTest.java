package com.herokuapp.tests;

import com.herokuapp.pages.KeyPressesPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.KeyPressesPage.KEY_PRESSES_URL;

public class KeyPressesTest extends BaseTest{

    @Test
    public void keyEnter(){
        driver = new ChromeDriver();
        driver.get(KEY_PRESSES_URL);
        KeyPressesPage keyPressesPage = new KeyPressesPage(driver);
        keyPressesPage.enterKey("A");
        Assert.assertTrue(keyPressesPage.checkYouEntered().contains("You entered: A"));


    }
}
