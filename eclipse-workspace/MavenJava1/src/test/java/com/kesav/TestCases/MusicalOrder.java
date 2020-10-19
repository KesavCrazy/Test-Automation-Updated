package com.kesav.TestCases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.kesav.Constants.AmountRange;

import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeSearchDropdownBox;
import com.kesav.Constants.MenuTvAppliancesElectronicsComponents;
import com.kesav.Constants.MusicalProduct;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Constants.TvLeftNav;
import com.kesav.Utility.BaseTest;
import com.kesav.Utility.Extras;

public class MusicalOrder extends BaseTest{
	
	@Test
	
	public void sonyTvOrder() throws InterruptedException {

	new HomeSearchDropdownBox(driver,test).MusicalInstruments();
	
	new HomeSearchDropdownBox(driver,test).searchIcon();
	
	new StarRatings(driver,test).fourStarsAbove();
	
	new AmountRange(driver,test).LowPrice2();
	
	new AmountRange(driver,test).MaxPrice2();
	
	new AmountRange(driver,test).Go();
	
	new MusicalProduct(driver,test).ddjrr();
	
	new Extras(driver,test).ChildTab();
	
	new QuantityAddToCartBuyNow(driver,test).Quantity();
	
	new QuantityAddToCartBuyNow(driver,test).AddToCart();
	
	}
}
