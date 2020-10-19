package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.*;
import com.kesav.ObjectRepo.AmazonFullStoreDirect;
import com.kesav.ObjectRepo.AmazonHomePageBabyProducts;
import com.kesav.ObjectRepo.AmazonHomePagePantryIcon;
import com.kesav.ObjectRepo.AmazonHomePageTodaysDealIcon2;

public class Covid {
	WebDriver driver;

	@Test
	public void LaunchHomePage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		 driver.manage().window().maximize();
	}
	@Test(dependsOnMethods= {"LaunchHomePage"})
	public void AmazonCovid() throws InterruptedException 
	{
		AmazonCovid amzCovid =new AmazonCovid(driver); 
		amzCovid.Covid().click();
		amzCovid.WhereMyOrder().click();
		driver.navigate().back();
		amzCovid.AmazonPrime().click();
		driver.navigate().back();
		amzCovid.SpecialDeliveryOption().click();
		driver.navigate().back();
		amzCovid.ShippingSpeed().click();
		driver.navigate().back();
		amzCovid.OrderingRestrictions().click();
		driver.navigate().back();
		amzCovid.PickUpStore().click();
		driver.navigate().back();
		amzCovid.AmazonPackaging().click();
		driver.navigate().back();
		amzCovid.ReportEmergency().click();
		driver.navigate().back();
		amzCovid.FreeShipping().click();
		driver.navigate().back();
	}
	
	@Test(dependsOnMethods= {"AmazonCovid"})
	public void Close() 
	{
		driver.close();
	}
}
