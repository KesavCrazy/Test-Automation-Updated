package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class FivefeetApartBooks {
	WebDriver driver;

	 public FivefeetApartBooks(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	 WebElement fiveFeetApart;
	 
	 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	 WebElement eleanerPark;
	 
	 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	 WebElement allTheBrightPlaces;
	 
	 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[5]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")
	 WebElement sunIsAlsoAStar;
	 
	 public void FiveFeetApart()
	 {
		 fiveFeetApart.click();
	 }
	 public void EleanerPark()
	 {
		 eleanerPark.click();		 
	 }
	 public void AllTheBrightPlaces()
	 {
		 allTheBrightPlaces.click();
	 }
	 public void SunIsAlsoAStar()
	 {
		 sunIsAlsoAStar.click(); 
	 }
}
