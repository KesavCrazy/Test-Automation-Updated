package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomeHomeKitchenPet;
import com.kesav.ObjectRepo.AmazonHomeMenu;
import com.kesav.ObjectRepo.AmazonHomePage;

public class HomePageHomeKitchenPet {
	
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
			AmazonHomeHomeKitchenPet amzHHKP = new AmazonHomeHomeKitchenPet(driver);
			amzHHKP.AmazonMenu().click();
			amzHHKP.HomekitchenPet().click();
			amzHHKP.MainMenu().click();
			amzHHKP.HomekitchenPet().click();
			amzHHKP.GardenOutdoor().click();
			amzHHKP.IndoorPlants().click();
			amzHHKP.CactiSucculent().click();
			amzHHKP.UgaooCheckBox().click();
			amzHHKP.MinPrice().sendKeys("100");
			amzHHKP.MaxPrice().sendKeys("500");
			amzHHKP.Submit().click();
			amzHHKP.CrassulaProduct().click();
			
			}
			

}
