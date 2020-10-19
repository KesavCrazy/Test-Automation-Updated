package ConstantsCucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonSignPage {
	 WebDriver driver;

	 public AmazonSignPage(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"nav-link-accountList\"]/div/span")
	 WebElement tosignInPage;
	
	 @FindBy(xpath="//*[@id=\"ap_email\"]")
	 WebElement email;
	 
	 @FindBy(xpath="//*[@id=\"continue\"]")
	 WebElement toContinue;
	
	 @FindBy(xpath="//*[@id=\"ap_password\"]")
	 WebElement password;
	
	 @FindBy(xpath="//*[@id=\"signInSubmit\"]")
	 WebElement login;
	
	 @FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/div/a[1]")
	 WebElement conditionPage;

	 @FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/div/a[2]")
	 WebElement noticePage;
	 
	 
	 public WebElement TosignInPage()
	 {
		 return tosignInPage;
}
	 public WebElement EmailId()
	 {
		 return email;
}
	 public WebElement ToContinue()
	 {
		 return toContinue;
}
	 public WebElement Password()
	 {
		 return password;
}
	 public WebElement Login()
	 {
		 return login;
}
	 public WebElement ConditionPage()
	 {
		 return conditionPage;
}
	 public WebElement NoticePage()
	 {
		 return noticePage;
}
}
