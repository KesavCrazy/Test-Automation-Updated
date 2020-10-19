package com.kesav.ObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomeCareer {
	WebDriver driver;

	 public AmazonHomeCareer(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
	 @FindBy(xpath="//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[2]/a")
	 WebElement career;
	 
	 @FindBy(xpath="//*[@id=\"search-button\"]/span")
	 WebElement search;
	
	 @FindBy(xpath="//*[@id=\"main-content\"]/div[4]/div/div/div[2]/content/div/div/div[1]/div/div[4]/div/div/fieldset/div/button[1]/p")
	 WebElement fullTime;
	
	 @FindBy(xpath="//*[@id=\"main-content\"]/div[4]/div/div/div[2]/content/div/div/div[1]/div/div[5]/div/div/fieldset/div/button[12]")
	 WebElement jobCategory;
	 
	 @FindBy(xpath="//*[@id=\"main-content\"]/div[4]/div/div/div[2]/content/div/div/div[1]/div/div[6]/div/div/fieldset/div/button[2]/p")
	 WebElement bengaluru;
	 
	 @FindBy(xpath="//*[@id=\"main-content\"]/div[4]/div/div/div[2]/content/div/div/div[1]/div/div[6]/div/div/fieldset/div/button[13]/p")
	 WebElement chennai;
	 
	 @FindBy(xpath="//*[@id=\"main-content\"]/div[4]/div/div/div[2]/content/div/div/div[1]/div/div[7]/div/div/fieldset/div/button[4]/p")
	 WebElement financeGlobalBusiness;
	
	 public WebElement Career()
	 {
		 return career;
}
	 public WebElement Search()
	 {
		 return search;
}
	 public WebElement FullTime()
	 {
		 return fullTime;
}
	 public WebElement JobCategory()
	 {
		 return jobCategory;
}
	 public WebElement Bengaluru()
{
	 return bengaluru;
}
	 public WebElement Chennai()
	 {
	 	 return chennai;
	 }	 
	 public WebElement FinanceGlobalBusiness()
{
	 return financeGlobalBusiness;
}
	
	 
}
