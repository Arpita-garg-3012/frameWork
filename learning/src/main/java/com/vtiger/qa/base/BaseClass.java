package com.vtiger.qa.base;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.vtiger.qa.webutils.TestUtils;

public class BaseClass {
	
	public static WebDriver driver;
	public static TestUtils utils;
	public static Properties prop;
	
	public void utilsObj() {
		utils = new TestUtils();
	}
	
	@BeforeClass
	public void setUp() {
		utilsObj();
		prop = utils.loadConfig();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PAWAN GARG\\eclipse-workspace\\javademo\\drivers\\chromedriver - Copy.exe");
		driver = new ChromeDriver();
		System.out.println(prop.getProperty("url"));
		utils.getUrl(prop.getProperty("url"));
		utils.maximizeWindow();
		utils.implicitlyWait();
	}
	
	@AfterClass
	public void tearDown() {
		utils.quitWindow();
	}

}
