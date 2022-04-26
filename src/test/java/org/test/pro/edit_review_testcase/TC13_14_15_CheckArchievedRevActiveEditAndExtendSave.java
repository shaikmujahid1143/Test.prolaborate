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

public class TC13_14_15_CheckArchievedRevActiveEditAndExtendSave extends LoginPage
{
	public static EditRev_Page erp;
	public static String mon="Apr";
	public static String year="2022";
	public static RandomDates_Page rdp;
	public static RevActiveAndVerifyStartDate_Page rap;
	

	
	@Test
	public static void UpdateRevArchievedDateActEditave() throws InterruptedException, IOException
	{ 
	

		erp=new EditRev_Page();
		rdp=new RandomDates_Page();
		rap=new RevActiveAndVerifyStartDate_Page();
		
		CreateReviewTest.CreateAReview(); 
		Thread.sleep(5000);
		
		erp.getMenuBtn().click();
		Thread.sleep(3000);
		erp.getReviews().click();
		Thread.sleep(5000);
	
		rdp.getrevChangeStatus().click();
		Thread.sleep(3000);
		rdp.getchkBoxStatus().click();
		rdp.getrevChangeStatus().click();
		rdp.getRevOnClosed().click();
		Thread.sleep(8000);
		
		
		rdp.getrevChangeStatus().click();
		Thread.sleep(3000);
		rdp.getchkBoxStatus().click();
		rdp.getrevChangeStatus().click();
		rdp.getRevOnArchived().click();
		Thread.sleep(3000);
		rp.getFilterDropdown().click();
		Thread.sleep(3000);
		rp.getarchievedRev().click();
		rp.getfilterApply().click();

		Thread.sleep(5000);
		
		try
		{
			if(rp.getachivetext().isDisplayed())
			{
				String text=rp.getachivetext().getText();
				System.out.println("The Status of Review Is Successfully Updated To:"+text);
			}
		}catch(Exception e)
		{
			System.out.println("The Status of Review Is Failed To Update on Archive");
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
 		rp.getRevStartMon(mon);
 		rp.getRevStartYear(year);
 		driver.findElement(By.xpath("//span[contains(text(),'17')]")).click();
 		System.out.println("The Status of Archive Review Is Successfully Updated Reviewer Start Date");
 		//div[@aria-label='Monday, June 12, 2023']/span
 		rp.getRevEndDate().click();
 		rp.getRevEndMon(mon);
 		rp.getRevEndYear(year);
 		driver.findElement(By.xpath("//span[contains(text(),'22')]")).click();
 		System.out.println("The Status of Archive Review Is Successfully Extended Reviewer End Date");
 		Thread.sleep(5000);
 		
 		rp.getApprStartDate().click();
 		rp.getApprStartMon(mon).click();
 		rp.getApprStartYear(year);
 		driver.findElement(By.xpath("//span[contains(text(),'17')]")).click();
 		System.out.println("The Status of Archive Review Is Successfully Updated Approver Start Date");
 		rp.getApprEndDate().click();
 		rp.getApprEndMon(mon).click();
 		rp.getApprEndYear(year).click();
 		driver.findElement(By.xpath("//span[contains(text(),'25')]")).click();
 		System.out.println("The Status of Archive Review Is Successfully Extended Approver End Date");
		}
		else
		{
			System.out.println("Failed to Updated the Archive Reviewer_Approver Start And End Date");
		}
		Thread.sleep(5000);
		rp.getNext().click();
		Thread.sleep(3000);
		rp.getNext().click();
		Thread.sleep(3000);
		erp.getupdateRev().click();
		Thread.sleep(10000);
		logOut();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
}}
