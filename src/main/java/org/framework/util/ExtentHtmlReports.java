package org.framework.util;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.framework.base.BaseClass;

public class ExtentHtmlReports extends BaseClass {

	public void createExtentReport(String testName) {
		System.out.println(testName);
		reporter=new ExtentHtmlReporter(gv.directory+"\\Reports\\"+testName+".html");
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extenttLogs=extent.createTest(testName);
	}
}
