package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class HomeMenuComponents {
	WebDriver driver;

	 public HomeMenuComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
	 WebElement homeMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[2]")
	 WebElement echoAlexa;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[3]")
	 WebElement fireTvStick;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[4]")
	 WebElement kindleEReaderEBooks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[5]")
	 WebElement audibleBooks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[6]")
	 WebElement amazonPrimeVideo;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[7]")
	 WebElement amzonPrimeMusic;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[9]")
	 WebElement mobilesComputers;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[10]")
	 WebElement tvAppliancesElectronics;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[11]")
	 WebElement mensFashion;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[12]")
	 WebElement womensFashions;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[13]")
	 WebElement homeKitchenPets;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[14]")
	 WebElement beautyHealthGrocery;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[15]")
	 WebElement sportsFitnessBagsLuggage;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[16]")
	 WebElement toysBabyProductsKidsFashion;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[17]")
	 WebElement carMotorrBikesIndustrial;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[18]")
	 WebElement books;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[19]")
	 WebElement moviesMusicVideoGames;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[20]")
	 WebElement giftCardsMobRecharges;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[21]")
	 WebElement flightTickets;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[22]")
	 WebElement fullStoryDirectory;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[1]")
	 WebElement mainMenu;

	 @FindBy(xpath="	//*[@id=\"hmenu-content\"]/ul[4]/li[1]/a")
	 WebElement kindleMainMenu;
	
	 public void HomeMenu()
	 {
	    homeMenu.click();		 
	 }
	 public void EchoAlexa()
	 {
		 echoAlexa.click();		 
	 }
	 public void FireTvStick()
	 {
		 fireTvStick.click();		 
	 }
	 public void KindleEReaderEBooks()
	 {
		 kindleEReaderEBooks.click();		 
	 }
	 
	 public void AudibleBooks()
	 {
		 audibleBooks.click();		 
	 }
	 public void AmazonPrimeVideo()
	 {
		 amazonPrimeVideo.click();		 
	 }
	 public void AmzonPrimeMusic()
	 {
		 amzonPrimeMusic.click();		 
	 }
	 public void MobilesComputers()
	 {
		 mobilesComputers.click();		 
	 }
	 public void TvAppliancesElectronics()
	 {
		 tvAppliancesElectronics.click();		 
	 }
	 public void MensFashion()
	 {
		 mensFashion.click();		 
	 }
	 public void WomensFashions()
	 {
		 womensFashions.click();		 
	 }
	 public void HomeKitchenPets()
	 {
		 homeKitchenPets.click();		 
	 }
	 public void BeautyHealthGrocery()
	 {
		 beautyHealthGrocery.click();		 
	 }
	 public void SportsFitnessBagsLuggage()
	 {
		 sportsFitnessBagsLuggage.click();		 
	 }
	 public void ToysBabyProductsKidsFashion()
	 {
		 toysBabyProductsKidsFashion.click();		 
	 }
	 public void CarMotorrBikesIndustrial()
	 {
		 carMotorrBikesIndustrial.click();		 
	 }
	 public void Books()
	 {
		 books.click();		 
	 }
	 public void MoviesMusicVideoGames()
	 {
		 moviesMusicVideoGames.click();		 
	 }
	 public void GiftCardsMobRecharges()
	 {
		 giftCardsMobRecharges.click();		 
	 }
	 public void FlightTickets()
	 {
		 flightTickets.click();		 
	 }
	 public void FullStoryDirectory()
	 {
		 fullStoryDirectory.click();		 
	 }
	 public void MainMenu()
	 {
		 mainMenu.click();		 
	 }
	 public void KindleMainMenu()
	 {
		 kindleMainMenu.click();		 
	 }
	 
}
