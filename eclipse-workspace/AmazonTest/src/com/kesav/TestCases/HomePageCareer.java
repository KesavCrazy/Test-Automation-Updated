package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomeCareer;
import com.kesav.ObjectRepo.AmazonHomeHomeKitchenPet;
import com.kesav.ObjectRepo.AmazonHomeMenu;
import com.kesav.ObjectRepo.AmazonHomePage;

public class HomePageCareer {
	
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
		public void Menu() throws InterruptedException 
		{
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			AmazonHomeCareer amzHC = new AmazonHomeCareer(driver);
			amzHC.Career().click();
			amzHC.Search().click();
			amzHC.FullTime().click();
//			amzHC.JobCategory().click();
			amzHC.Bengaluru().click();
			amzHC.Chennai().click();
//			amzHC.FinanceGlobalBusiness().click();
			}
			

}
