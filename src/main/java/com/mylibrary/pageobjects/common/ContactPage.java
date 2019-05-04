package com.mylibrary.pageobjects.common;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

public class ContactPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(UrlCollection.CONTACT_PAPGE_URL);	
	}

	public Boolean isAt() {
		return Browser.isAtUrl(UrlCollection.CONTACT_PAPGE_URL);
	}

	@Override
	public String pagePath() {
		return UrlCollection.CONTACT_PAPGE_URL;
	}

}
