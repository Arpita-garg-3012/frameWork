package com.vtiger.qa.webutils;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.tiger.qa.base.BaseClass;

public class TestUtils extends BaseClass {
	
	Alert alert;
	Actions action;
	
	public void clickOnElement(WebElement element) {
		if (element.getSize().getHeight() > 0 && element.getSize().getWidth() > 0) {
			System.out.println("Element is visible in UI");
			if(element.isDisplayed()==true) {
				System.out.println("Element is available for work");
				element.click();
				System.out.println("Performance is successfull");
			} else {
				System.out.println("Element is not available for work");
			}
		} else {
			System.out.println("Element is not visible UI");
		}
		
	}
	
	public void getUrl(String Url) {
		driver.get(Url);
	}
	
	public void closeWindow() {
		driver.close();
	}
	
	public void quitWindow() {
		driver.quit();
	}
	
	public void inputdata(WebElement element, String str) {
		if (element.getSize().getHeight() > 0 && element.getSize().getWidth() > 0) {
			System.out.println("Element is visible in UI");
			if(element.isDisplayed()==true) {
				System.out.println("Element is available for work");
				element.sendKeys(str);
				System.out.println("Performance is successfull");
			} else {
				System.out.println("Element is not available for work");
			}
		} else {
			System.out.println("Element is not visiblr UI");
		}
	}
	
	public void handlesAlert() {
		alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void actionObj(WebDriver driver) {
    	action = new Actions(driver);
    }
	
	public void acMoveToElement(WebElement element) {
		if (element.getSize().getHeight() > 0 && element.getSize().getWidth() > 0) {
			System.out.println("Element is visible in UI");
			if(element.isDisplayed()==true) {
				System.out.println("Element is available for work");
				actionObj(driver);
				action.moveToElement(element).build().perform();
				System.out.println("Performance is successfull");
			} else {
				System.out.println("Element is not available for work");
			}
		} else {
			System.out.println("Element is not visiblr UI");
		}
	}
	
	public void acClickOnElement(WebElement element) {
		if (element.getSize().getHeight() > 0 && element.getSize().getWidth() > 0) {
			System.out.println("Element is visible in UI");
			if(element.isDisplayed()==true) {
				System.out.println("Element is available for work");
				actionObj(driver);
				action.click(element).build().perform();
				System.out.println("Performance is successfull");
			} else {
				System.out.println("Element is not available for work");
			}
		} else {
			System.out.println("Element is not visiblr UI");
		}
	}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}
	
	public void implicitlyWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	

}



















