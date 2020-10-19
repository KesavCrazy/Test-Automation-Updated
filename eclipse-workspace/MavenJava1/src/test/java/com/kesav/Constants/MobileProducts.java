package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.kesav.Utility.BaseTest;
import com.kesav.Utility.ScreenShot;

public class MobileProducts {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(MobileProducts.class.getName());
	
	 public MobileProducts(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath=" //span[contains(text(),'Samsung Galaxy M31 (Space Black, 6GB RAM, 128GB St')]")
	 WebElement galaxyM31;

	 public void galaxyM31()
	 {
		 try
			
		 {
			 galaxyM31.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("galaxyM31 : Clicked", color.GREEN));
				log.error("galaxyM31 Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("galaxyM31 : Not Clicked", color.RED));
		    	log.error("galaxyM31 Not Clicked");
		    	throw new NoSuchElementException(null);
		}
		
	 
	 }
}
