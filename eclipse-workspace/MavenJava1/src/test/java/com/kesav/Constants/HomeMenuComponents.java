package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.kesav.Utility.BaseTest;

public class HomeMenuComponents {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public HomeMenuComponents(WebDriver driver,ExtentTest test ) {
		 
		 this.driver=driver;
		 this.test=test;
		
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
	 WebElement homeMenu;
	 
	 @FindBy(xpath="//div[contains(text(),'Echo & Alexa')]")
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
		 try
			{
			 homeMenu.click();	
			 log.debug("Home Menu Clicked");
			 test.log(Status.PASS, MarkupHelper.createLabel("HomeMenu : Clicked", color.GREEN));
			}
		    catch(NoSuchElementException e) {
		    	  test.log(Status.FAIL, MarkupHelper.createLabel("HomeMenu : Not Clicked", color.RED));
		    		log.error("HomeMenu Not Clicked");
		    	  throw new NoSuchElementException(null);
		}
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
		 try
			{
			 tvAppliancesElectronics.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("tvAppliancesElectronics : Clicked", color.GREEN));
			 log.debug("tvAppliancesElectronics clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.fail("TvAppliancesElectronics : Not Clicked");
		    	 log.error("tvAppliancesElectronics Not Clicked");
		    	 throw new NoSuchElementException(null);
		}
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
		 try
			{
			 homeKitchenPets.click();	
			    test.log(Status.PASS, MarkupHelper.createLabel("HomeKitchenPets : Clicked", color.GREEN));
			    log.debug("homeKitchenPets clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.log(Status.FAIL, MarkupHelper.createLabel("HomeKitchenPets : Clicked", color.RED));
		    	 log.error("tvAppliancesElectronics Not Clicked");
		    	 throw new NoSuchElementException(null);
		    	 
		}
		 	 
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
	 { try
		{
		 toysBabyProductsKidsFashion.click();
		 test.log(Status.PASS, MarkupHelper.createLabel("toysBabyProductsKidsFashion : Clicked", color.GREEN));
		 log.debug("toysBabyProductsKidsFashion clicked");
		}
	    catch(NoSuchElementException e) {
	    	test.log(Status.FAIL, MarkupHelper.createLabel("toysBabyProductsKidsFashion : Not Clicked", color.RED));
	    	 log.error("toysBabyProductsKidsFashion Not Clicked");
	    	 throw new NoSuchElementException(null);
	}
		 		 
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
