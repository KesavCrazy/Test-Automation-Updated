package com.kesav.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.*;

public class CreateAccountPageDataProviderExcel {
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

	@Test(dependsOnMethods={"LaunchCreateAccountPage"},dataProvider="getData",dataProviderClass=AmazonCreateAccountDataProviderPageExcel.class)
	public void Credentials(String name,String num,String email,String pass)
	{
		AmazonCreateAccountDataProviderPageExcel amzCAPE = new AmazonCreateAccountDataProviderPageExcel(driver);
		
		amzCAPE.CreateAccountPageCustomerName().sendKeys(name);
	
    	amzCAPE.CreateAccountPageMobNumber().sendKeys(num);

		amzCAPE.CreateAccountPageEmail().sendKeys(email);
		
		amzCAPE.CreateAccountPagePassword().sendKeys(pass);
		
	}
}
