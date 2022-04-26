package org.test.pro.edit_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.pro.create_review_testcase.CreateReviewTest;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RandomDates_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC09_CheckUpdateWhenRevStrtEndDateOnHold extends LoginPage
{

	public static EditRev_Page erp;
	public static String mon="Apr";
	public static String year="2022";
	public static RandomDates_Page rdp;
	public static String RevName= "Shaik Mujahiddin";
	public static String RevNotes= "Automation Testing";
	public static RevActiveAndVerifyStartDate_Page rap;

	
	@Test
	public static void UpdateRevDateOnHold() throws InterruptedException, IOException
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
		rdp.getRevOnHold().click();
		
		Thread.sleep(5000);
		
		try
		{
			if(rap.getrevHold().isDisplayed())
			{
				String text=rap.getrevHold().getText();
				System.out.println("The Status of Review Is Successfully Updated To:"+text);
			}
		}catch(Exception e)
		{
			System.out.println("The Status of Review Is Failed To Update On Hold");
		}
		
		
		Thread.sleep(15000);
		erp.getclickExistRev().click();
		
		
		erp.getEditRev().click();
		
		WebElement date=rp.getRevStartDate();
		if(date.isDisplayed())
		{
		date.click();
		rp.getRevStartMon(mon);
		rp.getRevStartYear(year);
		driver.findElement(By.xpath("//span[contains(text(),'16')]")).click();
		//div[@aria-label='Monday, June 12, 2023']/span
		rp.getRevEndDate().click();
		rp.getRevEndMon(mon);
		rp.getRevEndYear(year);
		driver.findElement(By.xpath("//span[contains(text(),'18')]")).click();
	
		System.out.println("On Hold Review Status Able To Update the Review Start Date And End Date");
		}
		else
		{
			System.out.println("On Hold Review Status Unable To Update the Review Start Date And End date");
		}
		logOut();
		
		
	
}}
