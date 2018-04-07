package com.resumeupdate.elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.resumeupdate.base.ResumeUpdateBase;

public class LoginPageElements extends ResumeUpdateBase  {
	
	@FindBy(xpath= "//a[@id='login_Layer']/div[text()='Login']")
	private static WebElement loginarea;
	
	@FindBy(name="email")
	private static WebElement username;
	
	@FindBy(name="PASSWORD")
	private static WebElement password;
	
	@FindBy(xpath= "//button[@value='Login']")
	private static WebElement loginbtn;
	
	public static WebElement getLoginArea()
	{
		return loginarea;
	}
	
	public static WebElement getUserName()
	{
		return username;
	}
	
	public static WebElement getPassword()
	{
		return password;
	}
	
	public static WebElement getLoginButton()
	{
		return loginbtn;
	}	
	

}
