package PageObject;

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
	 
	 @FindBy(xpath="//ol[@class='dv-col']//input[@class='pv-highlighted pv-ticked']")
	 WebElement englishlanguage;
	 
	 @FindBy(xpath=" //div[@id='73305e7a-85ab-459a-8e03-8f81bc215463']//span[@class='dv-overlay']")
	 WebElement startFreeTrial;
	
	
	
	 public void JoinPrime()
	 {
		  joinPrime.click();
}
	 public void LanguageIcon()
	 {
		  languageIcon.click();
}
	 public void Englishlanguage()
	 {
		  englishlanguage.click();
}
	 public void StartFreeTrial()
	 {
		 startFreeTrial.click();
}

}
