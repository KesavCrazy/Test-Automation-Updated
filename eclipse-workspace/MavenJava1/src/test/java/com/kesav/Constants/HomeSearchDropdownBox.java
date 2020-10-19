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
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;


public class HomeSearchDropdownBox {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeSearchDropdownBox.class.getName());

	 public HomeSearchDropdownBox(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"searchDropdownBox\"]")
	 WebElement searchDropdownBox;
	 
	 @FindBy(xpath="//span[@id='nav-search-submit-text']//input[@class='nav-input']")
	 WebElement searchIcon;
	
	 public void AllCategories()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("All Categories");	 
	 }
	 public void Deals()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Deals");		 
	 }
	 public void AlexaSkills()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Alexa Skills");		 
	 }
	 public void AmazonDevices()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Amazon Devices");		 
	 }
	 
	 public void AmazonFashion()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Amazon Fashion");		 
	 }
	 public void AmazonPantry()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Amazon Pantry");		 
	 }
	 public void Appliances()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Appliances");		 
	 }
	 public void AppsGames()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Apps & Games");		 
	 }
	 public void Baby()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Baby");		 
	 }
	 public void Beauty()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Beauty");		 
	 }
	 public void Books()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Books");		 
	 }
	 public void CarMotorbike()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Car & Motorbike");		 
	 }
	 public void ClothingAccessories()
	 {
		 try
			
		 {
			 new Select(searchDropdownBox).selectByVisibleText("Clothing & Accessories");	
			 	test.log(Status.PASS, MarkupHelper.createLabel("Clothing & Accessories : Clicked", color.GREEN));
				log.error("Clothing & Accessories Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("Clothing & Accessories : Not Clicked", color.RED));
		    	log.error("Clothing & Accessories Not Clicked");
		    	throw new NoSuchElementException(null);
		}
	 }
	 public void Collectibles()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Collectibles");		 
	 }
	 public void ComputersAccessories()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Computers & Accessories");		 
	 }
	 public void Electronics()
	 {
		 try
			
		 {
			 new Select(searchDropdownBox).selectByVisibleText("Electronics");	
			 	test.log(Status.PASS, MarkupHelper.createLabel("Electronics : Clicked", color.GREEN));
				log.error("Electronics Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("Electronics : Not Clicked", color.RED));
		    	log.error("Electronics Not Clicked");
		    	throw new NoSuchElementException(null);
		}
			 
	 }
	 public void Furniture()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Furniture");		 
	 }
	 public void GardenOutdoors()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Garden & Outdoors");		 
	 }
	 public void GiftCards()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Gift Cards");		 
	 } 
	 public void GroceryGourmetFoods()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Grocery & Gourmet Foods");		 
	 }
	 public void HealthPersonalCare()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Health & Personal Care");		 
	 }
	 public void HomeKitchen()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Home & Kitchen");		 
	 }
	 public void IndustrialScientific()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Industrial & Scientific");		 
	 }
	 public void Jewellery()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Jewellery");		 
	 }
	 public void KindleStore()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Kindle Store");		 
	 }
	 public void LuggageBags()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Luggage & Bags");		 
	 }
	 public void LuxuryBeauty()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Luxury Beauty");		 
	 }
	 public void MoviesTVShows()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Movies & TV Shows");
	 }
	 public void Music()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Music");		 
	 }
	 public void MusicalInstruments()
	 {
		 try
			
		 {
			    new Select(searchDropdownBox).selectByVisibleText("Musical Instruments");		
			 	test.log(Status.PASS, MarkupHelper.createLabel("Musical Instruments : Clicked", color.GREEN));
				log.error("Musical Instruments Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("Musical Instruments : Not Clicked", color.RED));
		    	log.error("Musical Instruments Not Clicked");
		    	throw new NoSuchElementException(null);
		}
			 
	 }
	 public void OfficeProducts()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Office Products");		 
	 }
	 public void PetSupplies()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Pet Supplies");		 
	 }
	 public void PrimeVideo()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Prime Video");		 
	 }
	 public void ShoesHandbags()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Shoes & Handbags");		 
	 }
	 public void Software()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Software");		 
	 }
	 public void SportsFitnessOutdoors()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Sports, Fitness & Outdoors");		 
	 }
	 public void ToolsHomeImprovement()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Tools & Home Improvement");		 
	 }
	 public void ToysGames()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Toys & Games");		 
	 }
	 public void Under500()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Under ₹500");		 
	 }
	 public void VideoGames()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Video Games");		 
	 }
	 public void Watches()
	 {
		 new Select(searchDropdownBox).selectByVisibleText("Watches");		 
	 }
	 public void searchIcon()
		 {
			 try
				
			 {
				 		searchIcon.click();
				 	test.log(Status.PASS, MarkupHelper.createLabel("searchIcon : Clicked", color.GREEN));
					log.error("searchIcon Clicked");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("searchIcon : Not Clicked", color.RED));
			    	log.error("searchIcon Not Clicked");
			    	throw new NoSuchElementException(null);
			}
		 }
}
