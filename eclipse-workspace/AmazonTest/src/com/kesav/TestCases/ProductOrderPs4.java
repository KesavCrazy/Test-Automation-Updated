package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonProductOrder;
import com.kesav.ObjectRepo.AmazonSignPage;

public class ProductOrderPs4 {
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
	public void ProductPs4() throws InterruptedException
	{
		AmazonProductOrder amzPO = new AmazonProductOrder(driver);
		Select oselect = new Select(amzPO.AllIconDropDown());
	       oselect.selectByVisibleText("Video Games");
	       amzPO.SearchBox().sendKeys("ps4 console");
	       amzPO.Go().click();
	       amzPO.Product().click();
	       Thread.sleep(4000);
	    
	}
	@Test(dependsOnMethods={"ProductOrder"})
	public void ChildTab()
	{
	for	(String childTab : driver.getWindowHandles())
	{
		driver.switchTo().window(childTab);
	}
	System.out.println(driver.getCurrentUrl());
	}
	
	@Test(dependsOnMethods={"ProductOrder"})
	public void addToCart()
	{
		AmazonProductOrder amzPO = new AmazonProductOrder(driver);
		System.out.println("TEST2"+driver.getCurrentUrl());
	       amzPO.addToCart().click();
	       System.out.println(amzPO.addedToCartMsg().getText());
	}
	}

