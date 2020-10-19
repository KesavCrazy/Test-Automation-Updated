package com.kesav.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class Upload {
	public static void  main(String[] args) {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");	 
		WebDriver driver = new ChromeDriver(); 
	    driver.navigate().to("http://demo.guru99.com/test/upload/");
	    driver.manage().window().maximize();
        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
        uploadElement.sendKeys("C:\\Users\\Admin\\Desktop\\ScreenShot\\2020-08-18T15_16_55.846.png");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();
	}
}
