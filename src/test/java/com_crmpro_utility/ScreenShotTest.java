package com_crmpro_utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com_crmpro_base_class.BaseClassTest;

public class ScreenShotTest extends BaseClassTest {
	static String FilePath = "";

	public void captureScreenshot(WebDriver driver, String name) throws Exception {
		FilePath = "E:\\\\\\\\CleverFoot.com\\\\\\\\Selenium_Pratice\\\\\\\\CRMPRO\\\\\\\\FailedTestcasesScreenshot\\\\a.jpg";
		Screenshot(driver, FilePath);

	}

	public static void Screenshot(WebDriver driver,String MethodName) throws IOException {

		// convert driver object to take screenshot
		TakesScreenshot screenshot = ((TakesScreenshot) driver);

		// call getScreenshotAs Method to take screenshot
		File srcLocation = screenshot.getScreenshotAs(OutputType.FILE);

		// move file image to new destination
		File destLocation = new File(FilePath+MethodName+".png");

		// copy file at destination
		FileUtils.copyFile(srcLocation, destLocation);
	}
}
