package com.kesav.TestCases;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonMobComputer;
import com.google.common.io.Files;
import com.kesav.ObjectRepo.AmazonFullStoreDirect;
import com.kesav.ObjectRepo.AmazonHomePageBabyProducts;
import com.kesav.ObjectRepo.AmazonHomePagePantryIcon;
import com.kesav.ObjectRepo.AmazonHomePageTodaysDealIcon2;

public class MobileComputer {
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
	public void AmazonFullStoreDir() throws InterruptedException 
	{
		AmazonMobComputer amzFSD =new AmazonMobComputer(driver); 
		amzFSD.HomeMenu().click();
		amzFSD.MobileComputer().click();
		amzFSD.AllMobilePhones().click();
		amzFSD.SmartMobBasic().click();
		amzFSD.Nokia().click();
		amzFSD.minPrice().sendKeys("13000");
		amzFSD.MaxPrice().sendKeys("20000");
		amzFSD.Go().click();
	
	}
	
	@Test(dependsOnMethods= {"AmazonFullStoreDir"})
	public void ScreenShot() throws IOException 
	{
		 TakesScreenshot screenShot = (TakesScreenshot)driver;
		  File tempScreenshot = screenShot.getScreenshotAs(OutputType.FILE);
		  String destFileFolder = "C:\\Users\\Admin\\Desktop\\ScreenShot";
		  String destFileName = DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now()).replaceAll(":", "_");
		  String destFileExten = ".png";
		  
		  File dest =new File (destFileFolder + "\\" + destFileName + destFileExten);
		  Files.copy(tempScreenshot, dest);
	}
}
