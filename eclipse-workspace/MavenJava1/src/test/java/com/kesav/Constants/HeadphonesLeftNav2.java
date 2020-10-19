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

public class HeadphonesLeftNav2 {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public HeadphonesLeftNav2(WebDriver driver,	ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//span[contains(text(),'Wired & Wireless')]")
	 WebElement wiredWireless;
	
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[1]/span/span/div/label/span/span")
	 WebElement wired;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[3]/span/span/div/label/span/span")
	 WebElement wireless;
	 
	 @FindBy(xpath="//span[contains(text(),'Sports & Fitness')]")
	 WebElement sportAndFitness;
	
	
	
	 
	 public void wiredWireless()
	 {
		 try
			{
			 wiredWireless.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("wiredWireless : Clicked", color.GREEN));
	    	 log.debug("wiredWireless  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("wiredWireless : Clicked", color.RED));
		    	 log.error("wiredWireless Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
	 
	 public void wired()
	 {
 
		 try
			{
			 wired.click();		
			 test.log(Status.PASS, MarkupHelper.createLabel("wired : Clicked", color.GREEN));
	    	 log.debug("wired  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("wired : Clicked", color.RED));
		    	 log.error("wired Not Clicked");
		    	 throw new NoSuchElementException(null);
		    }
	 }
	 
	 public void wireless()
	 {
		 try
			{
			 wireless.click();				
			 test.log(Status.PASS, MarkupHelper.createLabel("wireless : Clicked", color.GREEN));
	    	 log.debug("wireless  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("wireless : Clicked", color.RED));
		    	 log.error("wireless Not Clicked");
		    	 throw new NoSuchElementException(null);
		    }
	 }
	 
	 public void sportAndFitness()
	 {
				
		 try
			{
			 sportAndFitness.click();			
			 test.log(Status.PASS, MarkupHelper.createLabel("sportAndFitness : Clicked", color.GREEN));
	    	 log.debug("sportAndFitness  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("sportAndFitness : Clicked", color.RED));
		    	 log.error("sportAndFitness Not Clicked");
		    	 throw new NoSuchElementException(null);
		    }
	 } 
		}	 		 
	 
	
	
