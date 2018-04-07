package com.resumeupdate.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.resumeupdate.elements.LoginPageElements;


public class LoginPage extends LoginPageElements  {
	
	public HomePage login(WebDriver driver)
	{
		PageFactory.initElements(driver, LoginPage.class);
		
		getLoginArea().click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}

		getUserName().sendKeys(prop.getProperty("username"));
		getPassword().sendKeys(prop.getProperty("password"));
		getLoginButton().click();
		return new HomePage();
		
	}

}
