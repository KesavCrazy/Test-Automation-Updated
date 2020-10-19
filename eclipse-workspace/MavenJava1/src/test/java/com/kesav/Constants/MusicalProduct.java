package com.kesav.Constants;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class MusicalProduct {

		WebDriver driver;
		ExtentTest test;
		ExtentColor color;
		public static Logger log = LogManager.getLogger(MusicalProduct.class.getName());
		
		 public MusicalProduct(WebDriver driver,ExtentTest test) {
			 
			 this.driver=driver;
			 this.test=test;
			 PageFactory.initElements(driver, this);
		 }
		 @FindBy(xpath="//span[contains(text(),'Alesis Nitro Mesh Kit | Eight Piece All-Mesh Elect')]")
		 WebElement meshKit;
		 
		 @FindBy(xpath=" //span[contains(text(),'PIONEER DJ DDJ-RR Portable 2-channel DJ controller')]")
		 WebElement ddjrr;

		 public void meshKit()
		 {
			 try
				
			 {
				    meshKit.click();	
				 	test.log(Status.PASS, MarkupHelper.createLabel("meshKit : Clicked", color.GREEN));
					log.error("meshKit Clicked");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("meshKit : Not Clicked", color.RED));
			    	log.error("meshKit Not Clicked");
			    	throw new NoSuchElementException(null);
			}
		 }
		 public void ddjrr()
		 {
			 try	
			 {
				    ddjrr.click();	
				 	test.log(Status.PASS, MarkupHelper.createLabel("ddjrr : Clicked", color.GREEN));
					log.error("ddjrr Clicked");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("ddjrr : Not Clicked", color.RED));
			    	log.error("ddjrr Not Clicked");
			    	throw new NoSuchElementException(null);
			}
		 }

}
