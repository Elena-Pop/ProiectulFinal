package com.herokuapp.tests;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected static WebDriver driver;
    @BeforeMethod
    private void setUp(){
        //Deschidem pagina
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @AfterMethod
    private void tearDown() {
        // Inchidem pagina
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
