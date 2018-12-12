package com_crmpro_utility;

import java.io.File;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import com_crmpro_base_class.BaseClassTest;

public class ScreenShotTest extends BaseClassTest {

	// static String filePath =
	// "E:\\\\CleverFoot.com\\\\Selenium_Pratice\\\\CRMPRO\\\\FailedTestcasesScreenshot\\\\";

	public static int takeScreenShot(String methodName, WebDriver driver) {
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			String reportDirectory = new File(System.getProperty("user.dir")).getAbsolutePath()
					+ "/target/surefire-reports";
			File destFile = new File((String) reportDirectory + "/failure_screenshots/" + methodName + "_"
					+ formater.format(calendar.getTime()) + ".png");
			FileUtils.copyFile(scrFile, destFile);
			Reporter.log("<a href='" + destFile.getAbsolutePath() + "'> <img src='" + destFile.getAbsolutePath()
					+ "' height='100' width='100'/> </a>");
		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println("While error occur to take screenshot");
		}
		return 0;

	}

}
