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

public class CricketProducts {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public CricketProducts(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//div[contains(@class,'a-fixed-left-flipped-grid s-padding-left-small s-padding-right-small s-span-page a-spacing-top-small')]//div[4]//div[1]//div[1]//div[1]//a[1]//img[1]")
	 WebElement cricketBat;
	 
	 @FindBy(xpath="//span[contains(text(),'SG Sierra Plus Kashmir Willow Cricket Bat ( Size:')]")
	 WebElement bat;

	
	 public void cricketBat()
	 {
		 try
			
		 {
			 cricketBat.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("cricketBat : Clicked", color.GREEN));
				log.error("cricketBat Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("cricketBat : Not Clicked", color.RED));
		    	log.error("cricketBat Not Clicked");
		    	throw new NoSuchElementException(null);
		}
	 }
	 public void bat()
	 {
		 try
			
		 {
			    bat.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("bat : Clicked", color.GREEN));
				log.error("bat Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("bat : Not Clicked", color.RED));
		    	log.error("bat Not Clicked");
		    	throw new NoSuchElementException(null);
		}
	 }
}
