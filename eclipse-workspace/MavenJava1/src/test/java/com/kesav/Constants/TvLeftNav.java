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

public class TvLeftNav {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public TvLeftNav(WebDriver driver,	ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//*[@id=\"leftNav_760765\"]/div[2]/button")
	 WebElement showFeaturedBrands;
	
	 @FindBy(xpath="//*[@id=\"leftNav_3757\"]/div[2]/div/ul/li[1]")
	 WebElement oneplus;
	 
	 @FindBy(xpath="//*[@id=\"leftNav_3757\"]/div[2]/div/ul/li[2]")
	 WebElement vu;
	 
	 @FindBy(xpath="//*[@id=\"leftNav_3757\"]/div[2]/div/ul/li[3]")
	 WebElement mi;
	
	 @FindBy(xpath="//*[@id=\"leftNav_3757\"]/div[2]/div/ul/li[4]")
	 WebElement lg;
	
	 @FindBy(xpath="//*[@id=\"leftNav_3757\"]/div[2]/div/ul/li[5]")
	 WebElement samsung;
	
	 @FindBy(xpath="//*[@id=\"leftNav_3757\"]/div[2]/div/ul/li[10]")
	 WebElement sony;
	
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[1]")
	 WebElement androidBased;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[2]")
	 WebElement customOS;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[3]")
	 WebElement homeOS;

	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[4]/div/li[2]")
	 WebElement fourSixFeet;
	
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[4]/div/li[3]")
	 WebElement sixEightFeet;
	
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[4]/div/li[4]")
	 WebElement eightTenFeet;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[1]")
	 WebElement led;

	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[2]")
	 WebElement qled;

	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[6]/div/li[3]")
	 WebElement oled;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[7]/div/li[1]")
	 WebElement ultraHD;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[7]/div/li[2]")
	 WebElement fullHD;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[7]/div/li[3]")
	 WebElement hdReady;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[9]/div/li[4]")
	 WebElement fortyToFortyseven;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[9]/div/li[5]")
	 WebElement fortyEightToFiftyFour;
	
	 @FindBy(xpath="//*[@id=\"p_n_size_browse-bin/11962151031\"]")
	 WebElement fiftyFiveAbove;
	
	 
	 public void oneplus()
	 {
		 oneplus.click();		 
	 }
	 public void vu()
	 {
		 vu.click();		 
	 }
	 public void mi()
	 {
		 mi.click();		 
	 }
	 
	 public void lg()
	 {
		 lg.click();		 
	 }
	 public void samsung()
	 {
		 samsung.click();		 
	 }
	 public void sony()
	 {
		 sony.click();		 
	 }
		 
	 public void androidBased()
	 {
		 try
			{
			 androidBased.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("androidBased : Clicked", color.GREEN));
	    	 log.debug("androidBased  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("androidBased : Clicked", color.RED));
		    	 log.error("androidBased Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	 
		 
	 }
	 public void customOS()
	 {
		 customOS.click();		 
	 }
	 public void homeOS()
	 {
		 homeOS.click();		 
	 }
	 public void fourSixFeet()
	 {
		 fourSixFeet.click();		 
	 }
	 public void sixEightFeet()
	 {
		 sixEightFeet.click();		 
	 }
	 public void eightTenFeet()
	 {
		 eightTenFeet.click();		 
	 }
	 public void led()
	 {
		 led.click();		 
	 }
	 public void qled()
	 {
		 qled.click();		 
	 }
	 public void oled()
	 {
		 oled.click();		 
	 }
	 public void ultraHD()
	 {
		 ultraHD.click();		 
	 }
	 public void fullHD()
	 {
		 fullHD.click();		 
	 }
	 public void hdReady()
	 {
		 hdReady.click();		 
	 }
	 public void fortyToFortyseven()
	 {
		 fortyToFortyseven.click();		 
	 }
	 public void fortyEightToFiftyFour()
	 {
		 fortyEightToFiftyFour.click();		 
	 }
	 public void fiftyFiveAbove()
	 {
		
		 try
			{
			 fiftyFiveAbove.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("fiftyFiveAbove : Clicked", color.GREEN));
			 log.debug("fiftyFiveAbove  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("fiftyFiveAbove : Not Clicked", color.RED));
		    	 log.error("fiftyFiveAbove Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		    }
		    	 }
		}	 		 
	 
	
	
