package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonMobComputer;
import com.kesav.ObjectRepo.AmazonFullStoreDirect;
import com.kesav.ObjectRepo.AmazonHomePageBabyProducts;
import com.kesav.ObjectRepo.AmazonHomePagePantryIcon;
import com.kesav.ObjectRepo.AmazonHomePageTodaysDealIcon2;

public class FullStore {
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
	public void AmazonFullStoreDir() throws InterruptedException 
	{
		AmazonFullStoreDirect amzFSD =new AmazonFullStoreDirect(driver); 
		amzFSD.HomeMenu().click();
		amzFSD.FullStoreDir().click();
		amzFSD.Cricket().click();
		amzFSD.Cosco().click();
		amzFSD.minPrice().sendKeys("100");
		amzFSD.MaxPrice().sendKeys("1000");
		amzFSD.Go().click();
		amzFSD.AddToCart().click();
	}
	
	@Test(dependsOnMethods= {"AmazonFullStoreDir"})
	public void Close() 
	{
		driver.close();
	}
}
