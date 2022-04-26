package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC18_19_CheckUpdateRevNotYetStartToEditRevStrtDate extends LoginPage
{
	
	
	 public static String Upmon="Apr";
	 public static String Upyear="2022";
	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;


	 
	 
	 	@Test
		public static void UpdateRevNotYetStartToEdit() throws InterruptedException, IOException
		{
	 		
	 		erp=new EditRev_Page();
	 		rap=new RevActiveAndVerifyStartDate_Page();
	 		NotYetStartedTest.NotYetStartRev();
	 		
	 		WebElement NotYetTo=rp.getNotYetToStartRev();
	 		String NotYetToRev=NotYetTo.getText();
	 		try
			{
				if(NotYetTo.isDisplayed())
				{
					
				System.out.println("The Status of Review Is Successfully Updated To:"+NotYetToRev);
				}
			}catch(Exception e)
			{
				System.out.println("The Status of Review Is Failed To Update Active:"+NotYetToRev);
			}
	 		
			Thread.sleep(10000);
			rap.EdtDeleIcon.click();
			Thread.sleep(10000);
			rap.EditIcon.click();
			Thread.sleep(3000);
			WebElement date=rp.getRevStartDate();
			if(date.isDisplayed())
			{
			date.click();
	 		rp.getRevStartMon(Upmon);
	 		rp.getRevStartYear(Upyear);
	 		driver.findElement(By.xpath("//span[contains(text(),'28')]")).click();
	 		date.click();
	 		rp.getApprStartDate().click();
			rp.getApprStartMon(Upmon);
			rp.getApprStartYear(Upyear);
			
			driver.findElement(By.xpath("//span[contains(text(),'30')]")).click();
	 	
	 		System.out.println("Not Yet Start Review Status Able To Update the Review Start Date And Approval Start Date");
			}
			else
			{
				System.out.println("Not Yet Start Review Status Unable To Update the Review Start Date And Approval Start Date");
			}
			rp.getNext().click();
			Thread.sleep(3000);
			rp.getNext().click();
			Thread.sleep(3000);
			erp.getupdateRev().click();
			Thread.sleep(10000);
			logOut();
			

}}
