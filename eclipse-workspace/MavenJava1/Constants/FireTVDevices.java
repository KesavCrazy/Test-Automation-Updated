package com.kesav.Constants;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.TestCases.BaseTest;

public class FireTVDevices {
	WebDriver driver;

	 public FireTVDevices(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"result_0\"]/div/div[2]/div/div[2]/div[1]/div[1]/a/h2")
	 WebElement fireTvStreaming;
	 
	 @FindBy(xpath="//*[@id=\"result_1\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")
	 WebElement fireTvStick4K;
	 
	 @FindBy(xpath="//*[@id=\"result_2\"]/div/div/div/div[2]/div[1]/div[1]/a/h2")
	 WebElement fireTvVoiceRemote;

	 public void fireTvStreaming()
	 {
		 fireTvStreaming.click();		 
	 }
	 public void FireTvStick4K()
	 {
		 fireTvStick4K.click();		 
	 }
	 public void fireTvVoiceRemote()
	 {
		 fireTvVoiceRemote.click();		 
	 }
}
