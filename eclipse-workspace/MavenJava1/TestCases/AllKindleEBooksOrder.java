package com.kesav.TestCases;

import org.testng.annotations.Test;

import com.kesav.Constants.Extras;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.MenuKindleEReaderEBookComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;

public class AllKindleEBooksOrder extends BaseTest{
	@Test
	public void NewKindleBooKsOrder() throws InterruptedException{
		 
		new HomeMenuComponents(driver).HomeMenu();
		
		new Extras(driver).Delay();
		
		new HomeMenuComponents(driver).KindleEReaderEBooks();
		
		new Extras(driver).Delay();
		
		new MenuKindleEReaderEBookComponents(driver).allNewKindle();
		
		new Extras(driver).Delay();
		
		new QuantityAddToCartBuyNow(driver).Quantity();
		
		new QuantityAddToCartBuyNow(driver).AddToCart();
	}

}
