package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonSignPage;

public class SigninPage {
	WebDriver driver;

	@Test
	public void LaunchLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		AmazonSignPage amzSP = new AmazonSignPage(driver);
		amzSP.TosignInPage().click();
	}
	@Test(dependsOnMethods={"LaunchLogin"})
	public void LoginPage()
	{
		AmazonSignPage amzSP = new AmazonSignPage(driver);
		amzSP.EmailId().sendKeys("xyz@gmail.com");
		amzSP.ToContinue().click();
		amzSP.Password().sendKeys("abdfhbsjhb");
		amzSP.Login().click();		
		driver.navigate().back();
		driver.navigate().back();
		
}
	@Test(dependsOnMethods={"LoginPage"})
	public void ConditionPage()
	{
		AmazonSignPage amzSP = new AmazonSignPage(driver);
		amzSP.ConditionPage().click();
		System.out.println(driver.getTitle());
		driver.navigate().back();
}
	@Test(dependsOnMethods={"ConditionPage"})
	public void NoticePage()
	{
		AmazonSignPage amzSP = new AmazonSignPage(driver);
		amzSP.NoticePage().click();
		System.out.println(driver.getTitle());
	}
	}
