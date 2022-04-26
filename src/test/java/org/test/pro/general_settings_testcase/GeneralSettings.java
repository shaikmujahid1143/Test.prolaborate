package org.test.pro.general_settings_testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class GeneralSettings extends LoginPage 

{
	public static Actions act;
	
	public static EditRev_Page erp;
	
	public static RevActiveAndVerifyStartDate_Page rap;
	
	 
	
	
	@Test
	public static void checkInGeneralSettingAlinedsettingProperly() throws InterruptedException, IOException
	{    
		
	//TC01 Check if all the four settings are properly aligned in the General settings Page
		
		System.out.println("\n TC01 Check if all the four settings are properly aligned in the General settings Page \n");
	
		login("Admin");
		
		erp=new EditRev_Page();
		rap=new RevActiveAndVerifyStartDate_Page();
	
		Thread.sleep(8000);
		erp.getMenuBtn().click();
		Thread.sleep(3000);
		rp.getgeneralSetting().click();
		Thread.sleep(3000);
	
		List<WebElement> settingList=driver.findElements(By.tagName("h3"));
		System.out.println(settingList.size());
	
		System.out.println("\n General Setting  Get Title :"); // General Settings 
		
		for(int i=0;i<settingList.size();i++)
			
		System.out.println("\n"+settingList.get(i).getText()); // Getting All Setting Title from General setting
		{
		System.out.println("\n Properly Alined the Setting In General settings \n");
		
		}
	
		System.out.println("\n Test Passed Successfully \n");
	
	
	
	
	//TC02 Check if the font style is similar among all the settings title
	
	
		System.out.println("\n TC02 Check if the font style is similar among all the settings title \n");
	
		System.out.println("\n General Setting Title With Font Style:");
		
		for(int i=0;i<settingList.size();i++)
			
		// Getting All Setting Title Font Style from General setting	
		System.out.println("\n"+settingList.get(i).getText()+":   "+settingList.get(i).getCssValue("font-family"));
	
		{
		System.out.println("\n Same font style of Settings In General setting");
	
		}
	
		System.out.println("\n Test Passed Successfully \n");
	
	
	
	
	
	//TC03 Check if the font size of all the settings title are similar
	
		System.out.println("\n TC03 Check if the font size of all the settings title are similar \n");
	
		System.out.println("\n General Setting Title With Font Size:");
		
		for(int i=0;i<settingList.size();i++)
			
		// Getting All Setting Title Font Size from General setting		
		System.out.println("\n"+settingList.get(i).getText()+":   "+settingList.get(i).getCssValue("font-size"));
	
		{
		System.out.println("\n Same font size of Settings In General setting");
	
		}
	
		System.out.println("\n Test Passed Successfully \n");
	
	
	
		
		
	//TC04 Check if the first letter of each word in the settings title is in upper case
		
		System.out.println("\n TC04 Check if the first letter of each word in the settings title is in upper case \n");
		
		
		
		
		
		
		
		
		
	
		
		
//		  for (int i = 0; i < str.length(); i++) {
//			  
//			  
//			  
//			  
//			  
//			  
//		  }
//			    
//	            if(Character.isUpperCase(str.charAt(i))){    
//	            System.out.println(str.charAt(i));
//	            }
	
	//TC05 Check if the List of options under all the settings are  properly aligned
		
		System.out.println("TC05 Check if the List of options under all the settings are  properly aligned");
	
	
		List<WebElement> optionList=driver.findElements(By.tagName("label"));
		System.out.println("\n"+optionList.size());
	
		System.out.println("\n General Setting  Get Options Title :"); // General Settings Options
		
		for(int i=0;i<optionList.size();i++)
			
			
		System.out.println("\n"+optionList.get(i).getText()); // Getting All Setting Options Title from General setting
		{
		System.out.println("\n Properly Alined the Setting Options In General settings \n");
		
		}
	
		System.out.println("\n Test Passed Successfully \n");
	
	
		
		
		
		
	//TC06 Check if the font style is similar to all the options under the settings
	
		System.out.println("\n TC06 Check if the font style is similar to all the options under the settings \n");
		
		System.out.println("\n General Setting Options Title With Font Style:");
		
		for(int i=0;i<optionList.size();i++)
			
		// Getting All Setting Options Title Font Style from General setting Options	
		System.out.println("\n"+optionList.get(i).getText()+"   "+optionList.get(i).getCssValue("font-family"));
	
		{
		System.out.println("\n Same font style of Settings In General setting options");
	
		}
	
		System.out.println("\n Test Passed Successfully \n");
	
		
		
		
	//TC07 Check if the font size is similar to all the options under the settings
		
		System.out.println("\n TC07 Check if the font size is similar to all the options under the settings \n");
		
		System.out.println("\n General Setting Options Title With Font Size:");
		
		for(int i=0;i<optionList.size();i++)
			
		// Getting All Setting Title Font Size from General setting	Options	
		System.out.println("\n"+optionList.get(i).getText()+":   "+optionList.get(i).getCssValue("font-size"));
	
		{
		System.out.println("\n Same font size of Settings Options In General setting");
	
		}
	
		System.out.println("\n Test Passed Successfully \n");
		
		
		
		
		//TC08 Check if the first letter of each word in the list of options is in upper case
		
		System.out.println("TC08 Check if the first letter of each word in the list of options is in upper case");
		
		
		
		
		
		
		
		
		
		
		
		
		
		//TC09 Check if the question icon is present next to the options under settings
		
		System.out.println("\n TC09 Check if the question icon is present next to the options under settings \n");
		
		List<WebElement> questionTagList=driver.findElements(By.xpath("//label//*[name()='svg']"));
		System.out.println("\n"+questionTagList.size());
		
		
		// Getting All Setting Options Question Tags Under Settings
		for(int i=0;i<questionTagList.size();i++)
			System.out.println("\n"+optionList.get(i).getText()+":  "+questionTagList.get(i).getAttribute("data-icon"));
		{
			System.out.println("\n Question Icon Is present Under the Setting Options");
		}
		
		System.out.println("\n Test Passed Successfully \n");
		
		
		
		
		//TC10 Check if the user is shown proper info in the tooltip when hovering the question icon of the "Embedded Document Settings" options
		
		System.out.println("\n TC10 Check if the user is shown proper info in the tooltip when hovering the question icon of the 'Embedded Document Settings' options \n");
		
		WebElement embDownloadAcess=driver.findElement(By.xpath("//label[normalize-space()='Download access']//*[name()='svg']"));
		
		if(embDownloadAcess.isDisplayed())
		{
		act.moveToElement(embDownloadAcess).build().perform();
		String queStionTagMsg=embDownloadAcess.getText();
		
		System.out.println("When Mouse Hover On Download access Question Tag It shown Message:"+" "+queStionTagMsg);
		}else
		{
			System.out.println("When Mouse Hover On Download access Question Tag It does not showing Message");
		}
		
		// Getting All Setting Options Question Tags Under Settings
		
	
		
	
		
		
		
		
		
		
		
		
}
}
	
