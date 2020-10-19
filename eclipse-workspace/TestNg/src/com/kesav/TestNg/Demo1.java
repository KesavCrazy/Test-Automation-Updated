package com.kesav.TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo1 {

	@AfterTest
	public void LastExecution()
	{
	System.out.println("Last");
	}
	public void Demo() {
		
		System.out.println("Hello");
	}
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I'm Last");
	}
	@Test 
	public void SecondTest()
{
		System.out.println("Bye");
}
}
