package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuToysbabyProductsKidsFashion {
	WebDriver driver;

	 public MenuToysbabyProductsKidsFashion(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[15]/li[3]")
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
