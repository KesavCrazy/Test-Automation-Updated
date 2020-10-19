package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomeMenu;
import com.kesav.ObjectRepo.AmazonHomePage;

public class HomePageMenu {
	
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
		public void Menu() 
		{
			AmazonHomeMenu amzHP = new AmazonHomeMenu(driver);
			amzHP.AmazonMenu().click();
			amzHP.EchoAlexa().click();
			amzHP.EchoAlexaMainMenu().click();
		}
			@Test(dependsOnMethods= {"Menu"})
			public void EchoDot() 
			{
				AmazonHomeMenu amzHP = new AmazonHomeMenu(driver);
			amzHP.EchoAlexa().click();
			amzHP.EchoDot().click();
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"EchoDot"})
			public void AllNewAmzEcho() 
			{
				AmazonHomeMenu amzHP = new AmazonHomeMenu(driver);
			amzHP.AmazonMenu().click();
			amzHP.EchoAlexa().click();
			amzHP.AllNewAmzEcho().click();
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"EchoDot"})
			public void echoShow5() 
			{
				AmazonHomeMenu amzHP = new AmazonHomeMenu(driver);
			amzHP.AmazonMenu().click();
			amzHP.EchoAlexa().click();
			amzHP.echoShow5().click();
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"echoShow5"})
			public void MeetAlexa() 
			{
				AmazonHomeMenu amzHP = new AmazonHomeMenu(driver);
			amzHP.AmazonMenu().click();
			amzHP.EchoAlexa().click();
			amzHP.MeetAlexa().click();
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"MeetAlexa"})
			public void AlexaSmartHome() 
			{
				AmazonHomeMenu amzHP = new AmazonHomeMenu(driver);
			amzHP.AmazonMenu().click();
			amzHP.EchoAlexa().click();
			amzHP.AlexaSmartHome().click();
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"AlexaSmartHome"})		
			public void AlexaPrimeMusic() 
			{
				AmazonHomeMenu amzHP = new AmazonHomeMenu(driver);
			amzHP.AmazonMenu().click();
			amzHP.EchoAlexa().click();
			amzHP.AlexaPrimeMusic().click();
			driver.navigate().back();
			}

}
