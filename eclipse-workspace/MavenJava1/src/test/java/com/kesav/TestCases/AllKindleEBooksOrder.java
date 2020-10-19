package com.kesav.TestCases;

import org.testng.annotations.Test;


import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.MenuKindleEReaderEBookComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Utility.BaseTest;
import com.kesav.Utility.Extras;

public class AllKindleEBooksOrder extends BaseTest{
	@Test
	public void NewKindleBooKsOrder() throws InterruptedException{
		 
		new HomeMenuComponents(driver,test).HomeMenu();
		
		new com.kesav.Utility.Extras(driver,test).Delay();
		
		new HomeMenuComponents(driver,test).KindleEReaderEBooks();
		
		new com.kesav.Utility.Extras(driver,test).Delay();
		
		new MenuKindleEReaderEBookComponents(driver).allNewKindle();
		
		new Extras(driver,test).Delay();
		
		new QuantityAddToCartBuyNow(driver,test).Quantity();
		
		new QuantityAddToCartBuyNow(driver,test).AddToCart();
	}

}
