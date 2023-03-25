package com.vtiger.qa.testcases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vtiger.qa.base.BaseClass;
import com.vtiger.qa.pages.LeadAccount;
import com.vtiger.qa.pages.LoginPage;

public class VerifyLead extends BaseClass {
	@BeforeMethod
	public void lead() {
		System.out.println("Page Lead");
	}
	
	@Test(priority = 0)
	public void tcCheckLead() {
		LoginPage loginObj = new LoginPage();
		loginObj.loginPage();
		LeadAccount lead = new LeadAccount();
		lead.clickOnLeads();
		lead.searchLeadsByLeadNumber("Happy");
	}

}
