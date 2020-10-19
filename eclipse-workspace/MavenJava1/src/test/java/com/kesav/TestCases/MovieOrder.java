package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.kesav.Constants.AmountRange;

import com.kesav.Constants.FivefeetApartBooks;
import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeMenuMainMenu;
import com.kesav.Constants.HomeSearch;
import com.kesav.Constants.HomeSearchDropdownBox;
import com.kesav.Constants.MensTShirt;
import com.kesav.Constants.MenuEchoAlexaComponents;
import com.kesav.Constants.MenuMensClothingComponents;
import com.kesav.Constants.MenuMoviesMusicVideoGamesComponents;
import com.kesav.Constants.MenuTvAppliancesElectronicsComponents;
import com.kesav.Constants.MobileProducts;
import com.kesav.Constants.MovieProducts;
import com.kesav.Constants.QuantityAddToCartBuyNow;
import com.kesav.Constants.StarRatings;
import com.kesav.Constants.TvLeftNav;
import com.kesav.Utility.BaseTest;
import com.kesav.Utility.Extras;

public class MovieOrder extends BaseTest{

	
	@Test
	
	public void movieOrder() throws InterruptedException {
		
	new HomeMenuComponents(driver, test).HomeMenu();

	new HomeMenuComponents(driver, test).MoviesMusicVideoGames();
		
	new Extras(driver,test).Delay();
	
	new MenuMoviesMusicVideoGamesComponents(driver).allMoviesTvshows();

	new StarRatings(driver,test).fourStarsAbove();
	
	new AmountRange(driver,test).LowPrice1();
	
	new AmountRange(driver,test).MaxPrice2();
	
	new AmountRange(driver,test).Go();
	
	new MovieProducts(driver,test).jasonBourne();
	
	new Extras(driver,test).ChildTab();
	
	new QuantityAddToCartBuyNow(driver,test).Quantity();
	
	new QuantityAddToCartBuyNow(driver,test).AddToCart();
	
	}
}