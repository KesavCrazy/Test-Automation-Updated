package com.kesav.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class Equals {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://facebook.com");
	      String var =  driver.getTitle();
	      String var2 = "Facebook – log in or sign up";
	      System.out.println(var);
	      System.out.println(var.equals(var2));
	}
}
