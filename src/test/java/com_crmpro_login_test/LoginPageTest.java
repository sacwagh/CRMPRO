package com_crmpro_login_test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com_crmpro_base_class.BaseClassTest;
import com_crmpro_login_page.LoginPage;


public class LoginPageTest extends BaseClassTest {
	@Test(description = "TO check valid username and password to login application")
	public void checkValidLogin() {
		LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
		//logger.info("calling loginToCRMPRO method from LoginPage Class");
		loginpage.loginToCRMPRO("schnwgh846@gmail.com", "ts@12345");
		Assert.assertEquals(false, true);
		//logger.info(" Successfully login into Application ....");
	}

}
