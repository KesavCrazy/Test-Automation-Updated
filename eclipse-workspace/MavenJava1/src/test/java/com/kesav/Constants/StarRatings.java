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

public class StarRatings {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public StarRatings(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//i[@class='a-icon a-icon-star-medium a-star-medium-4']")
	 WebElement fourStarsAbove;
	
	 @FindBy(xpath="//*[@id=\"p_72/1318477031\"]/span/a/section/i")
	 WebElement threeStarsAbove;
	 
	 @FindBy(xpath="//*[@id=\"p_72/1318478031\"]/span/a/section/i")
	 WebElement twoStarsAbove;
	 
	 @FindBy(xpath="//*[@id=\"p_72/1318479031\"]/span/a/section/i")
	 WebElement oneStarsAbove;
	 
	 public void fourStarsAbove()
	 {
		 try
			
		 {
				 fourStarsAbove.click();	
				 log.debug("fiftyFiveAbove  Clicked");
				    test.log(Status.PASS, MarkupHelper.createLabel("fourStarsAbove : Clicked", color.GREEN));
			 }
		    catch(NoSuchElementException e) {
		    	  test.log(Status.FAIL, MarkupHelper.createLabel("fourStarsAbove : Not Clicked", color.RED));
		    	  log.error("fiftyFiveAbove  Clicked");
		    	 throw new NoSuchElementException(null);
		}
		
	 }
	 public void threeStarsAbove()
	 {
		 try
			
		 {
			 threeStarsAbove.click();	 	
				    test.log(Status.PASS, MarkupHelper.createLabel("threeStarsAbove : Clicked", color.GREEN));
			 }
			
		    catch(NoSuchElementException e) {
		    	 test.fail("threeStarsAbove : Not Clicked");
		    	 throw new NoSuchElementException(null);
		    }
		
	 }
	 public void twoStarsAbove()
	 {
		 try
			
		 {
			 twoStarsAbove.click();	 	
				    test.log(Status.PASS, MarkupHelper.createLabel("twoStarsAbove : Clicked", color.GREEN));
			 }
			
		    catch(NoSuchElementException e) {
		    	 test.fail("twoStarsAbove : Not Clicked");
		    	 throw new NoSuchElementException(null);
		    }
		 
	 }
	 public void oneStarsAbove()
	 {
		 try
			
		 {
			 oneStarsAbove.click(); 
				    test.log(Status.PASS, MarkupHelper.createLabel("oneStarsAbove : Clicked", color.GREEN));
			 }
			
		    catch(NoSuchElementException e) {
		    	 test.fail("oneStarsAbove : Not Clicked");
		    	 throw new NoSuchElementException(null);
		    }
		
	 }
}
