package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonMovieMusicVideoGames {
	WebDriver driver;

		 public AmazonMovieMusicVideoGames(WebDriver driver) {
			 
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		 }
		 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
		 WebElement homeMenu;
		 
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[19]/a/div")
		 WebElement movieMusicVideoGames;
		
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[18]/li[3]/a")
		 WebElement allMovies;
		
		 @FindBy(xpath="/html/body/div[2]/div[4]/div/div[1]/div/div[1]/div[5]/div/div/div/div/div[2]/div/ol/li[4]/div/div[1]/a/img")
		 WebElement hotelTransylvania2;
		
		 @FindBy(xpath="//*[@id=\"quantity\"]")
		 WebElement quantity;
		
		 @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
		 WebElement addToCart;
	
		 public WebElement HomeMenu()
		 {
			 return homeMenu;
	}
		 public WebElement MovieMusicVideoGames()
		 {
			 return movieMusicVideoGames;
	}
		 public WebElement AllMovies()
		 {
			 return allMovies;
	}
		 public WebElement hotelTransylvania2()
		 {
			 return hotelTransylvania2;
	}
		 public WebElement Quantity()
		 {
			 return quantity;
	}
		 public WebElement AddToCart()
		 {
			 return addToCart;
	}
}
