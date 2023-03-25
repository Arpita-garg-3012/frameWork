package com.vtiger.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.qa.base.BaseClass;

public class HomePageObject extends BaseClass{

	@FindBy(xpath="//a[text()='Sales']")
	protected WebElement sales;
	
	@FindBy(xpath="//div[@id='Sales_sub']//a[text()='Leads']")
	protected WebElement leads;
	
	@FindBy(xpath="//div[@id='Sales_sub']//a[text()='Accounts']") 
	protected WebElement click;
	
	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}
	
}
