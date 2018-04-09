package com.resumeupdate.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.resumeupdate.elements.ProfilePageElements;
import com.resumeupdate.utility.Utilities;

public class ProfilePage extends ProfilePageElements {
	
	public void uploadResume(WebDriver driver)
	{
		PageFactory.initElements(driver, ProfilePage.class);
		
		/*JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.id("attachCV")));*/
		
		Actions a= new Actions(driver);
		a.moveToElement(getWriteResume()).click().build().perform();
		//getWriteResume().click();
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		getUpload().click();
		
		Utilities.uploadFile("/media/gaurav/BA92AE4892AE0949/Gaurav/General"
				+ "/Resume/Gaurav_Agnihotri_Updated_Resume.doc");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("scroll(0,0);");
		
	}

}
