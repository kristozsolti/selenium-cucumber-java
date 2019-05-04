package com.mylibrary.pages;

public abstract class Page {

	public abstract void goTo();
	
	public abstract String pagePath();
	
	public Boolean isAt(String path) {
		return pagePath().equals(path);
	}
	
}
