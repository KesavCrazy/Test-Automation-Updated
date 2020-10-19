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
	public void NewTab() throws InterruptedException
	{
		for	(String childTab : driver.getWindowHandles())
		{
				driver.switchTo().window(childTab);
			}
		Thread.sleep(3000);
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
		actions.moveToElement(amzPV.QualitySettings()).perform();
		amzPV.QualitySettings().click();
		amzPV.GoodQuality().click();
		actions.moveToElement(amzPV.FullScreen()).perform();
		amzPV.FullScreen().click();
		actions.moveToElement(amzPV.Close()).perform();
		amzPV.Close().click();
	}
}