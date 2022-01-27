package com.Vtiger.genericUtil;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplimentations implements ITestListener
{
	ExtentHtmlReporter reporter;
	ExtentReports reports;
	ExtentTest test;
	
	public void onTestStart(ITestResult result) {
		test=reports.createTest(result.getMethod().getMethodName());

	}

	public void onTestSuccess(ITestResult result) {
	System.out.println(result.getMethod().getMethodName()+""+"test passed");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getMethod().getMethodName()+""+"test failed");
		test.log(Status.FAIL, result.getMethod().getMethodName()+" test got Failed");
		test.log(Status.FAIL, result.getThrowable());
			try {
				//BaseClass.takescreenshot(result.getMethod().getMethodName());
				String path=BaseClass.takescreenshot(result.getMethod().getMethodName());
				test.addScreenCaptureFromPath(path);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	
	}

	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName()+" test got skipped");
		

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
	;
	}

	public void onStart(ITestContext context) {
		reporter= new ExtentHtmlReporter("./ExtentReports/SDET3.html");

		reporter.config().setDocumentTitle("VTiger");
		reporter.config().setTheme(Theme.STANDARD);

		reports = new ExtentReports();
		reports.attachReporter(reporter);

		reports.setSystemInfo("Name of App", "Vtiger");
		reports.setSystemInfo("NAme of Test Engg", "TYSS");
		reports.setSystemInfo("Build No", "4.1.2");

	}

	public void onFinish(ITestContext context) {
		
	}

}
