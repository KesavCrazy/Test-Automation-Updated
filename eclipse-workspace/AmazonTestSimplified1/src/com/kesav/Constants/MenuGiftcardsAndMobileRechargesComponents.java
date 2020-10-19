package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuGiftcardsAndMobileRechargesComponents {
	WebDriver driver;

	 public MenuGiftcardsAndMobileRechargesComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[3]")
	 WebElement allGiftCards;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[4]")
	 WebElement popularGiftCards;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[5]")
	 WebElement giftBoxesTagsGreetingCards;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[6]")
	 WebElement popularBrandedGiftsVoucher;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[7]")
	 WebElement birthdayGiftCards;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[8]")
	 WebElement weddingAnniversary;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[9]")
	 WebElement bestWishesThankyou;

	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[10]")
	 WebElement corporateGiftCards;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[13]")
	 WebElement mobileRecharge;
	 
	 public void allGiftCards()
	 {
		 allGiftCards.click();		 
	 }
	 public void popularGiftCards()
	 {
		 popularGiftCards.click();		 
	 }
	 public void giftBoxesTagsGreetingCards()
	 {
		 giftBoxesTagsGreetingCards.click();		 
	 }
	 
	 public void popularBrandedGiftsVoucher()
	 {
		 popularBrandedGiftsVoucher.click();		 
	 }
	 public void birthdayGiftCards()
	 {
		 birthdayGiftCards.click();		 
	 }
	 public void weddingAnniversary()
	 {
		 weddingAnniversary.click();		 
	 }
		 
	 public void bestWishesThankyou()
	 {
		 bestWishesThankyou.click();		 
	 }
	 public void corporateGiftCards()
	 {
		 corporateGiftCards.click();		 
	 }
	 public void mobileRecharge()
	 {
		 mobileRecharge.click();		 
	 }
	
}
