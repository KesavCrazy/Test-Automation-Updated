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

public class HomeMenuRunner extends BaseTest{
	
	@Test
public void Homemenu() {
	
		new HomeMenuComponents(driver).HomeMenu();

		new HomeMenuComponents(driver).EchoAlexa();
		new HomeMenuMainMenu(driver).EchoAlexaMainMenu();
		
		new HomeMenuComponents(driver).FireTvStick();
		new HomeMenuMainMenu(driver).FireTvStickMainMenu();
		
		new HomeMenuComponents(driver).KindleEReaderEBooks();
		new HomeMenuMainMenu(driver).KindleEReaderEBooksMainMenu();
		
		new HomeMenuComponents(driver).AudibleBooks();
		new HomeMenuMainMenu(driver).AudibleBooksMainMenu();
		
		new HomeMenuComponents(driver).AmazonPrimeVideo();
		new HomeMenuMainMenu(driver).AmazonPrimeVideoMainMenu();
		
		new HomeMenuComponents(driver).AmzonPrimeMusic();
		new HomeMenuMainMenu(driver).AmzonPrimeMusicMainMenu();
		
		new HomeMenuComponents(driver).MobilesComputers();
		new HomeMenuMainMenu(driver).MobilesComputersMainMenu();
		
		new HomeMenuComponents(driver).TvAppliancesElectronics();
		new HomeMenuMainMenu(driver).TvAppliancesElectronicsMainMenu();
		
		new HomeMenuComponents(driver).MensFashion();
		new HomeMenuMainMenu(driver).MensFashionMainMenu();
		
		new HomeMenuComponents(driver).WomensFashions();
		new HomeMenuMainMenu(driver).WomensFashionsMainMenu();
		
		new HomeMenuComponents(driver).HomeKitchenPets();
		new HomeMenuMainMenu(driver).HomeKitchenPetsMainMenu();
		
		new HomeMenuComponents(driver).BeautyHealthGrocery();
		new HomeMenuMainMenu(driver).BeautyHealthGroceryMainMenu();
		
		new HomeMenuComponents(driver).SportsFitnessBagsLuggage();
		new HomeMenuMainMenu(driver).SportsFitnessBagsLuggageMainMenu();
		
		new HomeMenuComponents(driver).ToysBabyProductsKidsFashion();
		new HomeMenuMainMenu(driver).ToysBabyProductsKidsFashionMainMenu();
		
		new HomeMenuComponents(driver).CarMotorrBikesIndustrial();
		new HomeMenuMainMenu(driver).CarMotorrBikesIndustrialMainMenu();
		
		new HomeMenuComponents(driver).Books();
		new HomeMenuMainMenu(driver).BooksMainMenu();
		
		new HomeMenuComponents(driver).MoviesMusicVideoGames();
		new HomeMenuMainMenu(driver).MoviesMusicVideoGamesMainMenu();
		
		new HomeMenuComponents(driver).GiftCardsMobRecharges();
		new HomeMenuMainMenu(driver).GiftCardsMobRechargesMainMenu();
		
		new HomeMenuComponents(driver).FlightTickets();
		new HomeMenuMainMenu(driver).FlightTicketsMainMenu();
		
		new HomeMenuComponents(driver).FullStoryDirectory();
		new HomeMenuMainMenu(driver).FullStoryDirectoryMainMenu();
	}
}
