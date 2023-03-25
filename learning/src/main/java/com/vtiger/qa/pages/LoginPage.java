package com.vtiger.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vtiger.qa.base.BaseClass;
import com.vtiger.qa.pageobjects.LoginPageObject;

public class LoginPage extends LoginPageObject {
	
//	WebElement user = driver.findElement(By.name("user_name"));
//	WebElement password = driver.findElement(By.name("user_password"));
//	WebElement click = driver.findElement(By.name("Login"));
	
	public LoginPage() {
		super();
	}
	
	public void loginPage() {
//		WebElement user = driver.findElement(By.name("user_name"));
		utils.inputdata(user, prop.getProperty("userName"));
//		user.clear();
//		driver.navigate().refresh();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		utils.inputdata(user, "admin");
//		WebElement password = driver.findElement(By.name("user_password"));
		utils.inputdata(password, prop.getProperty("password"));
//		WebElement click = driver.findElement(By.name("Login"));
		utils.clickOnElement(login);
	}
	
	
}
