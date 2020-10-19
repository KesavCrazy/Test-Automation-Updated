package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomePage;
import com.kesav.ObjectRepo.AmazonPrimeVideo;

public class PrimeVideo {
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
	public void PrimeVideo()
	{
		AmazonPrimeVideo amzPV = new AmazonPrimeVideo(driver);
		amzPV.JoinPrime().click();
	}
	@Test(dependsOnMethods={"PrimeVideo"})
	public void NewTab()
	{
		for	(String childTab : driver.getWindowHandles())
		{
				driver.switchTo().window(childTab);
			}
	}
	@Test(dependsOnMethods={"PrimeVideo"})
	public void PrimeVideoNewTab()
	{
		AmazonPrimeVideo amzPV = new AmazonPrimeVideo(driver);
		amzPV.LanguageIcon().click();
		amzPV.Englishlanguage().click();
		amzPV.Watch().click();
        Actions actions = new Actions(driver);
		
		AmazonHomePage amzHP = new AmazonHomePage(driver);
		actions.moveToElement(amzPV.SubTitles()).perform();	
		
		amzPV.SubTitles().click();
		amzPV.SubTitlesOn().click();
		amzPV.QualitySettings().click();
		amzPV.GoodQuality().click();
		amzPV.FullScreen().click();
		amzPV.Close().click();
	}
}
