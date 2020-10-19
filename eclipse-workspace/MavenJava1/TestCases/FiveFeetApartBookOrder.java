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
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;

public class FiveFeetApartBookOrder extends BaseTest{
	
	@Test
	public void FiveFeetApartBookProductOrder() throws InterruptedException {
	
		new HomeSearchDropdownBox(driver).Books();
		
		new HomeSearch(driver).FiveFeetApart();
		
		new HomeSearch(driver).Submit();
		
		new StarRatings(driver).fourStarsAbove();
		
		new AmountRange(driver).LowPrice1();
		
		new AmountRange(driver).MaxPrice1();
		
		new AmountRange(driver).Go();
		
		new FivefeetApartBooks(driver).FiveFeetApart();
		
		new QuantityAddToCartBuyNow(driver).Quantity();
		
		new QuantityAddToCartBuyNow(driver).AddToCart();
	}
}
