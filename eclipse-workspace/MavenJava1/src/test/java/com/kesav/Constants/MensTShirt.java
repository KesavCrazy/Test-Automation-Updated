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

public class MensTShirt {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(MensTShirt.class.getName());
	
	 public MensTShirt(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//span[contains(text(),\"Men's Full Sleeve Cotton Hooded T-Shirt\")]")
	 WebElement eyeboglerRoudnNeck;

	 public void eyeboglerRoudnNeck()
	 {
		 try
			
		 {
			 eyeboglerRoudnNeck.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("eyeboglerRoudnNeck : Clicked", color.GREEN));
				log.error("eyeboglerRoudnNeck Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("eyeboglerRoudnNeck : Not Clicked", color.RED));
		    	log.error("eyeboglerRoudnNeck Not Clicked");
		    	throw new NoSuchElementException(null);
		}
		
	 
	 }
}
