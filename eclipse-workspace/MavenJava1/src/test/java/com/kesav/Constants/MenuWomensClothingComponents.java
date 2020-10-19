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

public class MenuWomensClothingComponents {
	WebDriver driver;
	ExtentTest test;
	ExtentColor color;
	public static Logger log = LogManager.getLogger(MenuWomensClothingComponents.class.getName());

	 public MenuWomensClothingComponents(WebDriver driver,ExtentTest test) {
		 
		 this.driver=driver;
		 this.test=test;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[3]")
	 WebElement clothing;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[4]")
	 WebElement westernWear;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[5]")
	 WebElement ethnicWear;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[6]")
	 WebElement lingerieNightWear;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[7]")
	 WebElement topBrands;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[10]")
	 WebElement watches;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[11]")
	 WebElement handbagsLuggage;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[12]")
	 WebElement goldDiamondjewellery;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[13]")
	 WebElement fashionjewellery;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[14]")
	 WebElement sunglassess;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[17]")
	 WebElement shoes;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[18]")
	 WebElement fashionSandals;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[19]")
	 WebElement ballerinas;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[22]")
	 WebElement theDesignBoutiq;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[23]")
	 WebElement handloomHandicraft;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[24]")
	 WebElement sportWear;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[25]")
	 WebElement womensFashion;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[26]")
	 WebElement amzFashion;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[11]/li[28]")
	 WebElement fashionSalesDeals;
	 
	 public void clothing()
	 {
		 clothing.click();		 
	 }
	 public void westernWear()
	 {	
		 try
			{
			 westernWear.click();	
			 test.log(Status.PASS, MarkupHelper.createLabel("westernWear : Clicked", color.GREEN));
			 log.debug("westernWear clicked");
			}
		    catch(NoSuchElementException e) {
		    	 test.fail("westernWear : Not Clicked");
		    	 log.error("westernWear Not Clicked");
		    	 throw new NoSuchElementException(null);
		}
	 }
	 public void lingerieNightWear()
	 {
		 lingerieNightWear.click();		 
	 }
	 
	 public void ethnicWear()
	 {
		 ethnicWear.click();		 
	 }
	 public void topBrands()
	 {
		 topBrands.click();		 
	 }
	 public void watches()
	 {
		 watches.click();		 
	 }
		 
	 public void HandbagsLuggage()
	 {
		 handbagsLuggage.click();		 
	 }
	 public void goldDiamondjewellery()
	 {
		 goldDiamondjewellery.click();		 
	 }
	 public void fashionjewellery()
	 {
		 fashionjewellery.click();		 
	 }
	 public void sunglassess()
	 {
		 sunglassess.click();		 
	 }
	 public void shoes()
	 {
		 shoes.click();		 
	 }
	 public void fashionSandals()
	 {
		 fashionSandals.click();		 
	 }
	 public void ballerinas()
	 {
		 ballerinas.click();		 
	 }
	 public void theDesignBoutiq()
	 {
		 theDesignBoutiq.click();		 
	 }
	 public void handloomHandicraft()
	 {
		 handloomHandicraft.click();		 
	 }
	 public void sportWear()
	 {
		 sportWear.click();		 
	 }
	 public void WomensFashion()
	 {
		 womensFashion.click();		 
	 }
	 public void amzFashion()
	 {
		 amzFashion.click();		 
	 }
	 public void fashionSalesDeals()
	 {
		 fashionSalesDeals.click();		 
	 }
	 
	 
	
}
