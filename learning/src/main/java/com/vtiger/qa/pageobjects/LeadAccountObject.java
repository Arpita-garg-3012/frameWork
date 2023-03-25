package com.vtiger.qa.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.qa.base.BaseClass;

public class LeadAccountObject extends BaseClass {
	
	@FindBy(xpath="//input[@name='search_text']")
	protected WebElement search;
	
	@FindBy(xpath="//input[@name='submit']")
	protected WebElement click;

	public LeadAccountObject() {
		PageFactory.initElements(driver, this);
	}
}
