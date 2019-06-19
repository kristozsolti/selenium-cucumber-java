package com.mylibrary.testframework.pageobjects.common;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class HomePage extends Page {

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
		
		WebElement topRatedBook = topRatedBooks.get(0);
		topRatedBook.click();
	}
	

	public void clickOnTopRatedAuthor() {
		WebElement topRatedAuthorsContainer = Browser.findById("top-rated-books");
		List<WebElement> topRatedAuthors = topRatedAuthorsContainer.findElements(By.className("card-link"));
		
		WebElement topRatedAuthor = topRatedAuthors.get(0);
		topRatedAuthor.click();
	}

}
