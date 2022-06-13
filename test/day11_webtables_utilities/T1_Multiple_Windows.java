package com.cydeo.test.day11_webtables_utilities;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class T1_Multiple_Windows extends TestBase {




    @Test
    public void windowsHandleTest(){

        //   2. Go to:https://www.amazon.com/

        driver.get("https://www.amazon.com/");

        //   3. Copy paste the lines from below in to your class

        ((JavascriptExecutor) driver).executeScript("window.open('http://google.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://etsy.com/','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('http://facebook.com/','_blank');");


        //   4. Create a logic to switch to the tab where Etsy.com is open
        Set<String> allWindowHandles = driver.getWindowHandles();

        for(String eachWindow : allWindowHandles){
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

            if(driver.getCurrentUrl().contains("etsy")){
                break;
            }
        }

        //   5. Assert: Title contains "Etsy"
        String actualTitle = driver.getTitle();
        String expectedTitle =  "Etsy";
        Assert.assertEquals(actualTitle.contains(expectedTitle), "Title verification failed");

       // BrowserUtils.switchWindowAndVerify(driver,"etsy", "Etsy");
    }




}
