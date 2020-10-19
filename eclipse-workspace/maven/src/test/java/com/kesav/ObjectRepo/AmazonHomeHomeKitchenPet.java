package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomeHomeKitchenPet {
	WebDriver driver;

	 public AmazonHomeHomeKitchenPet(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/i")
	 WebElement amazonMenu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[13]/a")
	 WebElement homekitchenPet;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[1]/a")
	 WebElement mainMenu;
	
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[12]/li[10]/a")
	 WebElement gardenOutdoor;
	 
	 @FindBy(xpath="//*[@id=\"a-page\"]/div[4]/div/div[2]/div/div[1]/div[1]/ul[1]/li[3]/a")
	 WebElement indoorPlants;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[1]/ul/div/li[3]/span/a/span")
	 WebElement cactiSucculent;
	 
	 @FindBy(xpath="//*[@id=\"leftNav\"]/ul[4]/div/li[1]/span/span/div/label/input")
	 WebElement ugaooCheckBox;
	 
	 @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/h2/a")
	 WebElement crassulaProduct;
	 
	 @FindBy(xpath="//*[@id=\"low-price\"]")
	 WebElement minPrice;
	 
	 @FindBy(xpath="//*[@id=\"high-price\"]")
	 WebElement maxPrice;
	 
	 @FindBy(xpath="//*[@id=\"a-autoid-1\"]/span/input")
	 WebElement submit;
	
	
	 public WebElement AmazonMenu()
	 {
		 return amazonMenu;
}
	 public WebElement HomekitchenPet()
	 {
		 return homekitchenPet;
}
	 public WebElement MainMenu()
	 {
		 return mainMenu;
}
	 public WebElement GardenOutdoor()
	 {
		 return gardenOutdoor;
}
	 public WebElement IndoorPlants()
{
	 return indoorPlants;
}
	 public WebElement CactiSucculent()
{
	 return cactiSucculent;
}
	 public WebElement UgaooCheckBox()
{
	 return ugaooCheckBox;
}
	 public WebElement CrassulaProduct()
{
	 return crassulaProduct;
}	 
	 public WebElement MinPrice()
	 {
	 	 return minPrice;
	 }
	 public WebElement MaxPrice()
	 {
	 	 return maxPrice;
	 }
	 public WebElement Submit()
	 {
	 	 return submit;
	 }
}
