package com.kesav.TestCases;

import java.io.IOException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kesav.Constants.AccountPage;
import com.kesav.Constants.AccountPageMySql;
import com.kesav.Constants.AmountRange;
import com.kesav.Constants.FivefeetApartBooks;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeMenuMainMenu;
import com.kesav.Constants.HomeSearch;
import com.kesav.Constants.HomeSearchDropdownBox;
import com.kesav.Constants.MenuEchoAlexaComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Utility.BaseTest;

public class CreateAccountPageMySql extends BaseTest{
	
	@Test
	public void CreateAccPage() throws InterruptedException, IOException, SQLException {
	
		new AccountPageMySql(driver,test).tosignInPage();
		new AccountPageMySql(driver,test).ToCreateAccountPage();
		new AccountPageMySql(driver,test).CreateAccountPageCustomerName();
		new AccountPageMySql(driver,test).CreateAccountPageMobDropDown();
		new AccountPageMySql(driver,test).CreateAccountPageMobNumber();
		new AccountPageMySql(driver,test).CreateAccountPageEmail();
		new AccountPageMySql(driver,test).CreateAccountPagePassword();
		new AccountPageMySql(driver,test).CreateAccountPagecontinue();
	}
}
