package com.cydeo.test.day4_cssSelector_xpath;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_css_isDisplayed {
    public static void main(String[] args) {
/*TC #1: XPATH and cssSelector Practices
1. Open Chrome browser
2. Go to https://practice.cydeo.com/forgot_password
3. Locate all the WebElements on the page using XPATH and/or CSS locator only (total of 6)
a. “Home” link
b. “Forgot password” header c. “E-mail” text
d. E-mail input box
e. “Retrieve password” button f. “Powered by Cydeo text
4. Verify all web elements are displayed.*/


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        //a. “Home” link
        WebElement home = driver.findElement(By.cssSelector("a[class='nav-link']"));


        //b. “Forgot password”
        WebElement forgotPassword = driver.findElement(By.cssSelector("div[class='example']"));


        //“E-mail” text
        WebElement email = driver.findElement(By.cssSelector("label[for='E-mail']"));


        //d. E-mail input box
        WebElement emailBox = driver.findElement(By.cssSelector("input[name='email']"));



        //e. “Retrieve password” button
        WebElement retrievePassButton = driver.findElement(By.cssSelector("button[id='form_submit']"));


        //f. “Powered by Cydeo text
        WebElement cydeo = driver.findElement(By.cssSelector("div[style='text-align: center;']"));

        //4. Verify all web elements are displayed.*/
        System.out.println("home.isDisplayed = " + home.isDisplayed());
        System.out.println("forgotPassword.isDisplayed = " + forgotPassword.isDisplayed());
        System.out.println("email.isDisplayed = " + email.isDisplayed());
        System.out.println("emailBox.isDisplayed = " + emailBox.isDisplayed());
        System.out.println("retrievePassButton.isDisplayed = " + retrievePassButton.isDisplayed());
        System.out.println("cydeo.isDisplayed = " + cydeo.isDisplayed());






    }
}
