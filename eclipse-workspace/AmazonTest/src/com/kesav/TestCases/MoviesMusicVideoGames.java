package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.*;

public class MoviesMusicVideoGames {
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
	public void AmazonMovieMusicVideoGames()
	{
		AmazonMovieMusicVideoGames amzMMVG = new AmazonMovieMusicVideoGames(driver);
		amzMMVG.HomeMenu().click();
		amzMMVG.MovieMusicVideoGames().click();
		amzMMVG.AllMovies().click();
		amzMMVG.hotelTransylvania2().click();
		Select oselect2 = new Select(amzMMVG.Quantity());
	       oselect2.selectByVisibleText("4");
	    amzMMVG.AddToCart().click();
	}
}
