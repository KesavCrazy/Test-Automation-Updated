package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class MenuAmazonPrimeMusicComponents {
	WebDriver driver;

	 public MenuAmazonPrimeMusicComponents(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[3]")
	 WebElement amazonPrimeMusic;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[4]")
	 WebElement openWebPlayer;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[5]")
	 WebElement voiceControlledWithAlexa;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[6]")
	 WebElement amazonPrimeMusicApps;
	 
	 @FindBy(xpath="//*[@id=\"hmenu-content\"]/ul[7]/li[7]")
	 WebElement cdsandVinyls;

	 public void AmazonPrimeMusic()
	 {
		 amazonPrimeMusic.click();		 
	 }
	 public void OpenWebPlayer()
	 {
		 openWebPlayer.click();		 
	 }
	 public void VoiceControlledWithAlexa()
	 {
		 voiceControlledWithAlexa.click();		 
	 }
	 
	 public void AmazonPrimeMusicApps()
	 {
		 amazonPrimeMusicApps.click();		 
	 }
	 public void CdsandVinyls()
	 {
		 cdsandVinyls.click();		 
	 }
		 
}
