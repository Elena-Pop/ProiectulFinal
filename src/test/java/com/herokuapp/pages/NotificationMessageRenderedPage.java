package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NotificationMessageRenderedPage extends BasePage{
    public final static String NOTIFICATION_MESSAGE_RENDERED_URL = BASE_URL+"notification_message_rendered";

    @FindBy(id="flash")
    WebElement alertMessage;
    @FindBy(linkText = "Click here")
    WebElement clickHere;

    public NotificationMessageRenderedPage(WebDriver driver) {
        super(driver);
    }
    //    public void alertMessage(){
//        alertMessage.isDisplayed();
//    }
    public void clickHere(){
        clickHere.click();
    }
    public boolean alertMessageIsDisplayed(){
        return alertMessage.isDisplayed();
    }
}

