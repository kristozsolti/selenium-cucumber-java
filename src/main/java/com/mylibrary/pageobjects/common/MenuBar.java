package com.mylibrary.pageobjects.common;

import org.openqa.selenium.WebElement;

import com.mylibrary.driver.Browser;

public class MenuBar {

	public static void clickOnHomeLink() {
		
	}
	
	public static void clickOnBooksLink() {
		
	}
	
	public static void clickOnAuthorsLink() {
		
	}
	
	public static void clickOnContactLink() {
		WebElement contactLink = Browser.findByXpath("//a[@href='/contact']");
		contactLink.click();
	}
	
	public static void clickOnSignInLink() {
		
	}
	
	public static void performSignOut() {
		WebElement dropdownMenu = Browser.findById("dropdownMenu");
		dropdownMenu.click();
		WebElement signOutLink = Browser.findById("btnLogout");
		signOutLink.click();
	}
	
}
