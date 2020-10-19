package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomeMenu;
import com.kesav.ObjectRepo.AmazonHomePageComputerIcon;
import com.kesav.ObjectRepo.AmazonHomePageSelectYourAddress;
import com.kesav.ObjectRepo.AmazonHomePageShoppingMadeEasy;

public class HomePageSelectAddress {
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
	public void ShoppingDay() 
	{
		AmazonHomePageSelectYourAddress  amzHPSYA = new AmazonHomePageSelectYourAddress(driver);
		amzHPSYA.SelectYourAddress().click();
		amzHPSYA.Pincode().sendKeys("abc@gmail.com");
		amzHPSYA.Apply().click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	@Test(dependsOnMethods= {"ShoppingDay"})
	public void Close() 
	{
		driver.close();
	}
}
