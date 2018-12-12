package com_crmpro_login_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com_crmpro_base_class.BaseClassTest;

public class LoginPage extends BaseClassTest {
	//public WebDriver driver;
	//public static String baseUrl = "";
 
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Username']")
	WebElement loc_txtusername;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	WebElement loc_txtpassword;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	WebElement loc_btnLogin;

	@Test
	public void loginToCRMPRO(String username, String password) {
 {
			loc_txtusername.sendKeys(username);
			loc_txtpassword.sendKeys(password);
			loc_btnLogin.click();
		}
		

	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
}
