package com.vtiger.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class pratice {
	
	WebDriver driver;
	
	@Parameters({"browser", "url"})
	@Test
	public void launchBrowser(String browser, String url) {
		System.out.println("Running browser is "+browser);
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAWAN GARG\\eclipse-workspace\\javademo\\drivers\\chromedriver - Copy.exe");
			driver = new ChromeDriver();
		} else {
			System.out.print("Other browser is launched");
		}
		driver.get(url);
	}
	
	@Parameters({"user", "password"})
	@Test
	public void loginTest(String user, String password) {
		driver.findElement(By.name("user_name")).sendKeys(user);
		driver.findElement(By.name("user_password")).sendKeys(password);;
		
	}

}
