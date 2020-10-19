package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomeMenu {
	WebDriver driver;

	 public AmazonHomeMenu(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[1]/a/i")
	 WebElement amazonMenu;
	 
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/ul[1]/li[2]/a")
	 WebElement echoAlexa;
	
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/ul[2]/li[3]/a")
	 WebElement echoDot;
	
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/ul[2]/li[4]/a")
	 WebElement allNewAmzEcho;
	 
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/ul[2]/li[8]/a")
	 WebElement echoShow5;
	 
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/ul[2]/li[13]/a")
	 WebElement meetAlexa;
	 
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/ul[2]/li[16]/a")
	 WebElement alexaSmartHome;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[2]/li[17]/a")
	 WebElement alexaPrimeMusic;
	 
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/ul[2]/li[1]/a/div")
	 WebElement echoAlexaMainMenu;
	 
	
	 public WebElement AmazonMenu()
	 {
		 return amazonMenu;
}
	 public WebElement EchoAlexa()
	 {
		 return echoAlexa;
}
	 public WebElement EchoDot()
	 {
		 return echoDot;
}
	 public WebElement AllNewAmzEcho()
	 {
		 return allNewAmzEcho;
}
	 public WebElement MeetAlexa()
{
	 return meetAlexa;
}
	 public WebElement AlexaSmartHome()
{
	 return alexaSmartHome;
}
	 public WebElement echoShow5()
{
	 return echoShow5;
}
	 public WebElement AlexaPrimeMusic()
{
	 return alexaPrimeMusic;
}
	 public WebElement EchoAlexaMainMenu()
{
	 return echoAlexaMainMenu;
}
	 
}
