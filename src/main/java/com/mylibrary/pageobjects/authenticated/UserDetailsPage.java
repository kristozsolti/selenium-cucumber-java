package com.mylibrary.pageobjects.authenticated;

import com.mylibrary.driver.Browser;

public class UserDetailsPage {

	public Boolean isAtUserDetailPage(String userEmail) {
		String email = Browser.findById("user-email").getText();
		return userEmail.equals(email);
	}

}
