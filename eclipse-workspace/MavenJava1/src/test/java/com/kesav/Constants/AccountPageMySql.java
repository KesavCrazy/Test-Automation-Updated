package com.kesav.Constants;


import java.io.IOException;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.kesav.Utility.ExcelSheet;
import com.kesav.Utility.JdbConnection;

public class AccountPageMySql {
	
		WebDriver driver;
		 public String credentialInfo;
		 ExtentTest test;
		 ExtentColor color;
		 public static Logger log = LogManager.getLogger(AccountPageMySql.class.getName());

		 public AccountPageMySql(WebDriver driver, ExtentTest test) {
			 
			 this.driver=driver;
			 this.test=test;
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
			 try
				
			 {
				 tosignInPage.click();
				
				 	test.log(Status.PASS, MarkupHelper.createLabel("tosignInPage : Clicked", color.GREEN));
					log.error("Quantity Clicked");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("tosignInPage : Not Clicked", color.RED));
			    	log.error("tosignInPage Not Clicked");
			    	throw new NoSuchElementException(null);
			}
			 
		 }
	
		 public void ToCreateAccountPage()
		 {

			 try
				
			 {
				 toCreateAccountPage.click();
				
				 	test.log(Status.PASS, MarkupHelper.createLabel("toCreateAccountPage : Clicked", color.GREEN));
					log.error("toCreateAccountPage Clicked");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("toCreateAccountPage : Not Clicked", color.RED));
			    	log.error("toCreateAccountPage Not Clicked");
			    	throw new NoSuchElementException(null);
			}
			 
	}
		 
		
		 public void CreateAccountPageCustomerName() throws SQLException  
		 {
			 try
				
			 {
				 credentialInfo = JdbConnection.getSqlData().get("1");
					customerName.sendKeys(credentialInfo);
				
				 	test.log(Status.PASS, MarkupHelper.createLabel("customerName : Entered", color.GREEN));
					log.error("customerName Entered");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("customerName : Not Entered", color.RED));
			    	log.error("customerName Not Entered");
			    	throw new NoSuchElementException(null);
			}
			 
	}
		 public void CreateAccountPageMobDropDown() throws InterruptedException
		 {
			  mobDropDown.click();
			  Thread.sleep(3000);
			  driver.findElement(By.xpath("/html/body/div[4]/div/div/ul/li[91]/a")).click();
	}
		 public void CreateAccountPageMobNumber() throws SQLException 
		 {
			 try
				
			 {
				 credentialInfo = JdbConnection.getSqlData().get("2");
				  mobNumber.sendKeys(credentialInfo);
				
				 	test.log(Status.PASS, MarkupHelper.createLabel("mobNumber : Entered", color.GREEN));
					log.error("mobNumber Entered");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("mobNumber : Not Entered", color.RED));
			    	log.error("mobNumber Not Entered");
			    	throw new NoSuchElementException(null);
			}
			 
	}
		 public void CreateAccountPageEmail() throws SQLException 
		 {
			 try
				
			 {
				 credentialInfo = JdbConnection.getSqlData().get("3");
				  emailCreateAccountPage.sendKeys(credentialInfo);
				 	test.log(Status.PASS, MarkupHelper.createLabel("email : Entered", color.GREEN));
					log.error("email Entered");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("email : Not Entered", color.RED));
			    	log.error("email Not Entered");
			    	throw new NoSuchElementException(null);
			}
			
	}
		 public void CreateAccountPagePassword() throws SQLException 
		 {
			 try
				
			 {
				 credentialInfo = JdbConnection.getSqlData().get("4");
				  passwordCreateAccountPage.sendKeys(credentialInfo);
				 	test.log(Status.PASS, MarkupHelper.createLabel("password : Entered", color.GREEN));
					log.error("password Entered");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("password : Not Entered", color.RED));
			    	log.error("password Not Entered");
			    	throw new NoSuchElementException(null);
			}
			
	}
		 public void CreateAccountPagecontinue()
		 {
			 try
				
			 {
				 continueCreateAccountPage.click();
				 	test.log(Status.PASS, MarkupHelper.createLabel("Continue : Clicked", color.GREEN));
					log.error("Continue Clicked");	 
			 }
				
			    catch(NoSuchElementException e) {
			    	test.log(Status.FAIL, MarkupHelper.createLabel("Continue : Not Clicked", color.RED));
			    	log.error("Continue Not Clicked");
			    	throw new NoSuchElementException(null);
			}
			  
	}
	}

