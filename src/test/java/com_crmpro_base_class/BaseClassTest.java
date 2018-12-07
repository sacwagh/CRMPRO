package com_crmpro_base_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseClassTest {
	public static WebDriver driver;
	public static String baseUrl="";
	
  @BeforeSuite
  public void setUpTheApplication() {
	  Reporter.log("================= Chrome Browser started.=============== ", true);
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  baseUrl="https://www.freecrm.com/index.html";
	  driver.get(baseUrl);
	  Reporter.log("==================Application started====================", true);
  }
  
  @AfterSuite
  public void tearDown() {
	  driver.quit();
	  Reporter.log("==================Application Ended====================", true);
  }
  
}
