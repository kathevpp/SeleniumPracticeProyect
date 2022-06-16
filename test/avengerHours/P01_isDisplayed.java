package com.cydeo.test.avengerHours;

import com.cydeo.test.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class P01_isDisplayed extends TestBase {

    @Test
    public void test1(){
        //1-navigate to "http://www.uitestpractice.com/"

        driver.get("http://www.uitestpractice.com/");

        //2-verify main page is launched;
        // -"Testing Controls" Tab should be displayed on left top (visible and enabled)

        WebElement testingControls = driver.findElement(By.cssSelector(".navbar-brand"));

        Assert.assertTrue(testingControls.isDisplayed() && testingControls.isEnabled());

    }
}
