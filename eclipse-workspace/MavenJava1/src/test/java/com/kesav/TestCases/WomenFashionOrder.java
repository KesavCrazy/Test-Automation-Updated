package com.kesav.TestCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.kesav.Constants.AmountRange;
import com.kesav.Constants.AppliancesBrands;
import com.kesav.Constants.AppliancesProducts;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeSearch;
import com.kesav.Constants.HomeSearchDropdownBox;
import com.kesav.Constants.MenuTvAppliancesElectronicsComponents;
import com.kesav.Constants.MenuWomensClothingComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Constants.TvLeftNav;
import com.kesav.Constants.WomensProducts;
import com.kesav.Utility.BaseTest;
import com.kesav.Utility.Extras;

public class WomenFashionOrder extends BaseTest{
	
	@Test
	
	public void sonyTvOrder() throws InterruptedException {
	
	new HomeMenuComponents(driver,test).HomeMenu();
	
	new HomeMenuComponents(driver,test).WomensFashions();
	
	new MenuWomensClothingComponents(driver,test).westernWear();
	
	new StarRatings(driver,test).fourStarsAbove();
	
	new AmountRange(driver,test).LowPrice1();
	
	new AmountRange(driver,test).MaxPrice1();
	
	new AmountRange(driver,test).Go();
	
	new WomensProducts(driver,test).womensTops();
	
	new Extras(driver, test).ChildTab();
	
	new QuantityAddToCartBuyNow(driver,test).AddToCart();

	}
}
