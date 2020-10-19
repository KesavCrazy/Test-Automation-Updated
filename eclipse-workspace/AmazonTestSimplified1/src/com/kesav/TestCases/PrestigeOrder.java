package com.kesav.TestCases;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kesav.Constants.AmountRange;
import com.kesav.Constants.Extras;
import com.kesav.Constants.FivefeetApartBooks;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeMenuMainMenu;
import com.kesav.Constants.HomeSearch;
import com.kesav.Constants.HomeSearchDropdownBox;
import com.kesav.Constants.MenuEchoAlexaComponents;
import com.kesav.Constants.MenuHomeKitchenPetComponents;
import com.kesav.Constants.MenuTvAppliancesElectronicsComponents;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Constants.TvLeftNav;

public class PrestigeOrder extends BaseTest{
	
	@Test
	public void prestigeProductOrder() throws InterruptedException {
	
	new HomeMenuComponents(driver).HomeMenu();
	
	new Extras(driver).Delay();
	
	new HomeMenuComponents(driver).HomeKitchenPets();
	
	new MenuHomeKitchenPetComponents(driver).KitchenDining();
	
    new AmountRange(driver).LowPrice1();
	
	new AmountRange(driver).MaxPrice2();

	new  AmountRange(driver).Go();
	
}
}