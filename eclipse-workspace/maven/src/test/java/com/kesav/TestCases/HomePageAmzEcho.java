package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomePageAmzEcho;
import com.kesav.ObjectRepo.AmazonHomePagePantryIcon;
import com.kesav.ObjectRepo.AmazonHomePageTodaysDealIcon2;

public class HomePageAmzEcho {
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
	public void HomePagePantryNext() throws InterruptedException 
	{
		AmazonHomePageAmzEcho amzHPP = new AmazonHomePageAmzEcho(driver);
		amzHPP.Echo().click();
		amzHPP.FireTVDropDown().click();
		amzHPP.FireTV4K().click();
		amzHPP.AddToCart().click();
	}
	@Test(dependsOnMethods= {"HomePagePantryNext"})
	public void Close() 
	{
		driver.close();
	}
}
