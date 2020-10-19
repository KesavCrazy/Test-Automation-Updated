package com.kesav.SeleniumPrac;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.*;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWait {
	public static void main(String[]args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();

	        driver.get("https://opensource-demo.orangehrmlive.com");
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        
	        driver.findElement(By.id("btnLogin")).click();
	      
	        // driver.findElement(By.id("agsdgj")).sendKeys("shguyafg");//i used this for checking purpose
	        
	        boolean b_result = f_verify_element_exists(driver.findElement(By.xpath("//*[@id=\"menu_dashboard_index\"]/b")));
	        if (b_result==true) {
	        	System.out.println("Successfully Logged in");
	        }
	        else {
	        	System.out.println("Login unsuccessful");
	        }
	        
	}
	 private static boolean f_verify_element_exists(WebElement findElement) {
         // TODO Auto-generated method stub
          if(findElement!= null){
                 System.out.println("Element is Present");
                 return true;
             }else{
                 System.out.println("Element is Absent");
                 return false;
             }
     }
}
