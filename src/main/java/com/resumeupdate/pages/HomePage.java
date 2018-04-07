package com.resumeupdate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.resumeupdate.elements.HomePageElements;

public class HomePage extends HomePageElements {
	
	public ProfilePage viewProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, HomePage.class);
		
		getUpdateProfile().click();
		return new ProfilePage();
	}
	
}
