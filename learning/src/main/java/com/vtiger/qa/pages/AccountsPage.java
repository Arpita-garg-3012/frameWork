package com.vtiger.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vtiger.qa.base.BaseClass;
import com.vtiger.qa.pageobjects.AccountPageObject;

public class AccountsPage extends AccountPageObject {
	
	public AccountsPage() {
		super();
	}

	public void clickOnPlus() {
//		WebElement clickOnplus = driver.findElement(By.xpath("//img[@alt='Create Account...']"));
		utils.clickOnElement(clickOnPlus);
	}

	public void createAccount(String inputdata, String website, String phone, String email) throws InterruptedException {
		clickOnPlus();

//		WebElement accountName = driver.findElement(By.xpath("//input[@name='accountname']"));
		utils.inputdata(accountName, inputdata);

//		WebElement web = driver.findElement(By.xpath("//input[@name='website']"));
		utils.inputdata(web, website);

//		WebElement phn = driver.findElement(By.xpath("//input[@name='phone']"));
		utils.inputdata(phn, phone);

//		WebElement e = driver.findElement(By.xpath("//input[@name='email1']"));
		utils.inputdata(e, email);
		
		saveAccounts();
		
		Thread.sleep(2000);
		utils.handlesAlert("Account Name Already Exists!");
		

	}

	public void saveAccounts() {
//		WebElement save = driver.findElement(By.xpath("/descendant::input[@title='Save [Alt+S]'][position()=1]"));
		utils.clickOnElement(save);
	}

	public void deleteAllAccountBySales() throws InterruptedException {
		Thread.sleep(2000);
		HomePage home = new HomePage();
		home.moveToAccountsBySales();
		
//		WebElement deleteAll = driver.findElement(By.xpath("//input[@name='selectall']"));
		utils.clickOnElement(deleteAll);

//		WebElement delete = driver.findElement(By.xpath("//table[@class='small']//input[@value='Delete']"));
		utils.clickOnElement(delete);

		Thread.sleep(2000);
		utils.handlesAlert("Deleting this account(s) will remove its related Potentials & Quotes. Are you sure you want to delete the selected 2 records?");

	}

}
