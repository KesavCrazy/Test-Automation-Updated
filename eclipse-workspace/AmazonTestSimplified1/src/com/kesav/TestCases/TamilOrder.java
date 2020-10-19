package com.kesav.TestCases;

import org.testng.annotations.Test;

import com.kesav.Constants.AmountRange;
import com.kesav.Constants.Extras;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.KindleLanguageAuthorArrival;
import com.kesav.Constants.MenuKindleEReaderEBookComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;

public class TamilOrder extends BaseTest{
	@Test
	public void TamilBooksOrder() throws InterruptedException{
		 
		new HomeMenuComponents(driver).HomeMenu();
		
		new HomeMenuComponents(driver).KindleEReaderEBooks();

		new MenuKindleEReaderEBookComponents(driver).Tamil();
		
		new KindleLanguageAuthorArrival(driver).SeeMore();
		
		new KindleLanguageAuthorArrival(driver).SuggestField();
	}

}
