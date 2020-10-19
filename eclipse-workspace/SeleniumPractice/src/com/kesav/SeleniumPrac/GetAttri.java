package com.kesav.SeleniumPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetAttri {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");

	  WebDriver driver = new ChromeDriver();

	  driver.get("https://www.spicejet.com/");
	  System.out.println(driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1")).getAttribute("display: none;"));
	}

}
