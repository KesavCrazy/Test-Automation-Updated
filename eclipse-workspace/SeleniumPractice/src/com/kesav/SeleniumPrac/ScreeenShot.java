package com.kesav.SeleniumPrac;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class ScreeenShot {
	public static void main(String[] args) throws IOException{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	        
	        WebDriver driver = new ChromeDriver();

	      driver.get("http://instagram.com");
	    
	      //wait until the page to get load //Kesav just check your screenshot folder to know about this in future 
	      WebDriverWait wait = new WebDriverWait(driver,3000);
	        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"react-root\"]/section/main/article/div[2]/div[1]/div/form/div[2]/div/label/input")));
	     
	        // driver.navigate().to("http://instagram.com");
	      
	      TakesScreenshot screenShot = (TakesScreenshot)driver;
		  File tempScreenshot = screenShot.getScreenshotAs(OutputType.FILE);
		  String destFileFolder = "C:\\Users\\Admin\\Desktop\\ScreenShot";
		  String destFileName = DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now()).replaceAll(":", "_");
		  String destFileExten = ".png";
		  
		  File dest =new File (destFileFolder + "\\" + destFileName + destFileExten);
		  Files.copy(tempScreenshot, dest);
	}

}
