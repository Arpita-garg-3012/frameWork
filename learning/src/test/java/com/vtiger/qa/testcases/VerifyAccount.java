package com.vtiger.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vtiger.qa.base.BaseClass;
import com.vtiger.qa.pages.AccountsPage;
import com.vtiger.qa.pages.HomePage;
import com.vtiger.qa.pages.LoginPage;

public class VerifyAccount extends BaseClass {
	
	@BeforeMethod
	public void create() {
		System.out.println("Account create");
	}
	
	@Test(priority = 0)
	public void tcCheckAccount() throws InterruptedException {
		LoginPage loginObj = new LoginPage();
		loginObj.loginPage();
		HomePage home = new HomePage();
		home.moveToAccountsBySales();
		Thread.sleep(2000);
		AccountsPage account = new AccountsPage();
		account.createAccount("cat","demo.com","5678567899","Happy123@gmail.com");
	}
	
	@BeforeMethod
	public void delete() {
		System.out.println("Account delete");
	}
	
	@Test(priority = 1)
	public void tcAllDeleteAccount() throws InterruptedException {
		Thread.sleep(2000);
		AccountsPage account = new AccountsPage();
		account.deleteAllAccountBySales();
	}

}
