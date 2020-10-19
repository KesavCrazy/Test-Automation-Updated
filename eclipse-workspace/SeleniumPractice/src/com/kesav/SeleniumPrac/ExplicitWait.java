package com.kesav.SeleniumPrac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://opensource-demo.orangehrmlive.com");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        
	        driver.findElement(By.id("btnLogin")).click();
	        
	        WebDriverWait wait = new WebDriverWait(driver,1000);
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"div_graph_display_emp_distribution\"]/canvas[2]")));
	
	boolean status = element.isDisplayed();
    
    // if else condition
    if (status) {
    	System.out.println(status);
        System.out.println("===== Image is visible======");
    } else {
        System.out.println("===== Image is not visible======");
    }
	}
}
