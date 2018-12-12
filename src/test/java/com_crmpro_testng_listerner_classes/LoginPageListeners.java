
package com_crmpro_testng_listerner_classes;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com_crmpro_base_class.BaseClassTest;
import com_crmpro_utility.ScreenShotTest;

public class LoginPageListeners extends BaseClassTest implements ITestListener {

	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		String methodName = result.getName();
		if (!result.isSuccess()) {
			ScreenShotTest.takeScreenShot(methodName, driver);
		}
	}

	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub

	}

	public void onTestSuccess(ITestResult result) {
		
	}
}
