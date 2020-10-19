package com.kesav.Utility;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Extras {
	 WebDriver driver;
	 ExtentTest test;
	 ExtentColor color;
	 
	 public Extras(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	 public void ComeBack() {
		 driver.navigate().back();
	 }
	 public void Delay() throws InterruptedException {
		 Thread.sleep(3000);
	 }
	 
	 public void ChildTab() {
		 try
			{
			 for(String childTab : driver.getWindowHandles())
				{
					driver.switchTo().window(childTab);
				}
			 test.log(Status.INFO, MarkupHelper.createLabel("Switching : Tab ", color.CYAN));
			
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("Switching : Error", color.RED));
		 
		    	 throw new NoSuchElementException(null);
		}
		 
	
	 }
}
