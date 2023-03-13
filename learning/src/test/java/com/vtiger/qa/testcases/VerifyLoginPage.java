package com.vtiger.qa.testcases;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.tiger.qa.base.BaseClass;
import com.vtiger.qa.pages.LoginPage;

public class VerifyLoginPage extends BaseClass {
	
	@BeforeMethod
	public void login() {
		System.out.println("Page Login");
	}
	
    @Test(priority = 0)
	public void tcValidateLoginPage() throws InterruptedException {
		LoginPage login = new LoginPage();
		login.loginPage();
	}
}
