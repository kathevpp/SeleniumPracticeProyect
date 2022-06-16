package com.cydeo.test.Task;

import com.cydeo.test.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TruckDriver {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        //        1. Open Chrome browser
        //        2. Go to https://qa2.vytrack.com/user/login

        driver = WebDriverFactory.getDriver("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://qa2.vytrack.com/user/login");

    }
    @Test
    public void FleetSheetTest(){

        WebElement login = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        login.sendKeys("user183");

        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");

        WebElement loginBtn = driver.findElement(By.xpath("//button[@id='_submit']"));
        loginBtn.click();

        WebElement fleetBtn = driver.findElement(By.xpath("(//a[@class= 'unclickable'])[1]"));
        //Creating object of an Actions class
        Actions action = new Actions(driver);

        //Performing the mouse hover action on the target element.
        action.moveToElement(fleetBtn).perform();

        WebElement vehicle = driver.findElement(By.xpath("//span[.='Vehicles']"));
        action.moveToElement(vehicle).perform();
        vehicle.click();

        WebElement car = driver.findElement(By.xpath("//table[@class='grid table-hover table table-bordered table-condensed']//tbody//tr[1]//td[1]"));
        car.click();



        WebElement addEventBtn = driver.findElement(By.xpath("//a[@data-id='8373']"));
        addEventBtn.click();

        driver.switchTo().frame("//iframe[@id='oro_calendar_event_form_description-uid-62a6695df3427_ifr']");

        WebElement addEvent = driver.findElement(By.xpath("//input[contains(@ id,'62a6695df31b2')]"));
        addEvent.sendKeys("Practice Group #31");
}
}
