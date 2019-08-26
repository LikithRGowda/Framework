package com.framework.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public Global_Variables gv = new Global_Variables();
	public static ExtentHtmlReporter reporter;
	public static ExtentReports extent;
	public static ExtentTest extenttLogs;
	
	public void propertyFileInt() {
		try {
			gv.browser = new Properties();
			gv.browser.load(new FileInputStream(gv.directory + "\\src\\main\\resources\\browser.properties"));

			gv.object = new Properties();
			gv.object.load(new FileInputStream(gv.directory + "\\src\\main\\resources\\object.properties"));

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}
	}

	public void openBrowser() {
		String browser = gv.browser.getProperty("browser");
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			gv.driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			gv.driver = new FirefoxDriver();

		}

	}

	@BeforeSuite
	public void initialize() {
		propertyFileInt();
	}

	@BeforeMethod
	public void launch() {
		openBrowser();
		gv.driver.manage().window().maximize();
		gv.driver.get(gv.browser.getProperty("url"));
	}

	@AfterMethod
	public void closeApp() {
		gv.driver.close();
	}
}
