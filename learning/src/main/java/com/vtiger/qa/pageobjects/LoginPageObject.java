package com.vtiger.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.qa.base.BaseClass;

public class LoginPageObject extends BaseClass {
	
	@FindBy(name="user_name")
	protected WebElement user;
	
	@FindBy(name="user_password")
	protected WebElement password;
	
	@FindBy(name="Login")
	protected WebElement login;
	
	public LoginPageObject() {
		PageFactory.initElements(driver, this);
	}

}
