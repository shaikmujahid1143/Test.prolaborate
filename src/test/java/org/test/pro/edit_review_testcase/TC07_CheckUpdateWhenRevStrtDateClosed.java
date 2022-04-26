package org.test.pro.edit_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.test.pro.create_review_testcase.CreateReviewTest;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RandomDates_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC07_CheckUpdateWhenRevStrtDateClosed extends LoginPage
{ 
	public static EditRev_Page erp;
	public static String mon="Apr";
	public static String year="2022";
	public static RandomDates_Page rdp;
	public static String RevName= "Shaik Mujahiddin";
	public static String RevNotes= "Automation Testing";
	public static RevActiveAndVerifyStartDate_Page rap;
	
	@Test
	public static void UpdateRevDateOnClosed() throws InterruptedException, IOException
	{    
		
		erp=new EditRev_Page();
		rdp=new RandomDates_Page();
		rap=new RevActiveAndVerifyStartDate_Page();
		CreateReviewTest.CreateAReview(); 
		
 		Thread.sleep(8000);
		erp.getMenuBtn().click();
		Thread.sleep(3000);
		erp.getReviews().click();
		Thread.sleep(10000);
		
		rdp.getrevChangeStatus().click();
		Thread.sleep(3000);
		rdp.getchkBoxStatus().click();
		rdp.getrevChangeStatus().click();
		rdp.getRevOnClosed().click();
		Thread.sleep(5000);
		
		try
		{
			if(rap.getRevClosed().isDisplayed())
			{
				String text=rap.getRevClosed().getText();
				System.out.println("The Status of Review Is Successfully Updated To:"+text);
			}
		}catch(Exception e)
		{
			System.out.println("The Status of Review Is Failed To Update Closed");
		}
		
		
		Thread.sleep(15000);
		erp.getclickExistRev().click();
		
		erp.getEditRev().click();
		
		try{
		rp.getRevStartDate().click();
		rp.getRevStartMon(mon);
		rp.getRevStartYear(year);
		driver.findElement(By.xpath("//span[contains(text(),'15')]")).click();
		if(rp.getRevStartDate().isDisplayed())
		{
			System.out.println("CLosed Review Start Date Is Not Grayed And Able to Edit the Date");
		}}catch(Exception e)
		{
			System.out.println("CLosed Review Start Date Is Grayed And Unable to Edit the Date");
		}
		
		
		logOut();
		
	
	
	

}}
