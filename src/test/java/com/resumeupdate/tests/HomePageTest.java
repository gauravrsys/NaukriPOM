package com.resumeupdate.tests;

import org.testng.annotations.Test;
import com.resumeupdate.base.ResumeUpdateBase;
import com.resumeupdate.pages.HomePage;

public class HomePageTest extends ResumeUpdateBase {
	
	HomePage hp;
	
	@Test
	public void homePageTestOne()
	{
		hp= new HomePage();
		hp.viewProfile(driver);
	}

}
