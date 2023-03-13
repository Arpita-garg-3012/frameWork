package com.tiger.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.vtiger.qa.webutils.TestUtils;

public class BaseClass {
	
	public static WebDriver driver;
	public static TestUtils utils;
	
	public void utilsObj() {
		utils = new TestUtils();
	}
	
	@BeforeClass
	public void setUp() {
		utilsObj();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAWAN GARG\\eclipse-workspace\\javademo\\drivers\\chromedriver - Copy.exe");
		driver = new ChromeDriver();
		utils.getUrl("http://localhost:8888/");
		utils.maximizeWindow();
		utils.implicitlyWait();
	}
	
	@AfterClass
	public void tearDown() {
		utils.quitWindow();
	}

}
