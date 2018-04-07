package com.resumeupdate.utility;


import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import com.resumeupdate.base.ResumeUpdateBase;
import com.resumeupdate.elements.LoginPageElements;

public class Utilities extends ResumeUpdateBase {
	
	public static int count=0;

	public static void browserClosing()
	{
		
		String parenthandle= driver.getWindowHandle();
		
		for(String handles: driver.getWindowHandles())
		{
			if(!handles.equals(parenthandle))
			{
				driver.switchTo().window(handles);
				driver.close();	
			}
			
		}
		
		driver.switchTo().window(parenthandle);	
		
	}
	
	//To upload the file using robot class
	
	public static void setClipboardData(String string) {
		
		//StringSelection is a class that can be used for copy and paste operations.
		   StringSelection stringSelection = new StringSelection(string);
		   Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
		}
	
	public static void uploadFile(String fileLocation) {
		
        try {
        	//Setting clipboard with file location
            setClipboardData(fileLocation);
            //native key strokes for CTRL, V and ENTER keys
            Robot robot = new Robot();
	
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (Exception exp) {
        	exp.printStackTrace();
        }
    }
}

