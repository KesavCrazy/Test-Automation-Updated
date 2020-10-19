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
import com.kesav.Constants.HomeToolBarComponents;
import com.kesav.Constants.MenuEchoAlexaComponents;
import com.kesav.Constants.MobileBrandsCheckBox;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Constants.StarRatingsMob;
import com.kesav.Utility.BaseTest;

public class MobileOrderUsingToolBar extends BaseTest{
	
	@Test
	public void MobileOrderUsingToolBarOrder() throws InterruptedException {
	
		new HomeToolBarComponents(driver).mobiles();
		
		new StarRatingsMob(driver).fourStarsAbove();
		
		new MobileBrandsCheckBox(driver,test).Samsung();
		
		new AmountRange(driver,test).LowPrice1();
		
		new AmountRange(driver,test).MaxPrice1();
		
		new AmountRange(driver,test).Go();
				
		new QuantityAddToCartBuyNow(driver,test).Quantity();
		
		new QuantityAddToCartBuyNow(driver,test).AddToCart();
	}
}
