package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuHomeKitchenPetComponents {
	WebDriver driver;

	 public MenuHomeKitchenPetComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[3]")
	 WebElement kitchenDining;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[4]")
	 WebElement kitchenstoragecontainers;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[5]")
	 WebElement furniture;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[6]")
	 WebElement fineArt;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[7]")
	 WebElement homeFurnishing;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[8]")
	 WebElement bedroomLinen;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[9]")
	 WebElement homeDecor;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[10]")
	 WebElement gardernOutdoor;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[11]")
	 WebElement homeStorage;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[12]")
	 WebElement indoorLighting;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[13]")
	 WebElement homeImprovement;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[14]")
	 WebElement sewingCraftSupplies;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[15]")
	 WebElement allHomeKitchen;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[16]")
	 WebElement shopByRoom;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[17]")
	 WebElement homeKitchenDeal;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[20]")
	 WebElement allPetSupplies;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[21]")
	 WebElement dogSupplies;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[24]")
	 WebElement refurbishedOpenBox;
	 
	 
	 public void KitchenDining()
	 {
		 kitchenDining.click();		 
	 }
	 public void Kitchenstoragecontainers()
	 {
		 kitchenstoragecontainers.click();		 
	 }
	 public void furniture()
	 {
		 furniture.click();		 
	 }
	 
	 public void fineArt()
	 {
		 fineArt.click();		 
	 }
	 public void homeFurnishing()
	 {
		 homeFurnishing.click();		 
	 }
	 public void bedroomLinen()
	 {
		 bedroomLinen.click();		 
	 }
		 
	 public void homeDecor()
	 {
		 homeDecor.click();		 
	 }
	 public void gardernOutdoor()
	 {
		 gardernOutdoor.click();		 
	 }
	 public void homeStorage()
	 {
		 homeStorage.click();		 
	 }
	 public void indoorLighting()
	 {
		 indoorLighting.click();		 
	 }
	 public void homeImprovement()
	 {
		 homeImprovement.click();		 
	 }
	 public void sewingCraftSupplies()
	 {
		 sewingCraftSupplies.click();		 
	 }
	 public void allHomeKitchen()
	 {
		 allHomeKitchen.click();		 
	 }
	 public void shopByRoom()
	 {
		 shopByRoom.click();		 
	 }
	 public void homeKitchenDeal()
	 {
		 homeKitchenDeal.click();		 
	 }
	 public void allPetSupplies()
	 {
		 allPetSupplies.click();		 
	 }
	 public void dogSupplies()
	 {
		 dogSupplies.click();		 
	 }
	 public void refurbishedOpenBox()
	 {
		 refurbishedOpenBox.click();		 
	 }
	
	 
	 
	
}
