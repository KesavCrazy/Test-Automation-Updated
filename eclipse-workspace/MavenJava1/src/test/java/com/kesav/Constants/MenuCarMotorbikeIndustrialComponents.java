package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class MenuCarMotorbikeIndustrialComponents {
	WebDriver driver;

	 public MenuCarMotorbikeIndustrialComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[3]")
	 WebElement motorBikeAccessoParts;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[4]")
	 WebElement carAccesso;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[5]")
	 WebElement carElectronics;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[6]")
	 WebElement carParts;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[7]")
	 WebElement carBikeCare;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[8]")
	 WebElement allCarMotorbikesProducts;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[11]")
	 WebElement industrialScientificSupplies;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[12]")
	 WebElement testMeasureInspect;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[13]")
	 WebElement labScientific;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[16]/li[14]")
	 WebElement janitorialSanitationSupplies;
	 
	 public void motorBikeAccessoParts()
	 {
		 motorBikeAccessoParts.click();		 
	 }
	 public void carAccesso()
	 {
		 carAccesso.click();		 
	 }
	 public void carElectronics()
	 {
		 carElectronics.click();		 
	 }
	 
	 public void carParts()
	 {
		 carParts.click();		 
	 }
	 public void carBikeCare()
	 {
		 carBikeCare.click();		 
	 }
	 public void allCarMotorbikesProducts()
	 {
		 allCarMotorbikesProducts.click();		 
	 }
		 
	 public void industrialScientificSupplies()
	 {
		 industrialScientificSupplies.click();		 
	 }
	 public void testMeasureInspect()
	 {
		 testMeasureInspect.click();		 
	 }
	 public void labScientific()
	 {
		 labScientific.click();		 
	 }
	 public void janitorialSanitationSupplies()
	 {
		 janitorialSanitationSupplies.click();		 
	 }
	
}
