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
	WebElement _txtusername;

	@FindBy(how = How.XPATH, using = "//input[@placeholder='Password']")
	WebElement _txtpassword;

	@FindBy(how = How.XPATH, using = "//input[@type='submit']")
	WebElement _btnLogin;

	@Test
	public void loginToCRMPRO(String username, String password) {
 {
			_txtusername.sendKeys(username);
			_txtpassword.sendKeys(password);
			_btnLogin.click();
		}
		

	}

	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
}
