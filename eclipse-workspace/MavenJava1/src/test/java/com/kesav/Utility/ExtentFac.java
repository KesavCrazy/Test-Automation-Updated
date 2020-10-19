package com.kesav.Utility;

import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class ExtentFac {
	public static ExtentReports getInstance() {
		
	ExtentReports extent;
	ExtentHtmlReporter reporter;
	
	
	 String path =System.getProperty("user.dir")+"\\reports\\index.html";
	
	 reporter = new ExtentHtmlReporter(path);
	 reporter.setAppendExisting(true);
	

	reporter.config().setReportName("Web Automation Results");

	reporter.config().setDocumentTitle("Test Results");

	extent = new ExtentReports();

	extent.attachReporter(reporter);

	
	extent.setSystemInfo("Elavarasi", "Reporting Manager");
	extent.setSystemInfo("Kesav", "Tester");
	extent.setSystemInfo("OS", "Windows");
	
	return extent;
	
}
}
