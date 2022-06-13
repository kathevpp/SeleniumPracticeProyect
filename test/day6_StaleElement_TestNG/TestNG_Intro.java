package com.cydeo.test.day6_StaleElement_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG_Intro {

    @Test (priority = 2)
   public void test1(){
        System.out.println("Test1 is running...");
        String actual = "apple";
        String expected = "apple";
        Assert.assertEquals(actual,expected,"Test1 did not pass!");
    }

    @Test (priority = 1)
    public void test2(){
        System.out.println("Test2 is running...");
        Assert.assertEquals("orange", "orange", "Test2 is running...");

    }
}
