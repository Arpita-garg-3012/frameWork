package com.vtiger.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.qa.base.BaseClass;

public class AccountPageObject extends BaseClass { 
	
	@FindBy(xpath="//img[@alt='Create Account...']")
	protected WebElement clickOnPlus;
	
	@FindBy(xpath="//input[@name='accountname']")
	protected WebElement accountName;
	 
	@FindBy(xpath="//input[@name='website']")
	protected WebElement web;
	
	@FindBy(xpath="//input[@name='phone']")
	protected WebElement phn;
	
	@FindBy(xpath="//input[@name='email1']")
	protected WebElement e;
	
	@FindBy(xpath="/descendant::input[@title='Save [Alt+S]'][position()=1]")
	protected WebElement save;
	
	@FindBy(xpath="//input[@name='selectall']")
	protected WebElement deleteAll;
	
	@FindBy(xpath="//table[@class='small']//input[@value='Delete']")
	protected WebElement delete;
	
	public AccountPageObject() {
		PageFactory.initElements(driver, this);
	}

}
