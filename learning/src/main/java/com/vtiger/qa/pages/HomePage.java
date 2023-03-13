package com.vtiger.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tiger.qa.base.BaseClass;

public class HomePage extends BaseClass {
	
	public void moveToSales() {
		WebElement sales = driver.findElement(By.xpath("//a[text()='Sales']"));
		utils.acMoveToElement(sales);
	}
	
	public void moveToleadsBySales() {
		moveToSales();
		WebElement leads = driver.findElement(By.xpath("//div[@id='Sales_sub']//a[text()='Leads']"));
		utils.acClickOnElement(leads);
	}
	
	public void moveToAccountsBySales() {
		moveToSales();
		WebElement click = driver.findElement(By.xpath("//div[@id='Sales_sub']//a[text()='Accounts']"));
		utils.acClickOnElement(click);
	}

}
