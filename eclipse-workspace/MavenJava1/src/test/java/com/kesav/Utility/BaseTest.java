package com.kesav.Utility;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class BaseTest {

	 public WebDriver driver;
	public ExtentReports report;
	public ExtentTest test;
    static Logger log = LogManager.getLogger(BaseTest.class.getName());
	ExtentColor color;
	
	
	
	@BeforeClass
	 public void LaunchSite()
		{
		Reporter.log("---------------"+super.getClass().getSimpleName()+"Test Started"+"-----------------",true);
				String strFile = "logs" + File.separator +super.getClass().getSimpleName();
				File logFile = new File(strFile);
				if (!logFile.exists()) {
					logFile.mkdir();
				}
	        	ThreadContext.put("ROUTINGKEY", strFile);
			log.info("-------------------"+super.getClass().getSimpleName()+"---------------------------------");
				
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
				report = ExtentFac.getInstance();
				test=report.createTest(super.getClass().getSimpleName());
				driver =  new ChromeDriver();
				log.debug(" Set property Successfully executed");
				 test.log(Status.INFO, MarkupHelper.createLabel("Set property Successfully executed", color.CYAN));
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
				 test.log(Status.INFO, MarkupHelper.createLabel("Hitting Amazon Site", color.CYAN));
				log.debug("Hitting Amazon Server");
				driver.get("https://www.amazon.in/");
				String var = driver.getCurrentUrl();
				String var1 = "https://www.amazon.in/";
				
				 log.debug("Amazon Server opened Successfully");
				
					if(var.equals(var1) == true)
					{
						test.log(Status.INFO, MarkupHelper.createLabel("Amazon Server opened Successfully", color.CYAN));
						
					}	
					else {
						test.fail(" Amazon Site Not Opened");
					}
				 driver.manage().window().maximize();
					}

@AfterMethod
public void tearDown(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		String temp = ScreenShot.getScreenShot(driver);
		test.info(result.getThrowable().getMessage(), MediaEntityBuilder.createScreenCaptureFromPath(temp).build());
	}
	report.flush();
	
}
	
	@AfterClass
	 public void Close()
	 {
		 
		 driver.quit();
		 
		 report.flush();
		 Reporter.log("---------------"+super.getClass().getSimpleName()+"Test Ended"+"-----------------",true);
	 }
	
	

}