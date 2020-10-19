package com.kesav.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.kesav.Constants.HomeMenuComponents;
import com.kesav.Constants.HomeMenuMainMenu;
import com.kesav.Utility.BaseTest;

public class HomeMenuRunner extends BaseTest{
	
	@Test
public void Homemenu() {
	
		new HomeMenuComponents(driver,test).HomeMenu();

		new HomeMenuComponents(driver,test).EchoAlexa();
		new HomeMenuMainMenu(driver).EchoAlexaMainMenu();
		
		new HomeMenuComponents(driver,test).FireTvStick();
		new HomeMenuMainMenu(driver).FireTvStickMainMenu();
		
		new HomeMenuComponents(driver,test).KindleEReaderEBooks();
		new HomeMenuMainMenu(driver).KindleEReaderEBooksMainMenu();
		
		new HomeMenuComponents(driver,test).AudibleBooks();
		new HomeMenuMainMenu(driver).AudibleBooksMainMenu();
		
		new HomeMenuComponents(driver,test).AmazonPrimeVideo();
		new HomeMenuMainMenu(driver).AmazonPrimeVideoMainMenu();
		
		new HomeMenuComponents(driver,test).AmzonPrimeMusic();
		new HomeMenuMainMenu(driver).AmzonPrimeMusicMainMenu();
		
		new HomeMenuComponents(driver,test).MobilesComputers();
		new HomeMenuMainMenu(driver).MobilesComputersMainMenu();
		
		new HomeMenuComponents(driver,test).TvAppliancesElectronics();
		new HomeMenuMainMenu(driver).TvAppliancesElectronicsMainMenu();
		
		new HomeMenuComponents(driver,test).MensFashion();
		new HomeMenuMainMenu(driver).MensFashionMainMenu();
		
		new HomeMenuComponents(driver,test).WomensFashions();
		new HomeMenuMainMenu(driver).WomensFashionsMainMenu();
		
		new HomeMenuComponents(driver,test).HomeKitchenPets();
		new HomeMenuMainMenu(driver).HomeKitchenPetsMainMenu();
		
		new HomeMenuComponents(driver,test).BeautyHealthGrocery();
		new HomeMenuMainMenu(driver).BeautyHealthGroceryMainMenu();
		
		new HomeMenuComponents(driver,test).SportsFitnessBagsLuggage();
		new HomeMenuMainMenu(driver).SportsFitnessBagsLuggageMainMenu();
		
		new HomeMenuComponents(driver,test).ToysBabyProductsKidsFashion();
		new HomeMenuMainMenu(driver).ToysBabyProductsKidsFashionMainMenu();
		
		new HomeMenuComponents(driver,test).CarMotorrBikesIndustrial();
		new HomeMenuMainMenu(driver).CarMotorrBikesIndustrialMainMenu();
		
		new HomeMenuComponents(driver,test).Books();
		new HomeMenuMainMenu(driver).BooksMainMenu();
		
		new HomeMenuComponents(driver,test).MoviesMusicVideoGames();
		new HomeMenuMainMenu(driver).MoviesMusicVideoGamesMainMenu();
		
		new HomeMenuComponents(driver,test).GiftCardsMobRecharges();
		new HomeMenuMainMenu(driver).GiftCardsMobRechargesMainMenu();
		
		new HomeMenuComponents(driver,test).FlightTickets();
		new HomeMenuMainMenu(driver).FlightTicketsMainMenu();
		
		new HomeMenuComponents(driver,test).FullStoryDirectory();
		new HomeMenuMainMenu(driver).FullStoryDirectoryMainMenu();
	}
}
