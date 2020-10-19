package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kesav.Constants.FivefeetApartBooks;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeMenuMainMenu;
import com.kesav.Constants.MenuEchoAlexaComponents;
import com.kesav.Constants.MenuFireTVStickComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Utility.BaseTest;

public class FireTv4K extends BaseTest{
	
	@Test
    public void FireTv4KProduct() {
	
		new HomeMenuComponents(driver,test).HomeMenu();
		
		new HomeMenuComponents(driver,test).FireTvStick(); 
		
		new MenuFireTVStickComponents(driver).FireTvStick4K();
		
		new QuantityAddToCartBuyNow(driver,test).Quantity();
		
		new QuantityAddToCartBuyNow(driver,test).AddToCart();
		
	}
}
