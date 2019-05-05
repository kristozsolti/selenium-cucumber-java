package com.mylibrary.pageobjects.loggedin;

import com.mylibrary.driver.Browser;

public class UserDetailsPage {

	public Boolean isAtUserDetailPage(String userEmail) {
		String email = Browser.findById("user-email").getText();
		return userEmail.equals(email);
	}

}
