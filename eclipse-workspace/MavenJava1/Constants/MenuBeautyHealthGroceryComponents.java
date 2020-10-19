package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuBeautyHealthGroceryComponents {
	WebDriver driver;

	 public MenuBeautyHealthGroceryComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[3]")
	 WebElement beautyGrooming;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[4]")
	 WebElement luxuryBeauty;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[5]")
	 WebElement makeUp;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[6]")
	 WebElement healthPersonalCare;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[7]")
	 WebElement houseHoldSupplies;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[8]")
	 WebElement personalCareAppliances;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[9]")
	 WebElement dietNutrition;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[10]")
	 WebElement subscribeSave;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[11]")
	 WebElement pantry;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[12]")
	 WebElement valueBazaar;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[15]")
	 WebElement allGroceryGourmetFoods;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[16]")
	 WebElement coffeeTeaBeverages;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[13]/li[17]")
	 WebElement snackFoods;
	 
	 public void beautyGrooming()
	 {
		 beautyGrooming.click();		 
	 }
	 public void luxuryBeauty()
	 {
		 luxuryBeauty.click();		 
	 }
	 public void makeUp()
	 {
		 makeUp.click();		 
	 }
	 
	 public void healthPersonalCare()
	 {
		 healthPersonalCare.click();		 
	 }
	 public void houseHoldSupplies()
	 {
		 houseHoldSupplies.click();		 
	 }
	 public void personalCareAppliances()
	 {
		 personalCareAppliances.click();		 
	 }
		 
	 public void dietNutrition()
	 {
		 dietNutrition.click();		 
	 }
	 public void subscribeSave()
	 {
		 subscribeSave.click();		 
	 }
	 public void pantry()
	 {
		 pantry.click();		 
	 }
	 public void valueBazaar()
	 {
		 valueBazaar.click();		 
	 }
	 public void allGroceryGourmetFoods()
	 {
		 allGroceryGourmetFoods.click();		 
	 }
	 public void coffeeTeaBeverages()
	 {
		 coffeeTeaBeverages.click();		 
	 }
	 public void snackFoods()
	 {
		 snackFoods.click();		 
	 }	 	
}
