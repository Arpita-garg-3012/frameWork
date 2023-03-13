

import com.tiger.qa.base.BaseClass;
import com.vtiger.qa.pages.LeadAccount;
import com.vtiger.qa.pages.LoginPage;

public class VerifyLead {
	
	public void tcCheckLead() {
		BaseClass base = new BaseClass();
		base.setUp();
		LoginPage loginObj = new LoginPage();
		loginObj.loginPage();
		LeadAccount lead = new LeadAccount();
		lead.clickOnLeads();
		lead.searchLeadsByLeadNumber("Happy");
		base.tearDown();
	}

}
