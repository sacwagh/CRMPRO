package com_crmpro_navmenu_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com_crmpro_base_class.BaseClassTest;

public class CalendarPage extends BaseClassTest {
	CalendarPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Finding element on calendar home page 
	@FindBy(how=How.CSS,using=" select[name=load_calendar_for_user_id]")
	WebElement loc_calendarForUser;
	
	@FindBy(how=How.CSS,using=" select[name=load_calendar_for_user_id]")
	WebElement loc_btnUserSearch;
	
	public void toCheckCalenarIsOpenOnbtnClick() {
	}
}
//