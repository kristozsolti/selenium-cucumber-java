package com.mylibrary.testframework.pageobjects.common;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;

public class MenuBar {

	public static void clickOnHomeLink() {
		WebElement homeLink = Browser.findByXpath("//a[@href='/']");
		homeLink.click();
	}
	
	public static void clickOnBooksLink() {
		WebElement booksLink = Browser.findByXpath("//a[@href='/books']");
		booksLink.click();
	}
	
	public static void clickOnAuthorsLink() {
		WebElement authorsLink = Browser.findByXpath("//a[@href='/authors']");
		authorsLink.click();
	}
	
	public static void clickOnContactLink() {
		WebElement contactLink = Browser.findByXpath("//a[@href='/contact']");
		contactLink.click();
	}
	
	public static void clickOnSignInLink() {
		WebElement signInLink = Browser.findByXpath("//a[@href='/login']");
		signInLink.click();
	}
	
	public static void clickOnUsersLink() {
		WebElement usersLink = Browser.findByXpath("//a[@href='/users']");
		usersLink.click();
	}
	
	public static void clickOnAdminDashboardButton() {
		WebElement adminDashboardButton = Browser.findByXpath("//a[@href='/admin/']");
		adminDashboardButton.click();
	}
	
	public static void performSignOut() {
		WebElement dropdownMenu = Browser.findById("dropdownMenu");
		dropdownMenu.click();
		WebElement signOutLink = Browser.findById("btnLogout");
		signOutLink.click();
	}
	
}