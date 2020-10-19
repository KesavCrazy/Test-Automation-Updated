package com.kesav.TestCases;

import org.testng.annotations.Test;

import com.kesav.Constants.AmountRange;

import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.KindleLanguageAuthorArrival;
import com.kesav.Constants.MenuKindleEReaderEBookComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Utility.BaseTest;
import com.kesav.Utility.Extras;

public class AllNewKindleOrder extends BaseTest{
	@Test
	public void NewKindleOrder() throws InterruptedException{
		 
		new HomeMenuComponents(driver,test).HomeMenu();
		
		new Extras(driver,test).Delay();
		
		new HomeMenuComponents(driver,test).KindleEReaderEBooks();
		
		new Extras(driver,test).Delay();
		
		new MenuKindleEReaderEBookComponents(driver).allKindleEBook();
		
		new Extras(driver,test).Delay();
		
		new KindleLanguageAuthorArrival(driver).Last30Days();
		
		new Extras(driver,test).Delay();
		
		new KindleLanguageAuthorArrival(driver).SeanPatrik();
		
		new StarRatings(driver,test).threeStarsAbove();
		
		new AmountRange(driver,test).LowPrice1();
		
		new AmountRange(driver,test).MaxPrice1();
		
		new  AmountRange(driver,test).Go();
	}

}
