package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonMobComputer;
import com.kesav.ObjectRepo.AmazonAudibleAudioBook;
import com.kesav.ObjectRepo.AmazonBeautyHealthGrocery;
import com.kesav.ObjectRepo.AmazonFullStoreDirect;
import com.kesav.ObjectRepo.AmazonHomePageBabyProducts;
import com.kesav.ObjectRepo.AmazonHomePagePantryIcon;
import com.kesav.ObjectRepo.AmazonHomePageTodaysDealIcon2;

public class BeautyHealthGrocery {
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
	public void BeautyHealthGrocery() throws InterruptedException 
	{
		AmazonBeautyHealthGrocery amzBHG =new AmazonBeautyHealthGrocery(driver); 
		amzBHG.HomeMenu().click();
		amzBHG.BeautyHealthGrocery().click();
		amzBHG.LuxuryBeauty().click();
		amzBHG.LuxurySkinCare().click();
		amzBHG.BodyWashLotions().click();
		amzBHG.AlmondShowerOil().click();
		String result = driver.getTitle();
		String expected = "L'Occitane Almond Shower Oil, 500ml: Amazon.in: Beauty";
		System.out.println(result);
//		System.out.println(result == expected);
//		if( result == expected)
//		{
//			System.out.println("TestCase Passed");
//		}
//		else
//		{
//			System.out.println("TestCase Failed");
//		}
		System.out.println(result.equals(expected));
		if( result.equals(expected))
			{
				System.out.println("TestCase Passed");
			}
			else
			{
				System.out.println("TestCase Failed");
			}
	}
}
