package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RandomDates_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC06_CheckApprEndDateBeforeApprStartDate extends LoginPage

{
	
	public static String RevName= "Shaik Mujahiddin";
	public static String mon= "Apr";
	public static String year= "2022";
	public static RandomDates_Page rdp;
	public static RevActiveAndVerifyStartDate_Page rap;
	public static EditRev_Page erp; 

	
	
	
	
	
	@Test
	public void ApprEndDateBfrApprStrtDate() throws InterruptedException, IOException
	{
		
 	
 		rap=new RevActiveAndVerifyStartDate_Page();
 		erp=new EditRev_Page();
 		rdp=new RandomDates_Page();
 		CreateReviewTest.CreateAReview(); 
 		Thread.sleep(8000);
		erp.getMenuBtn().click();
		Thread.sleep(3000);
		erp.getReviews().click();
		Thread.sleep(10000);
		rap.EdtDeleIcon.click();
		Thread.sleep(10000);
		rap.EditIcon.click();
		Thread.sleep(3000);
 		rp.getApprEndDate().click();
 		
		

 		
 		rp.getApprEndMon(mon).click();
 		rp.getApprEndYear(year).click();
 		driver.findElement(By.xpath("//span[contains(text(),'15')]")).click();
 		Thread.sleep(5000);
 		String wrnMsg=rdp.getapprWarningMsg().getText();
 		try
 		{
 			if(rdp.getapprWarningMsg().isDisplayed())
 		{
 			System.out.println("When Updating The Review End Date Before Review Start Date It Shown Warning Message:"+wrnMsg);
		
 		}}catch (Exception e)
 		
 		{
 			
 			
 			System.out.println("Successfully Updated The Review End Date Before Review Start Date:"+wrnMsg);
 		}
 		
		
		
//        
//		
//		
		
	
		Thread.sleep(5000);
		logOut();
}}
