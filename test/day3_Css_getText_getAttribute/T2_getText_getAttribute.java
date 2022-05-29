package com.cydeo.test.day3_Css_getText_getAttribute;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
       /* TC #5: getText() and getAttribute() method practice
        1- Open a chrome browser
        2- Go to: https://practice.cydeo.com/registration_form
        3- Verify header text is as expected:
        Expected: Registration form
        4- Locate “First name” input box
        5- Verify placeholder attribute’s value is as expected: Expected: first name*/


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/registration_form");

        WebElement header = driver.findElement(By.tagName("h2"));


        String expectedHeader = "Registration form";
        String actualHeader = header.getText();

        if(actualHeader.equals(expectedHeader)){
            System.out.println("header text verification Passed");
        }else {
            System.out.println("header text verification Failed");
        }

        WebElement box = driver.findElement(By.className("form-control"));
        String expectedPlaceHolder = "first name";
        String actualPlaceHolder = box.getAttribute("placeholder");

        if(actualPlaceHolder.equals(expectedPlaceHolder)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }




    }
}
