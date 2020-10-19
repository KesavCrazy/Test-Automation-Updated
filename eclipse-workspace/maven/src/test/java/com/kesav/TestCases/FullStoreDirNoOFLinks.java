package com.kesav.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonMobComputer;
import com.kesav.ObjectRepo.AmazonFullStoreDirect;
import com.kesav.ObjectRepo.AmazonHomeMenu;
import com.kesav.ObjectRepo.AmazonHomePage;

public class FullStoreDirNoOFLinks {
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

	@Test(dependsOnMethods={"LaunchHomePage"})
	public void EchoAlexaNoOfLinks()
	{
		AmazonFullStoreDirect amzFSD =new AmazonFullStoreDirect(driver);
		amzFSD.HomeMenu().click();
		amzFSD.FullStoreDir().click();
		List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"shopAllLinks\"]/tbody/tr/td[1]/div[1]/ul/li"));
		int b = allLinks.size();                              
		System.out.println(b);									
		for(WebElement j: allLinks) {	
		System.out.println(j.getText());
	}
}
	@Test(dependsOnMethods={"EchoAlexaNoOfLinks"})
	public void TvAppElecNoOfLinks()
	{
		AmazonFullStoreDirect amzFSD =new AmazonFullStoreDirect(driver);
		amzFSD.HomeMenu().click();
		amzFSD.FullStoreDir().click();
		List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"shopAllLinks\"]/tbody/tr/td[2]/div[1]/ul/li"));
		int b = allLinks.size();                              
		System.out.println(b);									
		for(WebElement j: allLinks) {	
		System.out.println(j.getText());
	}
	}
	@Test(dependsOnMethods={"TvAppElecNoOfLinks"})
	public void SportFitness()
	{
		AmazonFullStoreDirect amzFSD =new AmazonFullStoreDirect(driver);
		amzFSD.HomeMenu().click();
		amzFSD.FullStoreDir().click();
		List<WebElement> allLinks = driver.findElements(By.xpath("	//*[@id=\"shopAllLinks\"]/tbody/tr/td[3]/div[3]/ul/li"));
		int b = allLinks.size();                              
		System.out.println(b);									
		for(WebElement j: allLinks) {	
		System.out.println(j.getText());
	}
	}
	@Test(dependsOnMethods={"SportFitness"})
	public void KindleEBook()
	{
		AmazonFullStoreDirect amzFSD =new AmazonFullStoreDirect(driver);
		amzFSD.HomeMenu().click();
		amzFSD.FullStoreDir().click();
		List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"shopAllLinks\"]/tbody/tr/td[1]/div[3]/ul/li"));
		int b = allLinks.size();                              
		System.out.println(b);									
		for(WebElement j: allLinks) {	
		System.out.println(j.getText());
	}
	}
}