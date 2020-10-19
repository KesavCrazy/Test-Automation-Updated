package com.kesav.SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class GetText {
	  public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");

		  WebDriver driver = new ChromeDriver();

	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();  
	
	System.out.println(driver.getTitle());
	
	String var = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).getText();
	System.out.print(var);
	  }
}
