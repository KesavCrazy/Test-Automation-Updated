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

public class AppliancesProducts {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public AppliancesProducts(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//span[contains(text(),'Kent Bed and Upholstery Vacuum Cleaner')]")
	 WebElement kentBedVacuum;
	
	 @FindBy(xpath="//span[contains(text(),'KENT Personal Rice Cooker 0.9-litres 180-Watt (Bla')]")
	 WebElement kentRiceCooker;
	
	 @FindBy(xpath="//span[contains(text(),'Kent Instant Egg Boiler 360-Watt (Transparent and')]")
	 WebElement kentInstantEggBoiler;
	 
	 @FindBy(xpath="//span[contains(text(),'Kent 16030 850-Watt 2-Slice Pop-up Toaster (Red)')]")
	 WebElement kentToaster;
	
	 public void kentBedVacuum()
	 {
		 try
			
		 {
			 kentBedVacuum.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("kentBedVacuum : Clicked", color.GREEN));
				log.error("kentBedVacuum Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("kentBedVacuum : Not Clicked", color.RED));
		    	log.error("kentBedVacuum Not Clicked");
		    	throw new NoSuchElementException(null);
		}
	 }
	 public void kentRiceCooker()
	 {
		 try
			
		 {
			 kentRiceCooker.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("kentRiceCooker : Clicked", color.GREEN));
				log.error("kentRiceCooker Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("kentRiceCooker : Not Clicked", color.RED));
		    	log.error("kentRiceCooker Not Clicked");
		    	throw new NoSuchElementException(null);
		}
	 }
	 public void kentInstantEggBoiler()
	 {
		 try
			
		 {
			 kentInstantEggBoiler.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("kentInstantEggBoiler : Clicked", color.GREEN));
				log.error("kentRiceCooker Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("kentInstantEggBoiler : Not Clicked", color.RED));
		    	log.error("kentInstantEggBoiler Not Clicked");
		    	throw new NoSuchElementException(null);
		}
	 }
	 
}
