package com.kesav.TestCases;

import org.testng.annotations.Test;


import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.MenuKindleEReaderEBookComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Utility.BaseTest;

public class KindlePaperWhiteStarterPackOrder extends BaseTest{
	@Test
	public void KindlePaperWhiteStarterPackProductOrder() throws InterruptedException{
		 
		new HomeMenuComponents(driver,test).HomeMenu();
		
		new HomeMenuComponents(driver,test).KindleEReaderEBooks();
		
		new MenuKindleEReaderEBookComponents(driver).KindlePaperWhiteStarterPack();
		
		new QuantityAddToCartBuyNow(driver,test).Quantity();
		
		new QuantityAddToCartBuyNow(driver,test).AddToCart();
	}

}
