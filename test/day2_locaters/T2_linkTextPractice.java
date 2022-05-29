package com.cydeo.test.day2_locaters;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_linkTextPractice {
    public static void main(String[] args) throws InterruptedException {



//    1- Open a chrome browser

    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2- Go to: https://practice.cydeo.com/

        driver.get("https://practice.cydeo.com/");

        Thread.sleep(3000);


//            3- Click to A/B Testing from top of the list.
        WebElement abLinkText =  driver.findElement(By.linkText("A/B Testing"));
        abLinkText.click();

//4- Verify title is:
//    Expected: No A/B Test

        String currentTitle = driver.getTitle();
        String expectTitle = "No A/B Test";

        if(currentTitle.equals(expectTitle)){
            System.out.println("No A/B Test title verification passed!");
        }else {
            System.out.println("No A/B Test title verification failed!");
        }

//5- Go back to home page by using the .back();
        driver.navigate().back();

        Thread.sleep(3000);

//6- Verify title equals:
        //    Expected: Practice

        expectTitle = "Practice";
        currentTitle = driver.getTitle();

        if(currentTitle.equals(expectTitle)){
            System.out.println("Practice title verification passed!");
        }else{
            System.out.println("Practice title verification failed!");
        }
        driver.quit();


}}
