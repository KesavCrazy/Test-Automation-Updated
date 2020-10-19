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

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.kesav.Utility.BaseTest;

public class MobileBrandsCheckBox {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(MobileBrandsCheckBox.class.getName());
	
	
	 public MobileBrandsCheckBox(WebDriver driver, ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//span[@class='a-size-base a-color-base'][contains(text(),'Samsung')]")
	 WebElement samsung; 
	 
	 @FindBy(xpath="//*[@id=\"p_89/OnePlus\"]/span/a/span")
	 WebElement onePlus;
	 
	 @FindBy(xpath="//*[@id=\"p_89/Boat\"]/span/a/span")
	 WebElement boat;
	 
	 @FindBy(xpath="//*[@id=\"p_89/Redmi\"]/span/a/span")
	 WebElement redmi;
	 
	 @FindBy(xpath="//*[@id=\"p_89/realme\"]/span/a/span")
	 WebElement realMe;
	 
	 @FindBy(xpath="//*[@id=\"p_89/Oppo\"]/span/a/span")
	 WebElement oppo;
	 
	 @FindBy(xpath="//*[@id=\"p_89/Mi\"]/span/a/span")
	 WebElement mi;
	 
	 public void Samsung()
	 {
		 try
			
		 {
			 samsung.click();
			 	test.log(Status.PASS, MarkupHelper.createLabel("samsung : Clicked", color.GREEN));
				log.error("samsung Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("samsung : Not Clicked", color.RED));
		    	log.error("samsung Not Clicked");
		    	throw new NoSuchElementException(null);
		}
		 
	 }
	 public void OnePlus()
	 {
		 onePlus.click();	 
	 }
	 public void Boat()
	 {
		 boat.click();
	 }
	 public void Redmi()
	 {
		 redmi.click(); 
	 }
	 public void RealMe()
	 {
		 realMe.click(); 
	 }
	 public void Oppo()
	 {
		 oppo.click();
	 }
	 public void MI()
	 {
		 mi.click();
	 }
	 
}
