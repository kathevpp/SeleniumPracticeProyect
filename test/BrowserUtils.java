package com.cydeo.test;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.Set;

public class BrowserUtils {

    public static void switchWindowAndVerify(WebDriver driver, String expectInUrl, String expectedTitle){

        Set<String> allWindowHandle = driver.getWindowHandles();

        for(String eachWindow : allWindowHandle){
            driver.switchTo().window(eachWindow);

            if(driver.getCurrentUrl().contains(expectInUrl)){
                break;
            }
        }

        String actualTitle = driver.getTitle();

        Assert.assertEquals(actualTitle.contains(expectedTitle), "Title verification failed!");
    }

    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(),expectedTitle, "Title verification failed!");
    }
}
