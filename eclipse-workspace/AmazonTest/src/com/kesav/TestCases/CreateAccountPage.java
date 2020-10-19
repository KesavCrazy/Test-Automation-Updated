package com.kesav.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonCreateAccountPage;
import com.kesav.ObjectRepo.AmazonSignPage;

public class CreateAccountPage {
	WebDriver driver;
	@Test
	public void LaunchCreateAccountPage()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	    driver =  new ChromeDriver();
		driver.get("https://www.amazon.in/");
		AmazonSignPage amzSP = new AmazonSignPage(driver);
		amzSP.TosignInPage().click();
		AmazonCreateAccountPage amzCP= new AmazonCreateAccountPage(driver);
		amzCP.ToCreateAccountPage().click();
	}
	@Test(dependsOnMethods={"LaunchCreateAccountPage"})
	public void CreateAccount()
	{
		AmazonCreateAccountPage amzCP= new AmazonCreateAccountPage(driver);
		amzCP.CreateAccountPageCustomerName().sendKeys("acbd");
		amzCP.CreateAccountPageMobDropDown().click();
		driver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[91]/a")).click();
		amzCP.CreateAccountPageMobNumber().sendKeys("7763278648");
		amzCP.CreateAccountPageEmail().sendKeys("abcd@gamail.com");
		amzCP.CreateAccountPagePassword().sendKeys("basjssd65672");
		amzCP.CreateAccountPagecontinue().click();
		
	}
}
