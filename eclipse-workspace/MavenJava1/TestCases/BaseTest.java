package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	private static Logger log = LogManager.getLogger(BaseTest.class.getName());
	static WebDriver driver;

	@BeforeMethod
	 public void LaunchSite()
		{
				log.debug("Setting chrome driver property");
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
				driver =  new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				log.debug("Hitting Amazon Server");
				driver.get("https://www.amazon.in/");
				 driver.manage().window().maximize();
				 log.info("Window Maximized");
			}
	
	
	@AfterMethod
	 public void Close()
	 {
		 driver.close();
		 log.info("Window Closed");
	 }
}
