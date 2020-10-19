package com.kesav.TestCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.kesav.Constants.AmountRange;
import com.kesav.Constants.ClothingLeftNav;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeSearchDropdownBox;
import com.kesav.Constants.MenuTvAppliancesElectronicsComponents;
import com.kesav.Constants.MusicalProduct;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Constants.TvLeftNav;
import com.kesav.Constants.WomensProducts;
import com.kesav.Utility.BaseTest;
import com.kesav.Utility.Extras;

public class SareeOrder extends BaseTest{
	
	@Test
	
	public void sonyTvOrder() throws InterruptedException {

	new HomeSearchDropdownBox(driver,test).ClothingAccessories();

	new HomeSearchDropdownBox(driver,test).searchIcon();
	
	new StarRatings(driver,test).fourStarsAbove();
	
	new AmountRange(driver,test).LowPrice1();
	
	new AmountRange(driver,test).MaxPrice1();
	
	new AmountRange(driver,test).Go();
	
	new ClothingLeftNav(driver,test).womenCheckBox();
	
	new ClothingLeftNav(driver,test).ethnicWear();
	
	new WomensProducts(driver,test).womensSaree();

	new Extras(driver,test).ChildTab();
	
	new QuantityAddToCartBuyNow(driver,test).Quantity();
	
	new QuantityAddToCartBuyNow(driver,test).AddToCart();

	}
}