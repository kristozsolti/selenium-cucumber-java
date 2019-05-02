package com.mylibrary.pageobjects.common;

import org.openqa.selenium.WebElement;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;

public class LoginPage {
	
	public static void goTo() {
		Browser.goTo(UrlCollection.LOGIN_PAPGE_URL);
	}

	public static void setUsernameField(String username) {
		WebElement usernameField = Browser.findById("username");
		usernameField.sendKeys(username);
	}
	
	public static void setPasswordField(String password) {
		WebElement usernameField = Browser.findById("password");
		usernameField.sendKeys(password);
	}
	
	public static void clickToLoginButton() {
		WebElement loginButton = Browser.findById("btn-login");
		loginButton.click();
	}
	
	public static Boolean isUserAuthenticated(String username) {
		String loggedInUsername = Browser.findByXpathWait("//*[@id='dropdownMenu']/span").getText();

		return loggedInUsername.equals(username);
	}
	
	public static String wrongCredentialsError() {
		WebElement errorMessageContainer = Browser.findByXpath("//div[@class='alert alert-danger']/p");
		return errorMessageContainer.getText();
	}
	
}
