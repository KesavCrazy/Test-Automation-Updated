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

public class ClothingLeftNav {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public ClothingLeftNav(WebDriver driver,	ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//span[@class='a-size-small a-color-base'][contains(text(),'Women')]")
	 WebElement womenCheckBox;
	
	 @FindBy(xpath="//span[@class='a-size-small a-color-base'][contains(text(),'Men')]")
	 WebElement menCheckBox;
	 
	 @FindBy(xpath="//span[contains(text(),'Girls')]")
	 WebElement girlsCheckBox;
	 
	 @FindBy(xpath="//span[contains(text(),'Boys')]")
	 WebElement boys;
	
	 @FindBy(xpath="//span[@class='a-size-small a-color-base'][contains(text(),'Baby')]")
	 WebElement baby;	
	 
	 @FindBy(xpath="//span[contains(text(),'Western Wear')]")
	 WebElement westernWear;
	  
	 @FindBy(xpath="//span[contains(text(),'Ethnic Wear')]")
	 WebElement ethnicWear;
	 
	 @FindBy(xpath="//span[@class='a-size-small a-color-base'][contains(text(),'Sportswear')]")
	 WebElement sportswear;
	 
	 @FindBy(xpath="//span[contains(text(),'Maternity')]")
	 WebElement maternity;
	
	 
	 public void womenCheckBox()
	 {
		 
		 try
			{
			 womenCheckBox.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("womenCheckBox : Clicked", color.GREEN));
			 log.debug("womenCheckBox  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("womenCheckBox : Not Clicked", color.RED));
		    	 log.error("womenCheckBox Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
	 public void menCheckBox()
	 {
			
		 try
			{
			 menCheckBox.click();		
			 test.log(Status.PASS, MarkupHelper.createLabel("menCheckBox : Clicked", color.GREEN));
			 log.debug("womenCheckBox  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("menCheckBox : Not Clicked", color.RED));
		    	 log.error("menCheckBox Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
	 public void girlsCheckBox()
	 {
	
		 try
			{
			 girlsCheckBox.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("girlsCheckBox : Clicked", color.GREEN));
			 log.debug("girlsCheckBox  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("girlsCheckBox : Not Clicked", color.RED));
		    	 log.error("girlsCheckBox Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
	 
	 public void boys()
	 {
		 		
		 try
			{
			 boys.click();
			 test.log(Status.PASS, MarkupHelper.createLabel("boys : Clicked", color.GREEN));
			 log.debug("boys  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("boys : Not Clicked", color.RED));
		    	 log.error("boys Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
	 public void baby()
	 {
		 
		 try
			{
			 baby.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("baby : Clicked", color.GREEN));
			 log.debug("baby  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("baby : Not Clicked", color.RED));
		    	 log.error("baby Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
	 public void westernWear()
	 {
		 
		 try
			{
			 westernWear.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("westernWear : Clicked", color.GREEN));
			 log.debug("westernWear  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("westernWear : Not Clicked", color.RED));
		    	 log.error("westernWear Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
	 public void ethnicWear()
	 {
		 
		 try
			{
			 ethnicWear.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("ethnicWear : Clicked", color.GREEN));
			 log.debug("ethnicWear  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("ethnicWear : Not Clicked", color.RED));
		    	 log.error("ethnicWear Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
	 public void sportsWear()
	 {
		 
		 try
			{
			 sportswear.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("sportsWear : Clicked", color.GREEN));
			 log.debug("sportsWear  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("sportsWear : Not Clicked", color.RED));
		    	 log.error("sportsWear Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
	 public void maternity()
	 {
		 
		 try
			{
			 maternity.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("maternity : Clicked", color.GREEN));
			 log.debug("maternity  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("maternity : Not Clicked", color.RED));
		    	 log.error("maternity Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
	 }
	 
	 
	
	
