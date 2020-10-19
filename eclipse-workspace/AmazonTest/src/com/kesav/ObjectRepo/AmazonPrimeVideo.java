package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPrimeVideo {
	WebDriver driver;

	 public AmazonPrimeVideo(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"navSwmHoliday\"]/a")
	 WebElement joinPrime;
	 
	 @FindBy(xpath="//*[@id=\"pv-nav-locales\"]/label/span")
	 WebElement languageIcon;
	 
	 @FindBy(xpath="//*[@id=\"pv-nav-locales\"]/ul/ol/li[4]/form/input[4]")
	 WebElement englishlanguage;
	
	 @FindBy(xpath="//*[@id=\"dv-action-box\"]/div/div/div/div[2]/div/span[1]/a/span[2]/span")
	 WebElement watch;
	 
	 @FindBy(xpath="//*[@id=\"dv-web-player\"]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div[1]/div[3]/div")
	 WebElement pause;
	
	 @FindBy(xpath="//*[@id=\"dv-web-player\"]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/span/div[1]/div[1]/img")
	 WebElement subTitles;
	 
	 @FindBy(xpath="//*[@id=\"dv-web-player\"]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[1]/span/div[2]/div[1]/div/div/div/div[1]/div[2]/div/div/div/div/div[2]")
	 WebElement subTitlesOn;
	
	 @FindBy(xpath="//*[@id=\"dv-web-player\"]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/span/div[1]/div[1]/img")
	 WebElement qualitySettings;
	
	 @FindBy(xpath="//*[@id=\"dv-web-player\"]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[1]/div[2]/span/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/div[2]/div[1]")
	 WebElement goodQuality;
	 
	 @FindBy(xpath="//*[@id=\"dv-web-player\"]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[1]/img")
	 WebElement fullScreen;
	
	 @FindBy(xpath="//*[@id=\"dv-web-player\"]/div/div[1]/div/div/div[2]/div/div/div/div[2]/div[1]/div[4]/div[1]/div[2]/div[2]/div/div[2]/div/div[2]/div[1]/img")
	 WebElement close;
	
	
	 public WebElement JoinPrime()
	 {
		 return joinPrime;
}
	 public WebElement LanguageIcon()
	 {
		 return languageIcon;
}
	 public WebElement Englishlanguage()
	 {
		 return englishlanguage;
}
	 public WebElement Watch()
	 {
		 return watch;
}
	 public WebElement Pause()
	 {
		 return pause;
}
	 public WebElement SubTitles()
	 {
		 return subTitles;
}
	 public WebElement SubTitlesOn()
	 {
		 return subTitlesOn;
}
	 public WebElement QualitySettings()
	 {
		 return qualitySettings;
}
	 public WebElement GoodQuality()
	 {
		 return goodQuality;
}
	 public WebElement FullScreen()
	 {
		 return fullScreen;
}
	 public WebElement Close()
	 {
		 return close;
}
}