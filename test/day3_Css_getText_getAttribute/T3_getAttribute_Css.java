package com.cydeo.test.day3_Css_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_getAttribute_Css {
    public static void main(String[] args) {

        /*TC #3: NextBaseCRM, locators, getText(), getAttribute() practice
        1- Open a chrome browser
        2- Go to: https://login1.nextbasecrm.com/
        3- Verify “Log in” button text is as expected:
           Expected: Log In*/




        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://login1.nextbasecrm.com/");

        WebElement loginButton = driver.findElement(By.cssSelector("input[class='login-btn']"));

        String expected = "Log In";
        String actual = loginButton.getAttribute("value");
        System.out.println("actualBtnText = " + actual);

        if(actual.equals(expected)){
            System.out.println("Log in button text verification passed");
        }else{
            System.out.println("Log in button text verification failed");
        }





    }
}
