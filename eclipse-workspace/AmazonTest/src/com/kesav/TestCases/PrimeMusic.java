package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomePage;
import com.kesav.ObjectRepo.AmazonPrimeMusic;
import com.kesav.ObjectRepo.AmazonPrimeVideo;

public class PrimeMusic {
	WebDriver driver;

	@Test
	public void LaunchLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test(dependsOnMethods={"LaunchLogin"})
	public void PrimeMusic()
	{
		AmazonPrimeMusic amzPM = new AmazonPrimeMusic(driver);
		amzPM.HomeMenu().click();
		amzPM.PrimeMusic().click();
		amzPM.PrimeMusicSub().click();
		amzPM.MusicCdsVinyl().click();
		amzPM.HardRockMetal().click();
		amzPM.MinPrice().sendKeys("100");
		amzPM.MaxPrice().sendKeys("200");
		amzPM.Go().click();
		amzPM.Product().click();
		
	}
}
