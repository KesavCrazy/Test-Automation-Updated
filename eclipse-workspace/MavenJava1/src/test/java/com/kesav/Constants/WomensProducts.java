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

public class WomensProducts {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(WomensProducts.class.getName());
	
	 public WomensProducts(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//body[@class='a-aui_157141-c a-aui_72554-c a-aui_dropdown_187959-c a-aui_pci_risk_banner_210084-c a-aui_perf_130093-c a-aui_tnr_v2_180836-c a-aui_ux_145937-c a-meter-animate']")
	 WebElement womensTops;

	 @FindBy(xpath="//span[contains(text(),\"Women's Satin Lehenga Choli (FF-5075, Pink, Free S\")]")
	 WebElement womensSaree;
	
	 
	 public void womensTops()
	 {
		 try
			
		 {
			 womensTops.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("womensTops : Clicked", color.GREEN));
				log.error("womensTops Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("womensTops : Not Clicked", color.RED));
		    	log.error("womensTops Not Clicked");
		    	throw new NoSuchElementException(null);
		}
	 }
	 public void womensSaree()
	 {
		 try
			
		 {
			 womensSaree.click();	
			 	test.log(Status.PASS, MarkupHelper.createLabel("womensSaree : Clicked", color.GREEN));
				log.error("womensSaree Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("womensSaree : Not Clicked", color.RED));
		    	log.error("womensSaree Not Clicked");
		    	throw new NoSuchElementException(null);
		} 
	 }
}

