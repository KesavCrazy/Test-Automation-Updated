package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class MenuKindleEReaderEBookComponents {
	WebDriver driver;

	 public MenuKindleEReaderEBookComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[3]")
	 WebElement allNewKindle;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[4]")
	 WebElement allNewKindlePaperWhite;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[5]")
	 WebElement kindlePaperWhiteStarterPack;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[6]")
	 WebElement allNewKindleOasis;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[7]")
	 WebElement refurbishedOpenBox;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[8]")
	 WebElement kindleEReaderAccessories;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[9]")
	 WebElement seeAllKindleEReader;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[12]")
	 WebElement allKindleEBook;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[13]")
	 WebElement primeReading;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[14]")
	 WebElement kindleUnlimited;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[15]")
	 WebElement dealsOnKindleEBook;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[16]")
	 WebElement kindleExamCentral;
	 
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/ul[4]/li[17]")
	 WebElement kindleETextBooks;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[18]")
	 WebElement eBookBestSellers;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[19]")
	 WebElement eBookInIndianLanguage;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[20]")
	 WebElement hindi;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[4]/li[21]")
	 WebElement tamil;
	 
	 public void allNewKindle()
	 {
		 allNewKindle.click();		 
	 }
	 public void AllNewKindlePaperWhite()
	 {
		 allNewKindlePaperWhite.click();		 
	 }
	 public void KindlePaperWhiteStarterPack()
	 {
		 kindlePaperWhiteStarterPack.click();		 
	 }
	 
	 public void AllNewKindleOasis()
	 {
		 allNewKindleOasis.click();		 
	 }
	 public void refurbishedOpenBox()
	 {
		 refurbishedOpenBox.click();		 
	 }
	 public void kindleEReaderAccessories()
	 {
		 kindleEReaderAccessories.click();		 
	 }
	 public void seeAllKindleEReader()
	 {
		 seeAllKindleEReader.click();		 
	 }
	 public void allKindleEBook()
	 {
		 allKindleEBook.click();		 
	 }
	 public void primeReading()
	 {
		 primeReading.click();		 
	 }
	 public void kindleUnlimited()
	 {
		 kindleUnlimited.click();		 
	 }
	 public void dealsOnKindleEBook()
	 {
		 dealsOnKindleEBook.click();		 
	 }
	 public void kindleExamCentral()
	 {
		 kindleExamCentral.click();		 
	 }
	 public void kindleETextBooks()
	 {
		 kindleETextBooks.click();		 
	 }
	 public void eBookBestSellers()
	 {
		 eBookBestSellers.click();		 
	 }
	 public void eBookInIndianLanguage()
	 {
		 eBookInIndianLanguage.click();		 
	 }
	 public void Hindi()
	 {
		 hindi.click();		 
	 }
	 public void Tamil()
	 {
		 tamil.click();		 
	 }
	 
}
