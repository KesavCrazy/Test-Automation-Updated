package com.kesav.SeleniumPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class AlertDemo {
 public static void main(String[] args) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
      
      WebDriver driver = new ChromeDriver();

      driver.get("http://rahulshettyacademy.com/AutomationPractice/");
      driver.findElement(By.id("name")).sendKeys("Elavarasi");
      driver.findElement(By.id("alertbtn")).click();
      System.out.println(driver.switchTo().alert().getText());
      driver.switchTo().alert().accept();
 }
}
