package com.kesav.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.kesav.ObjectRepo.AmazonMobComputer;
import com.kesav.ObjectRepo.AmazonFullStoreDirect;
import com.kesav.ObjectRepo.AmazonHomeMenu;
import com.kesav.ObjectRepo.AmazonHomePage;

public class HomePageNoOFLinks {
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
	
//	@Test(dependsOnMethods={"LaunchHomePage"})
//	public void NoOfLinks()
//	{
//		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
//		int a = allLinks.size();
//		System.out.println(a);
//		for(WebElement i: allLinks) {
//		System.out.println(i.getText());
//		
//}
//	}
//		@Test(dependsOnMethods={"LaunchHomePage"})
//		public void NoOfLinksMenu()
//		{
//			driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/a")).click();
//			List<WebElement> allLinks = driver.findElements(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/li"));
//			int b = allLinks.size();                                ///html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[2]
//			System.out.println(b);									//either full xpath or xpath
//			for(WebElement j: allLinks) {	
//			System.out.println(j.getText());
//	}
//	@Test(dependsOnMethods={"LaunchHomePage"})
//	public void NoOfLinksMenu()
//	{
//		
//		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@class='nav-a  ']"));
//		int b = allLinks.size();
//		System.out.println(b);
//		for(WebElement j: allLinks) {	
//		System.out.println(j.getText());
//}
//			
//		}
	
//  @Test(dependsOnMethods={"LaunchHomePage"})
//      public void NoOfLinksMenu()
//{
//	driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[1]/a")).click();
//	AmazonHomeMenu amzHM = new AmazonHomeMenu(driver);
//	amzHM.EchoAlexa().click();
//	amzHM.EchoAlexaSub1().click();
//			
//	List<WebElement> allLinks = driver.findElements(By.xpath("/html/body/div[4]/div[2]/div[1]/div/div[1]/div/span"));
//	int b = allLinks.size();                                ///html/body/div[4]/div[2]/div[1]/div/div[1]/div/span[2]
//	System.out.println(b);									//either full xpath or xpath
//	for(WebElement j: allLinks) {	
//	System.out.println(j.getText());
//}
//}
	@Test(dependsOnMethods={"LaunchHomePage"})
	public void NoOfLinks()
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
}