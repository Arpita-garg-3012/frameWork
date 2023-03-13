package com.vtiger.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tiger.qa.base.BaseClass;

public class LoginPage extends BaseClass {
	
	public void loginPage() {
		WebElement user = driver.findElement(By.name("user_name"));
		utils.inputdata(user, "admin");
		WebElement password = driver.findElement(By.name("user_password"));
		utils.inputdata(password, "admin");
		WebElement click = driver.findElement(By.name("Login"));
		utils.clickOnElement(click);
	}
	
	
}
