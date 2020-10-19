package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
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

public class AmountRange {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(AmountRange.class.getName());
	
	 public AmountRange(WebDriver driver,ExtentTest test) {
		 
		 this.driver = driver;
		 this.test = test;
				 
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"p_36/1741388031\"]/span/a/span")
	 WebElement underHundred;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1741389031\"]/span/a/span")
	 WebElement hundredToTwoHundred;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1741390031\"]/span/a/span")
	 WebElement twoHundredToFiveHundred;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1741391031\"]/span/a/span")
	 WebElement fiveHundredToThousand;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1741392031\"]/span/a/span")
	 WebElement overThousand;
	 
	 @FindBy(xpath="//*[@id=\"p_36/1729357031\"]/span/a/span")
	 WebElement free;
	 
	 @FindBy(xpath="//*[@id=\"low-price\"]")
	 WebElement lowPrice;
	 
	 @FindBy(xpath="//*[@id=\"high-price\"]")
	 WebElement maxPrice;
	 
	 @FindBy(xpath="//input[@class='a-button-input']")
	 WebElement go1;	
	
	 @FindBy(xpath="//*[@id=\"a-autoid-9\"]/span/input")
	 WebElement go2;	

	 
	 public void UnderHundred()
	 {
		 underHundred.click();
	 }
	 public void HundredToTwoHundred()
	 {
		 hundredToTwoHundred.click();	 
	 }
	 public void TwoHundredToFiveHundred()
	 {
		 twoHundredToFiveHundred.click();
	 }
	 public void FiveHundredToThousand()
	 {
		 fiveHundredToThousand.click(); 
	 }
	 public void OverThousand()
	 {
		 overThousand.click(); 
	 }
	 public void Free()
	 {
		 free.click(); 
	 }
	 public void LowPrice1()
	 {
		 try
			{
			 lowPrice.sendKeys("100");
			 test.log(Status.PASS, MarkupHelper.createLabel("lowPrice : Clicked", color.GREEN));
			 log.debug("LowPrice1  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("lowPrice : Not Clicked", color.RED));
		    	log.error("LowPrice1 Not Clicked");
		    	 throw new NoSuchElementException(null);
		}
		 
		
	 }
	 public void MaxPrice1()
	 {
		 try
			{
			 maxPrice.sendKeys("7000");
			 test.log(Status.PASS, MarkupHelper.createLabel("maxPrice : Clicked", color.GREEN));
			 log.debug("MaxPrice1  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("maxPrice : Not Clicked", color.RED));
		    	log.debug("MaxPrice1  Clicked");
		    	 throw new NoSuchElementException(null);
		}
		
	 }
	 public void LowPrice2()
	 {
		 try
			{
			 lowPrice.sendKeys("40000");
			 test.log(Status.PASS, MarkupHelper.createLabel("lowPrice : Clicked", color.GREEN));
			 log.debug("LowPrice2  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("lowPrice : Not Clicked", color.RED));
		    	 log.error("LowPrice2 Not Clicked");
		    	 throw new NoSuchElementException(null);
		}
	
	 }
	 public void MaxPrice2()
	 {
		 try
			{
			 maxPrice.sendKeys("70000");
			 test.log(Status.PASS, MarkupHelper.createLabel("maxPrice : Clicked", color.GREEN));
			 log.debug("MaxPrice2  Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("maxPrice : Not Clicked", color.RED));
		    	 log.error("MaxPrice2 Not Clicked");
		    	 throw new NoSuchElementException(null);
		}
		 
	 }
	 public void Go()
	 {
		 try
			{
				if(go1!=null)
				{
					go1.click();
					 test.log(Status.PASS, MarkupHelper.createLabel("Go : Clicked", color.GREEN));
					 log.debug("Go  Clicked");
				}
			}
		    catch(NoSuchElementException e) {
			go2.click();
			 test.log(Status.PASS, MarkupHelper.createLabel("Go : Clicked", color.GREEN));
			 log.debug("Go  Clicked");
		}
	 }
	 }


