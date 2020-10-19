package com.kesav.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class Navigation {
	

	public static void  main(String[] args) throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");	 
		WebDriver driver = new ChromeDriver(); 
	    driver.navigate().to("https://www.google.com/");
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.yahoo.com/");
	    driver.navigate().back();
	    driver.close();
	 //   driver.quit();
		
	
	}

}
