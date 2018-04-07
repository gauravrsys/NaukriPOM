package com.resumeupdate.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProfilePageElements {
	
	@FindBy(xpath= "//span[text()='Attach Resume']")
	private static WebElement writeresume;
	
	@FindBy(id= "attachCV")
	private static WebElement upload;
	
	
	public WebElement getWriteResume()
	{
		return writeresume;
	}
	
	public static WebElement getUpload(){
		return upload;
	}

}