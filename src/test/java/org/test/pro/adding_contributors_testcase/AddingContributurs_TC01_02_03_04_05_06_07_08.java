package org.test.pro.adding_contributors_testcase;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.test.pro.create_review_testcase.CreateReviewTest;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class AddingContributurs_TC01_02_03_04_05_06_07_08 extends LoginPage
{
	
	public static String UserName= "Shaik Mujahiddin";
	 public static String mon= "Apr";
	 public static String year= "2022";
	 public static String RevNotes= "Automation Testing";
	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;
	 public static DateTimeFormatter dtf;
	 public static Actions act;


	 

	 	@Test
		public static void AddContributorReview() throws InterruptedException, IOException
		{
	
	 	login("Admin");
		erp=new EditRev_Page();
		rap=new RevActiveAndVerifyStartDate_Page();
		act=new Actions(driver);
		Thread.sleep(8000);
		rp.getRepoName().click();
		Thread.sleep(3000);
		rp.getReviewData().click();
		rp.getCreateRev().click();
		rp.getRevName().sendKeys(UserName);
		rp.getRevStartDate().click();
		rp.getRevStartMon(mon);
		rp.getRevStartYear(year);
		
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
	    LocalDateTime now = LocalDateTime.now();
	    System.out.println(dtf.format(now));
		
		//driver.findElement(By.xpath("//span[contains(text(),'19')]")).click();
		
		rp.getRevEndDate().click();
		rp.getRevEndMon(mon);
		rp.getRevEndYear(year);
		driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
		Thread.sleep(5000);
		rp.getNext().click();
		rp.getNext().click();
		
		//TC01_Check Moderator Role Is Given By default
		
		System.out.println("TC01_Check Moderator Role Is Given By default");
		
		WebElement defModerator=driver.findElement(By.xpath("//div[@class='p-1 bg-E px-3 rounded mr-2']"));
		
		
		String role=defModerator.getText();
		if(defModerator.isDisplayed())
		{
			System.out.println("Moderator role given by default to Admin:"+role);
		}else
		{
			System.out.println("Moderator role is not given by default to Admin"+role);
		}
//	
	
		
		
		// TC02_Trying to Remove Moderator Role and Verify Error Message
		
		System.out.println("TC02_Trying to Remove Moderator Role and Verify Error Message");
		
		String cssValue = defModerator.getCssValue("background-color");
		String asHex = Color.fromString(cssValue).asHex();
		
		
		act.moveToElement(defModerator).build().perform();
		WebElement del=rp.getdeleteConAdmin();
		
		String wrnMsg=driver.findElement(By.xpath("//div[contains(text(),'You cannot remove the Moderator')]")).getText();
		
		try{
			
		if(del.isEnabled())
		{
			del.click();
			System.out.println("In Review Succeefully Removed the Default Moderator:"+" "+asHex+" "+wrnMsg);
		}}catch (Exception e)
		{
			System.out.println("Failed to Remove the Default Moderator because Disabled the Remove Option but it is grayed color:"+"  "+asHex+" "+wrnMsg);
		}
		
		
		
		
		
		
		//TC03_Trying To Remove the Review Creator And Verify Error Message
		
		System.out.println("TC03_Trying To Remove the Review Creator And Verify Error Message");
		
		WebElement creatorDel=driver.findElement(By.xpath("//app-button-clear[@placement='left']//app-button"));
		
		act.moveToElement(creatorDel).build().perform();
		
		String removeMsg=driver.findElement(By.xpath("//div[contains(text(),'Review Moderator')]")).getText();
		
		
		try{
			
		if(del.isEnabled())
		{
			del.click();
			System.out.println("In Review Succeefully Removed the Default Moderator:"+" "+asHex+" "+removeMsg);
		}}catch (Exception e)
		{
			System.out.println("Failed to Remove the Review Creator because Disabled the Remove Option And it is grayed color:"+"  "+asHex+" "+removeMsg);
		}
		logOut();
		
		
		
		
		//TC04_Check Moderator Role Can Remove the Review Creator Or Not Verify The Error Message
		
		
		System.out.println("TC04_Check Moderator Role Can Remove the Review Creator Or Not Verify The Error Message");
		
		login("Moderator");
			
		Thread.sleep(8000);
		erp.getMenuBtn().click();
		Thread.sleep(2000);
		erp.getReviews().click();
		Thread.sleep(8000);
		rap.EdtDeleIcon.click();
		Thread.sleep(3000);
		rap.EditIcon.click();
		Thread.sleep(3000);
		rp.getNext().click();
		rp.getNext().click();
		
		WebElement delRevCreator=rp.getdeleteConAdmin();
		
		try{
			
		if(delRevCreator.isEnabled())
		{
			del.click();
			System.out.println("Moderator Succeefully Removed the Review Creator:"+" "+asHex+" "+removeMsg);
		}}catch (Exception e)
		{
			System.out.println("Moderator Failed to Remove the Review Creator because Disabled the Remove Option and is Grayed color:"+" "+asHex+" "+removeMsg);
		}
		
		
		
		
		
		//TC05_Check Moderator Role Try to Remove the Review Creator Moderator role Or Not Verify The Error Message
		
		System.out.println("TC05_Check Moderator Role Try to Remove the Review Creator Moderator role Or Not Verify The Error Message");
		
		
		
		Thread.sleep(3000);
		try{
			
			if(del.isEnabled())
			{
				del.click();
				System.out.println("In Review Moderator Role can Succeefully Removed the Default Review Creator Moderator Role:"+" "+asHex+" "+removeMsg);
			}}catch (Exception e)
			{
				System.out.println("In Review Moderator Role Failed to Remove the Review Creator Moderator Role because Disabled the Remove Option And it is grayed color:"+"  "+asHex+" "+removeMsg);
			}
			
			logOut();
	
			
			
			
			
			
	 		
	 		
	 		
	 		//TC06_Check The Review Creator can not be removed using delete in bulk action
	 		
	 		System.out.println("TC06_Check The Review Creator can not be removed using delete in bulk action");
	 		
	 		CreateReviewTest.CreateAReview();
	 		Thread.sleep(10000);
			erp.getMenuBtn().click();
			Thread.sleep(3000);
			erp.getReviews().click();
			Thread.sleep(10000);
			rap.EdtDeleIcon.click();
			Thread.sleep(10000);
			rap.EditIcon.click();
			Thread.sleep(3000);
			rp.getNext().click();
			rp.getNext().click();
			
			List<WebElement> delAllCon=driver.findElements(By.xpath("//div/div[2]/div/div[3]/app-button-clear"));
			delRevCreator=delAllCon.get(0);
			System.out.println(delAllCon.size());
			
			for(int i=0;i<=delAllCon.size();i++)
			{
			try{
				
					if(delRevCreator.isEnabled())
					{
						delAllCon.get(i).click();
						System.out.println("Review Creator is Successfully Removed All the Contributors :"+" "+asHex+" "+removeMsg);
						
						
						
					}
				
				
		}catch (Exception e)
		{
			System.out.println("Review Creator Restricted To Removed the Review Creator:"+" "+asHex+" "+removeMsg);
			break;
		}}
		
			logOut();
			
			
			
			
			
			
			//TC07_Check The Review Creator can not be removed using delete in bulk action
			
			
			System.out.println("TC07_Check The Review Creator can not be removed using delete in bulk action");
			
			login("Moderator");
			
			Thread.sleep(8000);
			erp.getMenuBtn().click();
			Thread.sleep(2000);
			erp.getReviews().click();
			Thread.sleep(8000);
			rap.EdtDeleIcon.click();
			Thread.sleep(3000);
			rap.EditIcon.click();
			Thread.sleep(3000);
			rp.getNext().click();
			rp.getNext().click();
			
			List<WebElement> delAllContributor=driver.findElements(By.xpath("//div/div[2]/div/div[3]/app-button-clear"));
			delRevCreator=delAllContributor.get(0);
			System.out.println(delAllCon.size());
			
			
			try{
				for(int i=0;i<=delAllContributor.size();i++)
				{
					if(delRevCreator.isEnabled())
					{
						delAllContributor.get(i).click();
						System.out.println("Moderator is Successfully Removed All the Contributors Except Review creator:"+" "+asHex+" "+removeMsg);
						
						break;
						}
				}}catch (Exception e)
			{
				System.out.println("Moderator Restricted To Removed the Review Creator:"+" "+asHex+" "+removeMsg);
			}
			
				logOut();
				
				
				
				
				//TC08_Verify the  Inactive User In Contributor List
				
				System.out.println("TC08_Verify the  Inactive User In Contributor List");
				
				CreateReviewTest.CreateAReview();
				
				Thread.sleep(10000);
				erp.getMenuBtn().click();
				Thread.sleep(3000);
				rp.getUserLicenseAct_InAct().click();
			
				Thread.sleep(5000);
				rp.getUserLicenseEdit().click();
				Thread.sleep(3000);
				rp.getUserStatusEdit().click();
				rp.getUserSave().click();
				Thread.sleep(3000);
				for(int i=0;i<=3;i++)
		 		{
		 			driver.navigate().back();
		 		}
				
			
				Thread.sleep(8000);
				rp.getReviewData().click();
				Thread.sleep(3000);
				rp.getCreateRev().click();
				rp.getRevName().sendKeys(UserName);
				rp.getRevStartDate().click();
				rp.getRevStartMon(mon);
		 		rp.getRevStartYear(year);
		 		System.out.println(dtf.format(now));
		 		
		 	   
		 		
		 		//driver.findElement(By.xpath("//span[contains(text(),'19')]")).click();
		 		//div[@aria-label='Monday, June 12, 2023']/span
		 		rp.getRevEndDate().click();
		 		rp.getRevEndMon(mon);
		 		rp.getRevEndYear(year);
		 		driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
		 		
		 		rp.getNext().click();
		 		rp.getNext().click();
		 		
		 		try{
		 			if(driver.findElement(By.xpath("//span[contains(text(),'mukheem shaik')]")).isDisplayed())
		 			{
		 				System.out.println("Inactive User also Shown the Contributors Users List");
		 			}
		 			
		 		}catch (Exception e)
		 		{
		 			System.out.println("Inactive User Can Not Visible In The Contributors Users List");
		 		}
				
		 		logOut();
				
			
		 		
		 		
		 		
		 		//TC09_Make the any of the AD User Inactive And Verify in User Tab Only Shown Active Users	
				
				
				System.out.println("TC09_Make the any of the AD User Inactive And Verify in User Tab Only Shown Active Users");
				
				
				CreateReviewTest.CreateAReview();
				
				Thread.sleep(10000);
				erp.getMenuBtn().click();
				Thread.sleep(3000);
				rp.getUserLicenseAct_InAct().click();
			
				Thread.sleep(5000);
				rp.getUserLicenseEdit().click();
				Thread.sleep(5000);
				rp.getADUserStatusEdit().click();
				rp.getUserSave().click();
				Thread.sleep(3000);
				for(int i=0;i<=3;i++)
		 		{
		 			driver.navigate().back();
		 		}
				
			
				Thread.sleep(8000);
				rp.getReviewData().click();
				Thread.sleep(3000);
				rp.getCreateRev().click();
				rp.getRevName().sendKeys(UserName);
				rp.getRevStartDate().click();
				rp.getRevStartMon(mon);
		 		rp.getRevStartYear(year);
		 		System.out.println(dtf.format(now));
		 		
		 	   
		 		
		 		//driver.findElement(By.xpath("//span[contains(text(),'19')]")).click();
		 		//div[@aria-label='Monday, June 12, 2023']/span
		 		rp.getRevEndDate().click();
		 		rp.getRevEndMon(mon);
		 		rp.getRevEndYear(year);
		 		driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
		 		
		 		rp.getNext().click();
		 		rp.getNext().click();
		 		
		 		try{
		 			if(driver.findElement(By.xpath("//span[contains(text(),'AD1001')]")).isDisplayed())
		 			{
		 				System.out.println("Inactive User also Shown the Contributors Users List");
		 			}
		 			
		 		}catch (Exception e)
		 		{
		 			System.out.println("Inactive User Can Not Visible In The Contributors Users List");
		 		}
				
		 		logOut();
				
			}
		 	
				
		
	 	
	 
}
