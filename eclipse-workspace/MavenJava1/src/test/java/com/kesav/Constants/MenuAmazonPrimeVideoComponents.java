package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.BaseTest;

public class MenuAmazonPrimeVideoComponents {
	WebDriver driver;

	 public MenuAmazonPrimeVideoComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[6]/li[3]")
	 WebElement allVideos;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[6]/li[4]")
	 WebElement movies;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[6]/li[5]")
	 WebElement tvShows;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[6]/li[6]")
	 WebElement kidsShows;

	 public void AllVideos()
	 {
		 allVideos.click();		 
	 }
	 public void Movies()
	 {
		 movies.click();		 
	 }
	 public void TvShows()
	 {
		 tvShows.click();		 
	 }
	 
	 public void KidsShows()
	 {
		 kidsShows.click();		 
	 }
		 
}
