package com.herokuapp.tests;

import com.herokuapp.pages.NotificationMessageRenderedPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.NotificationMessageRenderedPage.NOTIFICATION_MESSAGE_RENDERED_URL;

public class NotificationMessageRenderedTest extends BaseTest{
    @Test
    public void notification(){
        driver = new ChromeDriver();
        driver.get(NOTIFICATION_MESSAGE_RENDERED_URL);
        NotificationMessageRenderedPage notificationMessageRenderedPage= new NotificationMessageRenderedPage(driver);
        notificationMessageRenderedPage.clickHere();
        Assert.assertTrue(notificationMessageRenderedPage.alertMessageIsDisplayed());

    }
}
