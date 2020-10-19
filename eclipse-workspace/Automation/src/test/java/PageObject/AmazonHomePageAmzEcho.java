package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonHomePageAmzEcho {

	 public WebDriver driver;

	 public AmazonHomePageAmzEcho(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//a[@id='nav-hamburger-menu']")
	 WebElement menu;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[1]/li[2]/a")
	 WebElement echoAlexa;
	 
	 @FindBy(xpath="//a[contains(text(),'Echo Dot (3rd Gen)')]")
	 WebElement echoDot;
	 				
	 @FindBy(xpath="//select[@id='quantity']")
	 WebElement quantity;
	 				
	 @FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	 WebElement addToCart;
	     
	 public void menu()
	 {
		 menu.click();
	 }
	 public void Echodot()
	 {
		  echoDot.click();
}
	 public void echoAlexa()
	 {
		  echoAlexa.click();
}
	 public void quantity()
	 {
		  new Select(quantity).selectByVisibleText("3");	
}

	 public void AddToCart()
	 {
		  addToCart.click();
	 }  
}
