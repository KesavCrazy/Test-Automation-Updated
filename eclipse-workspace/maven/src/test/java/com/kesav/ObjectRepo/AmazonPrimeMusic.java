package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPrimeMusic {
	WebDriver driver;

	 public AmazonPrimeMusic(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
	 WebElement homeMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a")
	 WebElement primeMusic;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[3]/a")
	 WebElement primeMusicSub;
	
	 @FindBy(xpath="//*[@id=\"nav-subnav\"]/a[3]")
	 WebElement musicCdsVinyl;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[1]/ul/div/li[16]/span/a/span")
	 WebElement hardRockMetal;
	
	 @FindBy(xpath="//*[@id=\"low-price\"]")
	 WebElement minPrice;
	 
	 @FindBy(xpath="//*[@id=\"high-price\"]")
	 WebElement maxPrice;
	
	 @FindBy(xpath="//*[@id=\"a-autoid-6\"]/span/input")
	 WebElement go;
	
	 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[1]/div/span/div/div/div[2]/div[1]/div/div/span/a/div/img")
	 WebElement product;
	
	 public WebElement HomeMenu()
	 {
		 return homeMenu;
}
	 public WebElement PrimeMusic()
	 {
		 return primeMusic;
}
	 public WebElement PrimeMusicSub()
	 {
		 return primeMusicSub;
}
	 public WebElement MusicCdsVinyl()
	 {
		 return musicCdsVinyl;
}
	 public WebElement HardRockMetal()
	 {
		 return hardRockMetal;
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
}
