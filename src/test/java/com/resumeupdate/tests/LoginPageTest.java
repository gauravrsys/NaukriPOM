package com.resumeupdate.tests;

import org.testng.annotations.Test;

import com.resumeupdate.base.ResumeUpdateBase;
import com.resumeupdate.pages.LoginPage;

public class LoginPageTest extends ResumeUpdateBase {
	
	LoginPage lp=null;
	
	@Test
	public void loginPageTestOne() 
	{
		
		lp= new LoginPage();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		lp.login(driver);
	}

}
