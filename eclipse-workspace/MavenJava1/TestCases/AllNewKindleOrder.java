package com.kesav.TestCases;

import org.testng.annotations.Test;

import com.kesav.Constants.AmountRange;
import com.kesav.Constants.Extras;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.KindleLanguageAuthorArrival;
import com.kesav.Constants.MenuKindleEReaderEBookComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;

public class AllNewKindleOrder extends BaseTest{
	@Test
	public void NewKindleOrder() throws InterruptedException{
		 
		new HomeMenuComponents(driver).HomeMenu();
		
		new Extras(driver).Delay();
		
		new HomeMenuComponents(driver).KindleEReaderEBooks();
		
		new Extras(driver).Delay();
		
		new MenuKindleEReaderEBookComponents(driver).allKindleEBook();
		
		new Extras(driver).Delay();
		
		new KindleLanguageAuthorArrival(driver).Last30Days();
		
		new Extras(driver).Delay();
		
		new KindleLanguageAuthorArrival(driver).SeanPatrik();
		
		new StarRatings(driver).threeStarsAbove();
		
		new AmountRange(driver).LowPrice1();
		
		new AmountRange(driver).MaxPrice1();
		
		new  AmountRange(driver).Go();
	}

}
