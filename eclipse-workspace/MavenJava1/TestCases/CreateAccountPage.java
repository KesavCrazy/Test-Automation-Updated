package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kesav.Constants.AccountPage;
import com.kesav.Constants.AmountRange;
import com.kesav.Constants.FivefeetApartBooks;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeMenuMainMenu;
import com.kesav.Constants.HomeSearch;
import com.kesav.Constants.HomeSearchDropdownBox;
import com.kesav.Constants.MenuEchoAlexaComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;

public class CreateAccountPage extends BaseTest{
	
	@Test
	public void CreateAccPage() throws InterruptedException {
	
		new AccountPage(driver).tosignInPage();
		new AccountPage(driver).ToCreateAccountPage();
		new AccountPage(driver).CreateAccountPageCustomerName();
		new AccountPage(driver).CreateAccountPageMobDropDown();
		new AccountPage(driver).CreateAccountPageMobNumber();
		new AccountPage(driver).CreateAccountPageEmail();
		new AccountPage(driver).CreateAccountPagePassword();
		new AccountPage(driver).CreateAccountPagecontinue();
	}
}
