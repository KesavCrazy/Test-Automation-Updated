package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kesav.Constants.AmountRange;
import com.kesav.Constants.FivefeetApartBooks;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeMenuMainMenu;
import com.kesav.Constants.HomeSearch;
import com.kesav.Constants.HomeSearchDropdownBox;
import com.kesav.Constants.MenuEchoAlexaComponents;
import com.kesav.Constants.MenuSportsFitnessBagComponents;
import com.kesav.Constants.MenuTvAppliancesElectronicsComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Constants.TvLeftNav;
import com.kesav.Utility.BaseTest;

public class CyclingOrder extends BaseTest{
	
	@Test
	public void sonyTvOrder() throws InterruptedException {
	
	new HomeMenuComponents(driver,test).HomeMenu();
	
	new HomeMenuComponents(driver,test).SportsFitnessBagsLuggage();
	
	new MenuSportsFitnessBagComponents(driver).cycling();
	
	new StarRatings(driver,test).fourStarsAbove();
	
	new AmountRange(driver,test).LowPrice2();
	
	new AmountRange(driver,test).MaxPrice2();
	
	new AmountRange(driver,test).Go();
	}
}
