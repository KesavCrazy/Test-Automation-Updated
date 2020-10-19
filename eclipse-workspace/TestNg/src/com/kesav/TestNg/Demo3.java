package com.kesav.TestNg;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo3 {
	@AfterClass
	public void AfClass()
	{
		System.out.println("Print after Demo3 Class");
	}
	@Parameters({"URL","APIKey/username"})
	@Test
	public void WebLoginCarLoan(String urlName, String key)
	{
		//Selenium
		System.out.println("WebLoginCarLoan");
		System.out.println(urlName);
		System.out.println(key);
		
	}
	@Test(enabled=false)
	public void MobileLoginCarLoan()
	{
		//Appium
		System.out.println("MobLoginCarLoan");
	}
	@Test(groups = ("Smoke"))
	public void MobileSigninCarLoan()
	{
		//Appium
		System.out.println("MobLoginCarLoan1");
	}	
	@Test(dataProvider="getData")
	public void MobileSignUpCarLoan(String username, String password)
	{
		//Appium
		System.out.println("MobLoginCarLoan2");
		System.out.println(username);
		System.out.println(password);
	}
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I'm no.1");
	}
//	@Test(dependsOnMethods= {"WebLoginCarLoan"})
//	public void LoginApiCarLoan()
//	{
//		//Rest API Automation
//		System.out.println("LogInApiCarLoan");
//	}
	@BeforeClass
	public void BfClass()
	{
	System.out.println("print before Demo3 class");	
	}
	@DataProvider
	public Object[][] getData()
	{
		//1st combination - userName and password - good credit history
		//2nd combination - userName and password - no credit history
		//3rd combination - fraud credit history
		Object[][] data = new Object[3][2];
		data [0][0] = "first set username";
		data [0][1] = "password";
		//2nd combination
		data [1][0] = "second set username";
		data [1][1] = "passsword";
		//3rd combination
		data [2][0] = "third set username";
		data [2][1] = "password"; 
		return data;
	}
	}
