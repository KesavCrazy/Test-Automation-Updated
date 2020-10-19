package com.kesav.Constants;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.kesav.Utility.ExcelSheet;

public class AccountPage {
	
		WebDriver driver;
		 public String credentialInfo;

		 public AccountPage(WebDriver driver) {
			 
			 this.driver=driver;
			 PageFactory.initElements(driver, this);

		 }
		 @FindBy(xpath="//*[@id=\"nav-link-accountList\"]/div/span")
		 WebElement tosignInPage;
		 
		 @FindBy(xpath="//*[@id=\"createAccountSubmit\"]")
		 WebElement toCreateAccountPage;
		 
		 @FindBy(xpath="//*[@id=\"ap_customer_name\"]")
		 WebElement customerName;
		
		 @FindBy(xpath="//*[@id=\"auth-country-picker-container\"]/span/span/span")
		 WebElement mobDropDown;
		 
		 @FindBy(xpath="//*[@id=\"ap_phone_number\"]")
		 WebElement mobNumber;
		 
		 @FindBy(xpath="//*[@id=\"ap_email\"]")
		 WebElement emailCreateAccountPage;
		 
		 @FindBy(xpath="//*[@id=\"ap_password\"]")
		 WebElement passwordCreateAccountPage;
		 
		 @FindBy(xpath="//*[@id=\"continue\"]")
		 WebElement continueCreateAccountPage;
			 
		 public void tosignInPage()
		 {
			 tosignInPage.click();
		 }
	
		 public void ToCreateAccountPage()
		 {
			  toCreateAccountPage.click();
	}
		 
		
		 public void CreateAccountPageCustomerName()throws IOException 
		 {
			 credentialInfo = ExcelSheet.getData().get("1");
			customerName.sendKeys(credentialInfo);
	}
		 public void CreateAccountPageMobDropDown() throws InterruptedException
		 {
			  mobDropDown.click();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[91]/a")).click();
	}
		 public void CreateAccountPageMobNumber() throws IOException
		 {
			 credentialInfo = ExcelSheet.getData().get("2");
			  mobNumber.sendKeys(credentialInfo);
	}
		 public void CreateAccountPageEmail() throws IOException
		 {
			 credentialInfo = ExcelSheet.getData().get("3");
			  emailCreateAccountPage.sendKeys(credentialInfo);
	}
		 public void CreateAccountPagePassword() throws IOException
		 {
			 credentialInfo = ExcelSheet.getData().get("4");
			  passwordCreateAccountPage.sendKeys(credentialInfo);
	}
		 public void CreateAccountPagecontinue()
		 {
			  continueCreateAccountPage.click();
	}
	}
