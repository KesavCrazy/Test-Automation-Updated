package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomeMenu;
import com.kesav.ObjectRepo.AmazonHomePageComputerIcon;

public class HomePageComputer {
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
		AmazonHomePageComputerIcon amzHPCI =new AmazonHomePageComputerIcon(driver);
		amzHPCI.ComputerIcon().click();
		amzHPCI.EligibleForPayOnDelivery().click();
		amzHPCI.StarRatings().click();	
		amzHPCI.MinAmount().sendKeys("10000");
		amzHPCI.Maxmount().sendKeys("20000");
		amzHPCI.Go().click();
		amzHPCI.SamsungCheckBox().click();
		
	}
	@Test(dependsOnMethods= {"HomePageComputerNext"})
	public void Close() 
	{
		driver.close();
	}
}
