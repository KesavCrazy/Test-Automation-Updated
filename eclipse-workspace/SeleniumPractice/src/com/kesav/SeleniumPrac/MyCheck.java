package com.kesav.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class MyCheck {
public static void  main(String[] args) throws InterruptedException{
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");	 
	WebDriver driver = new ChromeDriver(); 
    driver.navigate().to("https://www.amazon.com/");
    driver.manage().window().maximize();
    System.out.println(driver.getCurrentUrl());
    driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[2]/div[3]/div/div[2]/a/div/img")).click();
    
	
}
}
