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
import com.kesav.Constants.MobileBrandsCheckBox;
import com.kesav.Constants.MobileProducts;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Utility.BaseTest;
import com.kesav.Utility.Extras;

public class MobileOrder extends BaseTest{
	
	@Test
	public void MobileProductOrder() throws InterruptedException {
	
		new HomeSearchDropdownBox(driver,test).Electronics();
		
		new Extras(driver, test).Delay();
		
		new HomeSearch(driver).Mobiles();
		
		new StarRatings(driver,test).fourStarsAbove();
		
		new AmountRange(driver,test).LowPrice1();
		
		new AmountRange(driver,test).MaxPrice2();
		
		new AmountRange(driver,test).Go();
		
		new Extras(driver, test).Delay();
		
		new MobileBrandsCheckBox(driver,test).Samsung();
		
		new MobileProducts(driver,test).galaxyM31();
		
		new Extras(driver, test).ChildTab();
		
		new QuantityAddToCartBuyNow(driver,test).AddToCart();
	}
}
