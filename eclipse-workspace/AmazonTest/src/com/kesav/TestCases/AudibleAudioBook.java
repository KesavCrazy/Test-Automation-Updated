package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonMobComputer;
import com.kesav.ObjectRepo.AmazonAudibleAudioBook;
import com.kesav.ObjectRepo.AmazonFullStoreDirect;
import com.kesav.ObjectRepo.AmazonHomePageBabyProducts;
import com.kesav.ObjectRepo.AmazonHomePagePantryIcon;
import com.kesav.ObjectRepo.AmazonHomePageTodaysDealIcon2;

public class AudibleAudioBook {
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
	public void AudibleAudioBook() throws InterruptedException 
	{
		AmazonAudibleAudioBook amzAAB =new AmazonAudibleAudioBook(driver); 
		amzAAB.HomeMenu().click();
		amzAAB.adibleAudioBook().click();
		amzAAB.bestSeller().click();
		amzAAB.product().click();
		String title = driver.getTitle();
		//System.out.println(text);
		if(title.contains("Rich Dad Poor Dad: What the Rich Teach Their Kids About - That the Poor and Middle Class Do Not! (Audio Download): Amazon.in: Robert T. Kiyosaki, Tim Wheeler, Rich Dad on Brilliance Audio"))
		{
			System.out.println("TestCase Passed");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
		if(title.contains("Rich Dad Poor Dad: What the Rich Teach Their Kids About Money - That the Poor and Middle Class Do Not! (Audio Download): Amazon.in: Robert T. Kiyosaki, Tim Wheeler, Rich Dad on Brilliance Audio"))
		{
			System.out.println("TestCase Passed");
		}
		else
		{
			System.out.println("TestCase Failed");
		}
		
	}
}
