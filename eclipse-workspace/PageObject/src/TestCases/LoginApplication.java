package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.kesav.ObjectRepository.RediffHomePage;
import com.kesav.ObjectRepository.RediffHomePagePF;
import com.kesav.ObjectRepository.RediffLoginPage;
import com.kesav.ObjectRepository.RediffLoginPagePageFactory;



public class LoginApplication {
	
	WebDriver driver;
	
	@Test
	public void Browser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		  driver =  new ChromeDriver();
		
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	@Test
	public void Login() {
//		String title =driver.getCurrentUrl();
//		System.out.println(title);
//		RediffLoginPage rd = new RediffLoginPage(driver);
//		rd.EmailId().sendKeys("Hello");
//		rd.Password().sendKeys("gdwqfgfhfgfhgf");
//		rd.Login().click();
//		rd.Home().click();
		RediffLoginPagePageFactory rdPF = new RediffLoginPagePageFactory(driver);
		rdPF.EmailId().sendKeys("Hello");
		rdPF.Password().sendKeys("gdwqfgfhfgfhgf");
		rdPF.Login().click();
		rdPF.Home().click();
		System.out.println("Test1" + ":" );
	}

	@Test(dependsOnMethods={"Login"})
	public void Home() {
		System.out.println("TEst2 :");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		RediffHomePagePF rdHome = new RediffHomePagePF(driver);
		rdHome.Search().sendKeys("electronics");
		rdHome.Submit().click();
	}

}
