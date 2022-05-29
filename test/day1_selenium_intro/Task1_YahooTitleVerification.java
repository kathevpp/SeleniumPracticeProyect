package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.yahoo.com");

        //actual title come from selenium
        String actualTitle = driver.getTitle();

        // expected title comes from requirements
        String expectedTitle = "Yahoo";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("Title verification is passed!");
        }else{
            System.out.println("Title verification is failed!");
        }

        driver.quit();

    }
}
