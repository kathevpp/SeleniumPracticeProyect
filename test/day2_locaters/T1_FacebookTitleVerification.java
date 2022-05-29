package com.cydeo.test.day2_locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_FacebookTitleVerification {
    public static void main(String[] args) {

        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        //Verify title:
        //Expected: "Facebook - log in or sign up"

        //actual title come from selenium
        String actualTitle = driver.getTitle();

        //expected title come from requirements
        String expectedTitle = "Facebook - log in or sign up";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("The title its correct");
        }else{
            System.out.println("The title its incorrect");
        }

        driver.quit();








    }
}
