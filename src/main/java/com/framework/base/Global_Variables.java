package com.framework.base;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Global_Variables {

	public WebDriver driver;
	public Properties object;
	public Properties browser;
	public String directory = System.getProperty("user.dir");
	
	
}
