package com.vtiger.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tiger.qa.base.BaseClass;

public class LeadAccount extends BaseClass {
	
	public void clickOnLeads() {
		HomePage home = new HomePage();
		home.moveToleadsBySales();		
	}
	
	public void searchLeadsByLeadNumber(String str) {
		WebElement serach = driver.findElement(By.xpath("//input[@name='search_text']"));
		utils.inputdata(serach, str);
		
		WebElement click = driver.findElement(By.xpath("//input[@name='submit']"));
		utils.clickOnElement(click);
		
	}	
	

}
