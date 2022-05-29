package com.cydeo.test.Task;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgotPasswordUrlVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/forgot_password");

        WebElement emailbox = driver.findElement(By.name("email"));
        emailbox.sendKeys("kathevpp@gmail.com");


        WebElement retrievePassword = driver.findElement(By.cssSelector("button[class='radius']"));
        retrievePassword.click();

        //Expected: "email_sent"
        String expectedUrlContains = "email_sent";
        String currentUrlContains = driver.getCurrentUrl();

        if(currentUrlContains.equals(expectedUrlContains)){
            System.out.println("URL contains correct text");
        }else{
            System.out.println("URL contains correct text");
        }

        //expected: "Your e-mail's been sent!"
        String expectedTextBox = "Your e-mail's been sent!";
        String textBox = driver.findElement(By.xpath("//*[@id=\"content\"]/h4")).getText();
        if(textBox.equals(expectedTextBox)){
            System.out.println("Textbox is correct");
        }else{
            System.out.println("Textbox is incorrect");
        }



        /*String expectedTextBox = "Your e-mail's been sent!";

        if(currentTextBox.equals(expectedTextBox)){
            System.out.println("Textbox is correct");
        }else{
            System.out.println("textbox is incorrect");
        }*/






    }
}
