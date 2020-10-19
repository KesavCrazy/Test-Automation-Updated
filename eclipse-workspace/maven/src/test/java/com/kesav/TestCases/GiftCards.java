package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonGiftCards;

public class GiftCards {
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
	public void GiftCards()
	{
		AmazonGiftCards amzGC = new AmazonGiftCards(driver);
		amzGC.HomeMenu().click();
		amzGC.GiftCards().click();
		amzGC.PopularBrandGifts().click();
		amzGC.Valentineday().click();
		amzGC.FashionAccess().click();
		amzGC.LevisGiftCard().click();
	}
	@Test(dependsOnMethods={"GiftCards"})
	public void NewTab()
	{
		for	(String childTab : driver.getWindowHandles())
		{
				driver.switchTo().window(childTab);
			}
	}
	@Test(dependsOnMethods={"NewTab"})
	public void LevisCard()
	{
		AmazonGiftCards amzGC = new AmazonGiftCards(driver);
		Select oselect2 = new Select(amzGC.Quantity());
	       oselect2.selectByVisibleText("4");
	       amzGC.AddToCart().click();
	}
}
