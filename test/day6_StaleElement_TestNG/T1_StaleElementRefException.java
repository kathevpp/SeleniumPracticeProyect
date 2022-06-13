package com.cydeo.test.day6_StaleElement_TestNG;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_StaleElementRefException {
    /*TC #1: StaleElementReferenceException handling
1. Open Chrome browser
2. Go to https://practice.cydeo.com/add_remove_elements/
3. Click to “Add Element” button
4. Verify “Delete” button is displayed after clicking.
5. Click to “Delete” button.
6. Verify “Delete” button is NOT displayed after clicking.*/

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/add_remove_elements/");

        WebElement elementButton = driver.findElement(By.xpath("//button[.='Add Element']"));
        elementButton.click();
        WebElement deletebutton = driver.findElement(By.cssSelector("button[class='added-manually']"));
        System.out.println("before clicking deletebutton.isDisplayed() = " + deletebutton.isDisplayed());
        deletebutton.click();
        //System.out.println("after clicking deletebutton.isDisplayed() = " + deletebutton.isDisplayed());

        try{

            System.out.println("after clicking deletebutton.isDisplayed() = " + deletebutton.isDisplayed());

        }catch(StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is throw");
            System.out.println("This means the web element is completely deleted from the page and html");
        }

    }
}
