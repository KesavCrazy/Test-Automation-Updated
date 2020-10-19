package com.kesav.TestNg;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 {
@Test(groups = ("Smoke"))
public void ploan()
{
	System.out.println("Good");
}
@BeforeTest
public void Prerequiste() {
	System.out.println("I will execute 1st");
}
}
