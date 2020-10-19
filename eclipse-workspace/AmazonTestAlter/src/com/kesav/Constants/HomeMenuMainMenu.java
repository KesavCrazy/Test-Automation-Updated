package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class HomeMenuMainMenu {
	WebDriver driver;

	 public HomeMenuMainMenu(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[1]/a")
	 WebElement echoAlexaMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[3]/li[1]/a")
	 WebElement fireTvStickMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[1]/a")
	 WebElement kindleEReaderEBooksMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[5]/li[1]/a")
	 WebElement audibleBooksMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[6]/li[1]/a")
	 WebElement amazonPrimeVideoMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[1]/a")
	 WebElement amzonPrimeMusicMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[8]/li[1]/a")
	 WebElement mobilesComputersMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[9]/li[1]/a")
	 WebElement tvAppliancesElectronicsMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[10]/li[1]/a")
	 WebElement mensFashionMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[1]/a")
	 WebElement womensFashionsMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[1]/a")
	 WebElement homeKitchenPetsMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[1]/a")
	 WebElement beautyHealthGroceryMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[1]/a")
	 WebElement sportsFitnessBagsLuggageMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[1]/a")
	 WebElement toysBabyProductsKidsFashionMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[1]/a")
	 WebElement carMotorrBikesIndustrialMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[17]/li[1]/a")
	 WebElement booksMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[1]/a")
	 WebElement moviesMusicVideoGamesMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[1]/a")
	 WebElement giftCardsMobRechargesMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[20]/li[1]/a")
	 WebElement flightTicketsMainMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[21]/li[1]/a")
	 WebElement fullStoryDirectoryMainMenu;
	 
	 
	 public void EchoAlexaMainMenu()
	 {
		 echoAlexaMainMenu.click();		 
	 }
	 public void FireTvStickMainMenu()
	 {
		 fireTvStickMainMenu.click();		 
	 }
	 public void KindleEReaderEBooksMainMenu()
	 {
		 kindleEReaderEBooksMainMenu.click();		 
	 }
	 
	 public void AudibleBooksMainMenu()
	 {
		 audibleBooksMainMenu.click();		 
	 }
	 public void AmazonPrimeVideoMainMenu()
	 {
		 amazonPrimeVideoMainMenu.click();		 
	 }
	 public void AmzonPrimeMusicMainMenu()
	 {
		 amzonPrimeMusicMainMenu.click();		 
	 }
	 public void MobilesComputersMainMenu()
	 {
		 mobilesComputersMainMenu.click();		 
	 }
	 public void TvAppliancesElectronicsMainMenu()
	 {
		 tvAppliancesElectronicsMainMenu.click();		 
	 }
	 public void MensFashionMainMenu()
	 {
		 mensFashionMainMenu.click();		 
	 }
	 public void WomensFashionsMainMenu()
	 {
		 womensFashionsMainMenu.click();		 
	 }
	 public void HomeKitchenPetsMainMenu()
	 {
		 homeKitchenPetsMainMenu.click();		 
	 }
	 public void BeautyHealthGroceryMainMenu()
	 {
		 beautyHealthGroceryMainMenu.click();		 
	 }
	 public void SportsFitnessBagsLuggageMainMenu()
	 {
		 sportsFitnessBagsLuggageMainMenu.click();		 
	 }
	 public void ToysBabyProductsKidsFashionMainMenu()
	 {
		 toysBabyProductsKidsFashionMainMenu.click();		 
	 }
	 public void CarMotorrBikesIndustrialMainMenu()
	 {
		 carMotorrBikesIndustrialMainMenu.click();		 
	 }
	 public void BooksMainMenu()
	 {
		 booksMainMenu.click();		 
	 }
	 public void MoviesMusicVideoGamesMainMenu()
	 {
		 moviesMusicVideoGamesMainMenu.click();		 
	 }
	 public void GiftCardsMobRechargesMainMenu()
	 {
		 giftCardsMobRechargesMainMenu.click();		 
	 }
	 public void FlightTicketsMainMenu()
	 {
		 flightTicketsMainMenu.click();		 
	 }
	 public void FullStoryDirectoryMainMenu()
	 {
		 fullStoryDirectoryMainMenu.click();		 
	 }
	 
}
