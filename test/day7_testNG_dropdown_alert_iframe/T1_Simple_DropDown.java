package com.cydeo.test.day7_testNG_dropdown_alert_iframe;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_Simple_DropDown {

    WebDriver driver;

    @BeforeClass
    public void setUpMethod(){
        System.out.println("Before method is running");
        // set up chrome and create WebDriver instance
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //Providing extra time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void dropDownTest(){

        Select simpleDropdown = new Select(driver.findElement(By.id("dropdown")));
        String actualResult = simpleDropdown.getFirstSelectedOption().getText();
        String expectedResult = "Please select an option";

        Assert.assertEquals(actualResult, expectedResult, "Dropdown verification is failed!");

    }

    @Test
    public void stateDropdownTest(){

        Select stateDropdown = new Select(driver.findElement(By.id("state")));
        String actualState = stateDropdown.getFirstSelectedOption().getText();
        String expectedState = "Select a State";

        Assert.assertEquals(actualState,expectedState, "Dropdown verification is failed!");
    }

    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}
