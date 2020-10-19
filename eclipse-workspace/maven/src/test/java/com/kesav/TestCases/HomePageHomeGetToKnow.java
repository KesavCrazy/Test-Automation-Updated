package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonHomeGetToKnow;
import com.kesav.ObjectRepo.AmazonHomeHomeKitchenPet;
import com.kesav.ObjectRepo.AmazonHomeMenu;
import com.kesav.ObjectRepo.AmazonHomePage;

public class HomePageHomeGetToKnow {
	
		WebDriver driver;

		@Test
		public void LaunchHomePage()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
			driver =  new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");
			 driver.manage().window().maximize();
		}
		@Test(dependsOnMethods= {"LaunchHomePage"})
		public void AboutUs() throws InterruptedException 
		{
			AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			
			amzHGTK.AboutUs().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		}
		@Test(dependsOnMethods= {"AboutUs"})
		public void Career() throws InterruptedException 
		{
			AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.Career().click();	
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		}
		@Test(dependsOnMethods= {"Career"})
		public void PressRelease() throws InterruptedException 
		{
			AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.PressRelease().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
		}
			@Test(dependsOnMethods= {"PressRelease"})
			public void AmazonCares() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.AmazonCares().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"AmazonCares"})
			public void GiftASmile() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.GiftASmile().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"GiftASmile"})
			public void Twitter() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.Twitter().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"Twitter"})
			public void Facebook() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.Facebook().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"Facebook"})
			public void Instagram() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.Instagram().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"Instagram"})
			public void SellOnAmzon() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.SellOnAmzon().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"SellOnAmzon"})
			public void SellunderAmazon() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.SellunderAmazon().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"SellunderAmazon"})
			public void BecomeAnAffi() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.BecomeAnAffi().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"BecomeAnAffi"})
			public void FulfilmentByAmazon() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.FulfilmentByAmazon().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"FulfilmentByAmazon"})
			public void AdvertiseYourPrduct() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.AdvertiseYourPrduct().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"AdvertiseYourPrduct"})
			public void AmzPayOn() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.AmzPayOn().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"AmzPayOn"})
			public void covidAmzon() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.covidAmzon().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"covidAmzon"})
			public void yourAcc() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.yourAcc().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"yourAcc"})
			public void returnsCentre() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.returnsCentre().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"returnsCentre"})
			public void purchaseProtection() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.purchaseProtection().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"purchaseProtection"})
			public void amzAppDownload() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.amzAppDownload().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"amzAppDownload"})
			public void amzAssDownload() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.amzAssDownload().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			@Test(dependsOnMethods= {"amzAssDownload"})
			public void Help() throws InterruptedException 
			{
				AmazonHomeGetToKnow amzHGTK = new AmazonHomeGetToKnow(driver);
			amzHGTK.Help().click();
			System.out.println(driver.getCurrentUrl());
			driver.navigate().back();
			}
			

}
