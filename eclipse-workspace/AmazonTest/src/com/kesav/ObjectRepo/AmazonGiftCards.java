package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonGiftCards {
	WebDriver driver;

		 public AmazonGiftCards(WebDriver driver) {
			 
			 this.driver=driver;
			 PageFactory.initElements(driver, this);
		 }
		 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
		 WebElement homeMenu;
		 
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[20]/a")
		 WebElement giftCards;
		
		 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[19]/li[6]/a")
		 WebElement popularBrandGifts;
		
		 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[3]/div/li[6]/span/span/div/label/input")
		 WebElement valentineday;
		
		 @FindBy(xpath="//*[@id=\"p_n_theme_browse-bin/4036880031\"]/span/a/div/label/i")
		 WebElement fashionAccess;
		 
		 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[9]/div/span/div/div/span/a/div/img")
		 WebElement levisGiftCard;
		
		 @FindBy(xpath="//*[@id=\"quantity\"]")
		 WebElement quantity;
		
		 @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
		 WebElement addToCart;
	
		 public WebElement HomeMenu()
		 {
			 return homeMenu;
	}
		 public WebElement GiftCards()
		 {
			 return giftCards;
	}
		 public WebElement PopularBrandGifts()
		 {
			 return popularBrandGifts;
	}
		 public WebElement Valentineday()
		 {
			 return valentineday;
	}
		 public WebElement FashionAccess()
		 {
			 return fashionAccess;
	}
		 public WebElement LevisGiftCard()
		 {
			 return levisGiftCard;
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
