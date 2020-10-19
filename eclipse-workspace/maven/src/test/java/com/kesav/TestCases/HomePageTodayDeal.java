package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import com.kesav.ObjectRepo.AmazonHomePageTodaysDealIcon2;

public class HomePageTodayDeal {
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
	public void HomePageComputerNext() 
	{
		AmazonHomePageTodaysDealIcon2 amzHPTD = new AmazonHomePageTodaysDealIcon2(driver);
		amzHPTD.TodaysDealIcon2().click();
		amzHPTD.ClothingBoysCheckBox().click();
		amzHPTD.PriceCheckBox().click();
		amzHPTD.Product().click();
	}
	@Test(dependsOnMethods= {"HomePageComputerNext"})
	public void Close() 
	{
		driver.close();
	}
}
