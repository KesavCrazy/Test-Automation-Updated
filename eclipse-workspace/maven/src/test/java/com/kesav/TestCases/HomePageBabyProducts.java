package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomePageBabyProducts;
import com.kesav.ObjectRepo.AmazonHomePagePantryIcon;
import com.kesav.ObjectRepo.AmazonHomePageTodaysDealIcon2;

public class HomePageBabyProducts {
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
	public void HomePageBabyProductsNext() throws InterruptedException 
	{
		AmazonHomePageBabyProducts amzHPBP = new AmazonHomePageBabyProducts(driver);
		amzHPBP.Menu().click();
		amzHPBP.ToysBabyProducts().click();
		amzHPBP.BabyProducts().click();
		amzHPBP.StarRatings().click();
		amzHPBP.MinPrice().sendKeys("100");
		amzHPBP.MaxPrice().sendKeys("5000");
		amzHPBP.Go().click();
	}
	@Test(dependsOnMethods= {"HomePageBabyProductsNext"})
	public void HomePageBabyProductsNext2() throws InterruptedException 
	{
		AmazonHomePageBabyProducts amzHPBP = new AmazonHomePageBabyProducts(driver);
		amzHPBP.Product().click();
		for	(String childTab : driver.getWindowHandles())
		{
			driver.switchTo().window(childTab);
		}
		System.out.println(driver.getCurrentUrl());
		amzHPBP.AddToCart().click();
	}
	@Test(dependsOnMethods= {"HomePageBabyProductsNext2"})
	public void Close() 
	{
		driver.quit();
	}
}
