package com.kesav.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonCreateAccountPage;
import com.kesav.ObjectRepo.*;
import com.kesav.ObjectRepo.AmazonSignPage;

public class CreateAccountPageExcel {
	 public WebDriver driver;
	 public String credentialInfo;
	 public String credInfo[];
	@Test
	public void LaunchCreateAccountPage() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	    driver =  new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		AmazonSignPage amzSP = new AmazonSignPage(driver);
		amzSP.TosignInPage().click();
		AmazonCreateAccountPage amzCP= new AmazonCreateAccountPage(driver);
		amzCP.ToCreateAccountPage().click();
		Thread.sleep(4);
	}
	
	@Test(dependsOnMethods={"LaunchCreateAccountPage"})
	public void Credentials() throws IOException 
	{
		AmazonCreateAccountPageExcel amzCAPE = new AmazonCreateAccountPageExcel(driver);
		credentialInfo = AmazonCreateAccountPageExcel.Credentials().get("1");
		 credInfo = credentialInfo.split(",");
		amzCAPE.CreateAccountPageCustomerName().sendKeys(credInfo);
		
		credentialInfo = AmazonCreateAccountPageExcel.Credentials().get("2");
		 credInfo = credentialInfo.split(",");
    	amzCAPE.CreateAccountPageMobNumber().sendKeys(credInfo);
    	credentialInfo = AmazonCreateAccountPageExcel.Credentials().get("3");
		 credInfo = credentialInfo.split(",");
		amzCAPE.CreateAccountPageEmail().sendKeys(credInfo);
		credentialInfo = AmazonCreateAccountPageExcel.Credentials().get("4");
		 credInfo = credentialInfo.split(",");
		amzCAPE.CreateAccountPagePassword().sendKeys(credInfo);
		
	}
}
