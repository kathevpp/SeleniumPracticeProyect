package com.cydeo.test.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_Navigations {
    public static void main(String[] args) throws InterruptedException {

        // 1. Setting up webdriver manager
        WebDriverManager.chromedriver().setup();

        // 2. Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.etsy.com");
        //another way to write

        // navigate().to() method is for navigating to web page
        //driver.navigate().to("https://www.etsy.com");

        // It is using stopping application. we are giving time to application to see steps
        Thread.sleep(3000);

        // navigate().to() method is for navigating to back from web page
        driver.navigate().refresh();

        System.out.println("Etsy page driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.get("https://www.tesla.com");

        System.out.println("Tesla page driver.getTitle() = " + driver.getTitle());
        System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());

        driver.close();


        // String currentTitle = driver.getTitle();



        Thread.sleep(3000);

        // navigate().forward()method is for navigating to forward from web page
        driver.navigate().forward();
    }
}
