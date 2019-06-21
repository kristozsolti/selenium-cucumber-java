package com.mylibrary.testframework.pageobjects.common;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;

public class MenuBar {
	private static final String HOME_LINK_XPATH = "//a[@href='/']";
	private static final String BOOKS_LINK_XPATH = "//a[@href='/books']";
	private static final String AUTHORS_LINK_XPATH = "//a[@href='/authors']";
	private static final String CONTACTUS_LINK_XPATH = "//a[@href='/contact']";
	private static final String LOGIN_LINK_XPATH = "//a[@href='/login']";
	private static final String USERS_LINK_XPATH = "//a[@href='/users']";
	private static final String ADMIN_DASHBOARD_LINK_XPATH = "//a[@href='/admin/']";
	
	private static final String DROPDOWN_MENU_ID = "dropdownMenu";
	private static final String LOGOUT_BUTTON_ID = "btnLogout";

	public static void clickOnHomeLink() {
		WebElement homeLink = Browser.findByXpath(HOME_LINK_XPATH);
		homeLink.click();
	}
	
	public static void clickOnBooksLink() {
		WebElement booksLink = Browser.findByXpath(BOOKS_LINK_XPATH);
		booksLink.click();
	}
	
	public static void clickOnAuthorsLink() {
		WebElement authorsLink = Browser.findByXpath(AUTHORS_LINK_XPATH);
		authorsLink.click();
	}
	
	public static void clickOnContactLink() {
		WebElement contactLink = Browser.findByXpath(CONTACTUS_LINK_XPATH);
		contactLink.click();
	}
	
	public static void clickOnSignInLink() {
		WebElement signInLink = Browser.findByXpath(LOGIN_LINK_XPATH);
		signInLink.click();
	}
	
	public static void clickOnUsersLink() {
		WebElement usersLink = Browser.findByXpath(USERS_LINK_XPATH);
		usersLink.click();
	}
	
	public static void clickOnAdminDashboardButton() {
		WebElement adminDashboardButton = Browser.findByXpath(ADMIN_DASHBOARD_LINK_XPATH);
		adminDashboardButton.click();
	}
	
	public static void performSignOut() {
		WebElement dropdownMenu = Browser.findById(DROPDOWN_MENU_ID);
		dropdownMenu.click();
		WebElement signOutLink = Browser.findById(LOGOUT_BUTTON_ID);
		signOutLink.click();
	}
	
}
