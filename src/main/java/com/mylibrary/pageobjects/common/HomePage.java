package com.mylibrary.pageobjects.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

public class HomePage extends Page {
	
	private WebElement topRatedBook;

	@Override
	public void goTo() {
		Browser.goTo(UrlCollection.HOME_PAPGE_URL);
	}

	@Override
	public String pagePath() {
		return UrlCollection.HOME_PAPGE_URL;
	}
	
	public void clickOnTopRatedBook() {
		WebElement topRatedBooksContainer = Browser.findById("top-rated-books");
		List<WebElement> topRatedBooks = topRatedBooksContainer.findElements(By.className("card-link"));
		
		topRatedBook = topRatedBooks.get(0);
		topRatedBook.click();
	}
	
	public WebElement getTopRatedBook() {
		return this.topRatedBook;
	}

}
