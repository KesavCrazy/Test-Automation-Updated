package com.kesav.Constants;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.SkipException;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.kesav.Utility.BaseTest;

public class AppliancesBrands {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public AppliancesBrands(WebDriver driver,	ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//span[contains(text(),'VR')]")
	 WebElement vr;
	
	 @FindBy(xpath="//span[contains(text(),'HealthSense')]")
	 WebElement healthSense;
	 
	 @FindBy(xpath="//span[contains(text(),'Usha')]")
	 WebElement usha1;
	 
	 @FindBy(xpath="//span[contains(text(),'USHA')]")
	 WebElement usha2;

	 @FindBy(xpath="//span[contains(text(),'KENT')]")
	 WebElement kent;
	
	 @FindBy(xpath="//span[contains(text(),'Prestige')]")
	 WebElement prestige;	
	 
	 public void vr()
	 {

		 try
			{
			 vr.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("vr : Clicked", color.GREEN));
	    	 log.debug("vr  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("vr : Clicked", color.RED));
		    	 log.error("vr Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
	 public void healthSense()
	 {
		 	
		 try
			{
			 healthSense.click();
			 test.log(Status.PASS, MarkupHelper.createLabel("healthSense : Clicked", color.GREEN));
	    	 log.debug("androidBased  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("healthSense : Clicked", color.RED));
		    	 log.error("healthSense Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
	 public void usha1()
	 {
		
		 try
			{
			 usha1.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("healthSense : Clicked", color.GREEN));
	    	 log.debug("healthSense  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("healthSense : Clicked", color.RED));
		    	 log.error("healthSense Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
	 
	 public void usha2()
	 {
		
		 try
			{
			 usha2.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("usha2 : Clicked", color.GREEN));
	    	 log.debug("usha2  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("usha2 : Clicked", color.RED));
		    	 log.error("usha2 Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
	 public void kent()
	 {
				
		 try
			{
			 kent.click();
			 test.log(Status.PASS, MarkupHelper.createLabel("kent : Clicked", color.GREEN));
	    	 log.debug("kent  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("kent : Clicked", color.RED));
		    	 log.error("kent Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
	 public void prestige()
	 {
	
		 try
			{
			 prestige.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("prestige : Clicked", color.GREEN));
	    	 log.debug("prestige  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("prestige : Clicked", color.RED));
		    	 log.error("prestige Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
		}	 		 
	 
	
	
