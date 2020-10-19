package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomePage;

public class HomePage {
	WebDriver driver;

	@Test
	public void LaunchHomePage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}
	
	@Test(dependsOnMethods={"LaunchHomePage"})
	public void SignInDropDown()
	{
		Actions actions = new Actions(driver);
		
		AmazonHomePage amzHP = new AmazonHomePage(driver);
		actions.moveToElement(amzHP.SignInDropDown()).perform();	
	}
	@Test(dependsOnMethods={"SignInDropDown"})
	public void LanguageDropDown()
	{
		Actions actions = new Actions(driver);
		
		AmazonHomePage amzHP = new AmazonHomePage(driver);
		actions.moveToElement(amzHP.LanguageDropDown()).perform();	
		amzHP.ChooseHindi().click();
		actions.moveToElement(amzHP.LanguageDropDown()).perform();	
		amzHP.ChooseEnglish().click();
	}
	
	
	}

