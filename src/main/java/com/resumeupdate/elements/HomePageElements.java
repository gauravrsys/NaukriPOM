package com.resumeupdate.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElements {
	
	@FindBy(xpath= "//a[text()='UPDATE PROFILE']")
	private static WebElement updateprofile;
	
	public WebElement getUpdateProfile()
	{
		return updateprofile;
	}


}
