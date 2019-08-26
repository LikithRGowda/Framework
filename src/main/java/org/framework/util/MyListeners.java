package org.framework.util;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.framework.base.BaseClass;

public class MyListeners extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		ExtentHtmlReports ehr = new ExtentHtmlReports();
		ehr.createExtentReport(result.getMethod().getMethodName());;
		extenttLogs.log(Status.INFO, result.getName() + " is started");
		extent.flush();

	}

	public void onTestSuccess(ITestResult result) {
		extenttLogs.log(Status.PASS, " test pass");
		extent.flush();
	}

	public void onTestFailure(ITestResult result) {
		extenttLogs.log(Status.FAIL, " test fail");
		extent.flush();

	}

	public void onTestSkipped(ITestResult result) {
		extenttLogs.log(Status.SKIP, " test has skipped");
		extent.flush();

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}