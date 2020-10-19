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

public class LivingRooomFurn {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public LivingRooomFurn(WebDriver driver,	ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//div[@class='left_nav browseBox']//ul[2]//li[1]")
	 WebElement sofasAndCouches;
	
	 @FindBy(xpath="//div[@class='left_nav browseBox']//a[contains(text(),'Recliners')]")
	 WebElement recliners;
	 
	 @FindBy(xpath="//body[@class='a-aui_157141-c a-aui_72554-c a-aui_dropdown_187959-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate']/div[@id='a-page']/div[@class='a-fixed-left-flipped-grid s-padding-left-small s-padding-right-small s-span-page a-spacing-top-small']/div[@class='a-fixed-left-grid-inner']/div[@class='a-fixed-left-grid-col a-col-left']/div[@class='a-section s-padding-right-mini s-border-right']/div[@class='a-section a-spacing-none']/div[@id='leftNav']/ul[6]/div[1]/li[2]/span[1]/span[1]")
	 WebElement leather;
	 
	 @FindBy(xpath="//span[contains(text(),'Furny Rocco 2 Seater Leatherette Sofa (Cream)')]")
	 WebElement creamSofas;

	
	 
	 public void sofasAndCouches()
	 {
		 		
		 try
			{
			 sofasAndCouches.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("sofasAndCouches : Clicked", color.GREEN));
	    	 log.debug("sofasAndCouches  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("sofasAndCouches : Not Clicked", color.RED));
		    	 log.error("sofasAndCouches Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
	 public void recliners()
	 {
		
		 try
			{
			 recliners.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("recliners : Clicked", color.GREEN));
	    	 log.debug("recliners  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("recliners : Clicked", color.RED));
		    	 log.error("recliners Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
	 public void leather()
	 {
			
		 try
			{
			 leather.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("leather : Clicked", color.GREEN));
	    	 log.debug("leather  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("leather : Clicked", color.RED));
		    	 log.error("leather Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
	 
	 public void creamSofas()
	 {
		
		 try
			{
			 creamSofas.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("creamSofas : Clicked", color.GREEN));
	    	 log.debug("creamSofas  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("creamSofas : Clicked", color.RED));
		    	 log.error("creamSofas Not Clicked");
		    	 throw new NoSuchElementException(null);
		}	
	 }
		}	 		 
	 
	
	
