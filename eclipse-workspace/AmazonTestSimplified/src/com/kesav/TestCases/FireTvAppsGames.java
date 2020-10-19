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
import com.kesav.Constants.MenuEchoAlexaComponents;
import com.kesav.Constants.MenuFireTVStickComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;

public class FireTvAppsGames extends BaseTest{
	
	@Test
    public void Homemenu() {
	
		new HomeMenuComponents(driver).HomeMenu();
		
		new HomeMenuComponents(driver).FireTvStick(); 
		
		new MenuFireTVStickComponents(driver).FireTvAppsGames();
		
		new StarRatings(driver).fourStarsAbove();
		
		new AmountRange(driver).Free();
		
	}
}
