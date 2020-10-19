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

public class MenuToysbabyProductsKidsFashion {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());

	 public MenuToysbabyProductsKidsFashion(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//a[contains(text(),'Toys & Games')]")
	 WebElement toysAndGames;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[4]")
	 WebElement babyProducts;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[5]")
	 WebElement diapers;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[6]")
	 WebElement ToysGiftingStore;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[7]")
	 WebElement stemToysStore;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[8]")
	 WebElement internationalToyStore;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[9]")
	 WebElement babyBathSkinGrooming;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[10]")
	 WebElement strollersPrams;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[11]")
	 WebElement nursingFeeding;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[12]")
	 WebElement subscribingAndSave;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[13]")
	 WebElement pantry;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[14]")
	 WebElement amazonFamily;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[17]")
	 WebElement kidsClothing;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[18]")
	 WebElement kidsShoes;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[19]")
	 WebElement schoolBags;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[20]")
	 WebElement kidsWatches;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[21]")
	 WebElement kidsFashion;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[22]")
	 WebElement babyFashion;
	 
	 public void toysAndGames()
	 {
		 try
			
		 {
			    toysAndGames.click();
			 	test.log(Status.PASS, MarkupHelper.createLabel("toysAndGames : Clicked", color.GREEN));
				log.error("toysAndGames Clicked");	 
		 }
			
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("toysAndGames : Not Clicked", color.RED));
		    	log.error("toysAndGames Not Clicked");
		    	throw new NoSuchElementException(null);
		}
		 toysAndGames.click();		 
	 }
	 public void babyProducts()
	 {
		 babyProducts.click();		 
	 }
	 public void diapers()
	 {
		 diapers.click();		 
	 }
	 
	 public void ToysGiftingStore()
	 {
		 ToysGiftingStore.click();		 
	 }
	 public void stemToysStore()
	 {
		 stemToysStore.click();		 
	 }
	 public void internationalToyStore()
	 {
		 internationalToyStore.click();		 
	 }
		 
	 public void babyBathSkinGrooming()
	 {
		 babyBathSkinGrooming.click();		 
	 }
	 public void strollersPrams()
	 {
		 strollersPrams.click();		 
	 }
	 public void nursingFeeding()
	 {
		 nursingFeeding.click();		 
	 }
	 public void subscribingAndSave()
	 {
		 subscribingAndSave.click();		 
	 }
	 public void pantry()
	 {
		 pantry.click();		 
	 }
	 public void amazonFamily()
	 {
		 amazonFamily.click();		 
	 }
	 public void kidsClothing()
	 {
		 kidsClothing.click();		 
	 }	
	 public void kidsShoes()
	 {
		 kidsShoes.click();		 
	 }
	 public void schoolBags()
	 {
		 schoolBags.click();		 
	 }
	 public void kidsWatches()
	 {
		 kidsWatches.click();		 
	 }
	 public void kidsFashion()
	 {
		 kidsFashion.click();		 
	 }
	 public void babyFashion()
	 {
		 babyFashion.click();		 
	 }
}
