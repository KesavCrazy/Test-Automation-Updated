package com.kesav.TestCases;

import org.testng.annotations.Test;

import com.kesav.Constants.Extras;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.MenuKindleEReaderEBookComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;

public class KindlePaperWhiteStarterPackOrder extends BaseTest{
	@Test
	public void KindlePaperWhiteStarterPackProductOrder() throws InterruptedException{
		 
		new HomeMenuComponents(driver).HomeMenu();
		
		new HomeMenuComponents(driver).KindleEReaderEBooks();
		
		new MenuKindleEReaderEBookComponents(driver).KindlePaperWhiteStarterPack();
		
		new QuantityAddToCartBuyNow(driver).Quantity();
		
		new QuantityAddToCartBuyNow(driver).AddToCart();
	}

}
