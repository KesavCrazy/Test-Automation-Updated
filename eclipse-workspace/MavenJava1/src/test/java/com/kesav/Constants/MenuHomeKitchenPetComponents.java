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

public class MenuHomeKitchenPetComponents {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(HomeMenuComponents.class.getName());
	
	 public MenuHomeKitchenPetComponents(WebDriver driver,ExtentTest test) {
		 this.driver=driver;
		 this.test=test;
		 
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[3]")
	 WebElement kitchenDining;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[4]")
	 WebElement kitchenstoragecontainers;
	 
	 @FindBy(xpath="//a[@class='hmenu-item'][contains(text(),'Furniture')]")
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
		 try
			{
			 kitchenDining.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("kitchenDining : Clicked", color.GREEN));
			 log.debug("KitchenDining Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("kitchenDining : Not Clicked", color.RED));
		    	log.error("KitchenDining Not Clicked");
		    	throw new NoSuchElementException(null);
		}
			 
	 }
	 public void Kitchenstoragecontainers()
	 {
		 kitchenstoragecontainers.click();		 
	 }
	 public void furniture()
	 {
	
		 try
			{
			 furniture.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("furniture : Clicked", color.GREEN));
			 log.debug("furniture Clicked");
			}
		    catch(NoSuchElementException e) {
		    	test.log(Status.FAIL, MarkupHelper.createLabel("furniture : Not Clicked", color.RED));
		    	log.error("furniture Not Clicked");
		    	throw new NoSuchElementException(null);
		}
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
