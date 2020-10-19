package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePageBabyProducts {

	WebDriver driver;

	 public AmazonHomePageBabyProducts(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]")
	 WebElement menu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[15]/a/div")
	 WebElement toysBabyProducts;
	 				
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[14]/li[4]/a")
	 WebElement babyProducts;
	 				
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[9]/div/li[1]/span/a/i")
	 WebElement starRatings;
	 
	 @FindBy(xpath="//*[@id=\"low-price\"]")
	 WebElement minPrice;
	 
	 @FindBy(xpath="//*[@id=\"high-price\"]")
	 WebElement maxPrice;
	                
	 @FindBy(xpath="//*[@id=\"a-autoid-1\"]/span/input")
	 WebElement go;
	 
	 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/span/a/div/img")
	 WebElement product;
	
	 @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	 WebElement addToCart;
	
	
	 public WebElement Menu()
	 {
		 return menu;
}
	 public WebElement ToysBabyProducts()
	 {
		 return toysBabyProducts;
}
	 public WebElement BabyProducts()
	 {
		 return babyProducts;
}
	 public WebElement StarRatings()
	 {
		 return starRatings;
}
	 public WebElement MinPrice()
{
	 return minPrice;
}
	 public WebElement MaxPrice()
{
	 return maxPrice;
}
	 public WebElement Go()
	 {
		 return go;
}
	 public WebElement Product()
	 {
		 return product;
}
	 public WebElement AddToCart()
	 {
		 return addToCart;
}
	 
	 
}
