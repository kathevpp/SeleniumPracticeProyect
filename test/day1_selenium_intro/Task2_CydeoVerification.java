package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_CydeoVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com");

        //actual URL come from selenium
        String actualUrl = driver.getCurrentUrl();

        // expected URL comes from requirements
        String expectedUrl = "cydeo";

        if(actualUrl.contains(expectedUrl)){
            System.out.println("URL verification is passed");
        }else {
            System.out.println("URL verification is failed");
        }

        //actual title come from selenium
        String actualTitle = driver.getTitle();

        //expected title come from requirements
        String expectedTitle = "Practice";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("The title its right");
        }else{
            System.out.println("The title is incorrect");
        }




        driver.quit();

    }
}
