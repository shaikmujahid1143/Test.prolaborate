package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class IncompleteRevTest extends LoginPage


{
	 public static String RevName= "Shaik Mujahiddin";
	 public static String mon= "Apr";
	 public static String year= "2022";
	 public static String RevNotes= "Automation Testing";
	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;


	 
	 
	 	@Test
		public static void IncompleteReview() throws InterruptedException, IOException
		{
	 		
			
	 	    login("Admin");
	 		erp=new EditRev_Page();
	 		rap=new RevActiveAndVerifyStartDate_Page();
	 		rp.getRepoName().click();
	 		Thread.sleep(3000);
	 		rp.getReviewData().click();
	 		rp.getCreateRev().click();
	 		rp.getRevName().sendKeys(RevName);
	 		rp.getRevStartDate().click();
	 		rp.getRevStartMon(mon);
	 		rp.getRevStartYear(year);
	 		driver.findElement(By.xpath("//span[contains(text(),'26')]")).click();
	 		//div[@aria-label='Monday, June 12, 2023']/span
	 		rp.getRevEndDate().click();
	 		rp.getRevEndMon(mon);
	 		rp.getRevEndYear(year);
	 		driver.findElement(By.xpath("//span[contains(text(),'27')]")).click();
	 		Thread.sleep(5000);
	 		rap.getApprChkBox().click();
	 		rp.getApprStartDate().click();
	 		rp.getApprStartMon(mon).click();
	 		rp.getApprStartYear(year);
	 		driver.findElement(By.xpath("//span[contains(text(),'27')]")).click();
	 		rp.getApprEndDate().click();
	 		rp.getApprEndMon(mon).click();
	 		rp.getApprEndYear(year).click();
	 		driver.findElement(By.xpath("//span[contains(text(),'28')]")).click();
			Thread.sleep(5000);
			rp.getDescription().sendKeys(RevNotes);
			rp.getNext().click();
			rp.getSelectAll().click();
			
			
			
		//	rp.getSelectRevItems().click();
			rp.getNext().click();
			Thread.sleep(3000);
			//Select contributor 
			String[] SelCon={"//div[contains(text(),'Shaik Mujahid')]","//div[contains(text(),'shaik.mujahid@prolaborate.com')]","//div[contains(text(),'Mohamed  Nisarudeen A')]"};
			try{
			for(int i=0;i<=SelCon.length;i++)
			{
	            driver.findElement(By.xpath(SelCon[i])).click();
				
				rp.getAddCon().click();
			
			}}catch(Exception e)
			{
				System.out.println("Array Index out of Bound Exception ");
			}
			rp.getSelectRole1().click();
			rp.getSelectRoleAppr().click();
			
			rp.getSelectRole2().click();
			rp.getSelectRoleRev().click();
			
			rp.getSelectRole3().click();
			rp.getSelectRoleRev().click();
			
			rp.getSelectRoleModerator().click();
			rp.getCreateRevSaveButton().click();
			rp.getOpenRevList().click(); 

}}
