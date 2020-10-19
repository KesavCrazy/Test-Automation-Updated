package com.kesav.ObjectRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;

public class AmazonCreateAccountDataProviderPageExcel {
	WebDriver driver;

	 public AmazonCreateAccountDataProviderPageExcel(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver, this);

	 }
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
		 
	
	 public WebElement ToCreateAccountPage()
	 {
		 return toCreateAccountPage;
}
	
	 public WebElement CreateAccountPageCustomerName()
	 {
		 return customerName;
}
	 public WebElement CreateAccountPageMobDropDown()
	 {
		 return mobDropDown;
}
	 public WebElement CreateAccountPageMobNumber()
	 {
		 return mobNumber;
}
	 public WebElement CreateAccountPageEmail()
	 {
		 return emailCreateAccountPage;
}
	 public WebElement CreateAccountPagePassword()
	 {
		 return passwordCreateAccountPage;
}
	 public WebElement CreateAccountPagecontinue()
	 {
		 return continueCreateAccountPage;
}
	 @DataProvider
	 public static Object[][] getData() throws IOException {
			 FileInputStream files = new FileInputStream("C:\\Users\\Admin\\Desktop\\ScreenShot\\Excel\\book1.xlsx");
			 XSSFWorkbook workbook = new XSSFWorkbook(files);
			 XSSFSheet sheet = workbook.getSheetAt(0);
			 Row row = sheet.getRow(0);
			 Cell cell = row.getCell(0);
			 
			 String var = String.valueOf(sheet.getRow(0).getCell(0));
			 String var1 = String.valueOf(sheet.getRow(1).getCell(0).getNumericCellValue());
			 String var2 = String.valueOf(sheet.getRow(2).getCell(0));
			 String var3 = String.valueOf(sheet.getRow(3).getCell(0));
			 
			 Object[][] data = new Object[1][4];
			 
			 data[0][0] = var;
			 data[0][1] = var1;
			 data[0][2] = var2;
			 data[0][3] = var3;
			
			 return data;
	 }
}