package com.resumeupdate.base;

import java.io.File;
import java.io.FileInputStream;
//import java.io.Exception;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.resumeupdate.utility.Utilities;

public class ResumeUpdateBase {
	
	FileInputStream fis;
	public Properties prop=null;
	public static WebDriver driver;
	
	public ResumeUpdateBase()
	{
		File f= new File("/media/gaurav/BA92AE4892AE0949/GauravOne"
				+ "/JobSwitch/src/main/java/com/resumeupdate/config/config.properties");
		
		try {
			  fis= new FileInputStream(f);
			  prop= new Properties();
			  prop.load(fis);
			  
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	
	public void setUp()
	{
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty(prop.getProperty("arg1"), prop.getProperty("arg2"));
			driver= new ChromeDriver();	
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}
	
	@BeforeTest
	public void initialization()
	{
		ResumeUpdateBase rb= new ResumeUpdateBase();
		rb.setUp();
		Utilities.browserClosing();
	}
	
	@AfterTest
	public void tearDown()
	{
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@class='mTxt' and text()='My Naukri']"))).perform();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.quit();
	}

}
