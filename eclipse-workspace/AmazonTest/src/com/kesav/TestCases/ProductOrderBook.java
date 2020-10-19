package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonProductBook;
import com.kesav.ObjectRepo.AmazonProductOrder;
import com.kesav.ObjectRepo.AmazonSignPage;

public class ProductOrderBook {
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
	public void ProductBook() throws InterruptedException
	{
		AmazonProductOrder amzPO = new AmazonProductOrder(driver);
		Select oselect = new Select(amzPO.AllIconDropDown());
	       oselect.selectByVisibleText("Books");
	       amzPO.SearchBox().sendKeys("nicholas sparks novels");
	       amzPO.Go().click();
	       AmazonProductBook amzPB = new AmazonProductBook(driver);
	       amzPB.ProductBook().click();
	       Thread.sleep(4000);

	}
	@Test(dependsOnMethods={"ProductBook"})
	public void ChildTab()
	{
	for	(String childTab : driver.getWindowHandles())
	{
		driver.switchTo().window(childTab);
	}
	System.out.println(driver.getCurrentUrl());
	}
	
	@Test(dependsOnMethods={"ProductBook"})
	public void addToCart()
	{
		  AmazonProductBook amzPB = new AmazonProductBook(driver);
		System.out.println("TEST2"+driver.getCurrentUrl());
	       amzPB.AddToCart().click();
	      
	}
	}

