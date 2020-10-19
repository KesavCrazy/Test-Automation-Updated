package com.kesav.TestCases;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import com.kesav.Constants.AmountRange;

import com.kesav.Constants.HomeMenuComponents;

import com.kesav.Constants.MenuTvAppliancesElectronicsComponents;

import com.kesav.Constants.StarRatings;
import com.kesav.Constants.TvLeftNav;
import com.kesav.Utility.BaseTest;
import com.kesav.Utility.Extras;

public class TvOrder extends BaseTest{
	
	@Test
	
	public void sonyTvOrder() throws InterruptedException {
		
	new HomeMenuComponents(driver, test).HomeMenu();

	new HomeMenuComponents(driver, test).TvAppliancesElectronics();
		
	new Extras(driver,test).Delay();
	
	new MenuTvAppliancesElectronicsComponents(driver, test).televisons();

	new TvLeftNav(driver, test).androidBased();
	
	new TvLeftNav(driver, test).fiftyFiveAbove();
	
	new StarRatings(driver,test).fourStarsAbove();
	
	new AmountRange(driver,test).LowPrice2();
	
	new AmountRange(driver,test).MaxPrice2();
	
	new AmountRange(driver,test).Go();
	
	}
}
