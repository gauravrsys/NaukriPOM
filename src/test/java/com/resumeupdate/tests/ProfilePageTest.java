package com.resumeupdate.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.resumeupdate.base.ResumeUpdateBase;
import com.resumeupdate.pages.ProfilePage;

public class ProfilePageTest extends ResumeUpdateBase {
	
	ProfilePage pp;
	
	@Test
	public void profilePageTestOne()
	{
		pp= new ProfilePage();
		
		pp.uploadResume(driver);
		
	}

}
