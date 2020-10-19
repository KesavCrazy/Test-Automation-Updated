package com.kesav.TestNg;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertDemo {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");
        Assert.assertTrue(driver.findElement(By.id("email")).isDisplayed());
        System.out.println(driver.findElement(By.id("email")).isDisplayed());
        
        Assert.assertFalse(driver.findElement(By.id("gasjhf")).isDisplayed());
        System.out.println(driver.findElement(By.id("hgasd")).isDisplayed());
       

	}
}
