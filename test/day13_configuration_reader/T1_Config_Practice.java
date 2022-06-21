package com.cydeo.test.day13_configuration_reader;

import com.cydeo.test.base.TestBase;
import com.cydeo.test.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_Config_Practice extends TestBase {

    //1. Create new test and make set ups

    @Test
    public void login_crm_app(){

        //2. Go to: http://login1.nextbasecrm.com/
        // driver.get("https://login1.nextbasecrm.com/");
        driver.get(ConfigurationReader.getProperty("env"));

        //3. Enter valid username
        WebElement inputUsername = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        //inputUsername.sendKeys("hr1@cyde.com");
        inputUsername.sendKeys(ConfigurationReader.getProperty("username"));

        //4. Enter valid password
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        //inputPassword.sendKeys("UserUser");
        inputPassword.sendKeys(ConfigurationReader.getProperty("password"));

        //5. Click lo log in button
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        //6. Verify title is as expected:
        // Expected: Portal
     //   BrowserUtils.verifyTitle(driver, "Portal");

    }

}
