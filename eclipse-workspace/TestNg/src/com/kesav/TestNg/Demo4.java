package com.kesav.TestNg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {
	@Parameters({ "URL"})
	@Test
	public void WebLoginCarHome(String urlName)
	{
		//Selenium
		System.out.println("WebLoginCarHome");
		System.out.println(urlName);
		
	}
	@Test
	public void MobileLoginCarHome()
	{
		//Appium
		System.out.println("MobLoginCarHome");
	}
	@BeforeMethod
	public void Bfmethod()
	{
		System.out.println("I'm the 1st method in Demo4");
	}
	@Test(groups = ("Smoke"))
	public void LoginApiCarHome()
	{
		//Rest API Automation
		System.out.println("LogInApiCarHome");
	}
	}
