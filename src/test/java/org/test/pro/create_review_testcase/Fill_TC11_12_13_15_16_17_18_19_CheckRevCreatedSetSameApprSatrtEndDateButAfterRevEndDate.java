package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class Fill_TC11_12_13_15_16_17_18_19_CheckRevCreatedSetSameApprSatrtEndDateButAfterRevEndDate extends LoginPage
{

	public static String UserName= "Shaik Mujahiddin";
	 public static String mon= "Apr";
	 public static String year= "2022";
	 public static String RevNotes= "Automation Testing";
	 public static String UPRevNotes= "Manual Testing";
	public static EditRev_Page erp;
	public static RevActiveAndVerifyStartDate_Page rap;
	
	
	@Test
	public static void SaveWithoutApprStartDate_verifyErrMsg () throws InterruptedException, IOException
	{
	
	
	login("Admin");
	erp=new EditRev_Page();
	rap=new RevActiveAndVerifyStartDate_Page();
	Thread.sleep(8000);
	rp.getRepoName().click();
	Thread.sleep(3000);
	rp.getReviewData().click();
	rp.getCreateRev().click();
	rp.getRevName().sendKeys(UserName);
	rp.getRevStartDate().click();
	rp.getRevStartMon(mon);
	rp.getRevStartYear(year);
	driver.findElement(By.xpath("//span[contains(text(),'26')]")).click();
	//div[@aria-label='Monday, June 12, 2023']/span
	rp.getRevEndDate().click();
	rp.getRevEndMon(mon);
	rp.getRevEndYear(year);
	driver.findElement(By.xpath("//span[contains(text(),'28')]")).click();
	Thread.sleep(3000);
	rap.getApprChkBox().click();
	rp.getApprEndDate().click();
	rp.getApprEndMon(mon).click();
	rp.getApprEndYear(year).click();
	driver.findElement(By.xpath("//span[contains(text(),'29')]")).click();
	
	rp.getNext().click();
		
		WebElement ApprWithoutStartDate=rp.getApprStrtErrMsg();
		String ApprStrtErrMsg=ApprWithoutStartDate.getText();
		
		if(ApprWithoutStartDate.isDisplayed())
	{
		System.out.println("Failed To Save Review Without Approver Start Date It Shown Error Message:"+"  "+ApprStrtErrMsg);
		}
		else
		{
			System.out.println("Successfully Saved Review Without Approver Start Date:"+"  "+ApprStrtErrMsg);
		}
		
		Thread.sleep(5000);
	
	
	//TC12_Set Without Approval Start Date
	driver.navigate().refresh();
	
	rp.getRevName().sendKeys(UserName);
	rp.getRevStartDate().click();
	rp.getRevStartMon(mon);
	rp.getRevStartYear(year);
	driver.findElement(By.xpath("//span[contains(text(),'26')]")).click();
	//div[@aria-label='Monday, June 12, 2023']/span
	rp.getRevEndDate().click();
	rp.getRevEndMon(mon);
	rp.getRevEndYear(year);
	driver.findElement(By.xpath("//span[contains(text(),'27')]")).click();
	Thread.sleep(3000);
	rap.getApprChkBox().click();
	
	rp.getApprStartDate().click();
	rp.getApprStartMon(mon).click();
	rp.getApprStartYear(year);
	driver.findElement(By.xpath("//span[contains(text(),'28')]")).click();
	rp.getNext().click();
	
	WebElement ApprWithoutEndDate=rp.getApprEndErrMsg();
	String ApprEndErrMsg=ApprWithoutEndDate.getText();
	
	if(ApprWithoutEndDate.isDisplayed())
	{
	System.out.println("Failed To Save Review Without Approver End Date It Shown Error Message:"+"  "+ApprEndErrMsg);
	}
	else
	{
		System.out.println("Successfully Saved Review Without End Start Date:"+"  "+ApprEndErrMsg);
	}
	
	Thread.sleep(5000);
	
	
	//TC13_Set Approval End Date Before Approval Start Date
	
	
	
	rp.getApprEndDate().click();
	rp.getApprEndMon(mon).click();
	rp.getApprEndYear(year).click();
	driver.findElement(By.xpath("//span[contains(text(),'21')]")).click();
	rp.getNext().click();
	

	WebElement ApprEndDatePrior=rp.getApprEndPriorErrMsg();
	String ApprEndPriorErrMsg=ApprEndDatePrior.getText();
	
	if(ApprEndDatePrior.isDisplayed())
	{
	System.out.println("Failed To Save Review Without Approver End Date It Shown Error Message:"+"  "+ApprEndPriorErrMsg);
	}
	else
	{
		System.out.println("Successfully Saved Review Without End Start Date:"+"  "+ApprEndPriorErrMsg);
	}
	
	
	
	//TC15_Check Create Review Without Approval Process(Disable)
	
	rp.getDescription().sendKeys(RevNotes);
	Thread.sleep(3000);
	rap.getApprChkBox().click();
	
	
	rp.getemailNotificationChkBox().click();;
	
	
	rp.getNext().click();
	rp.getNext().click();
	rp.getCreateRevSaveButton().click();
	
	
	WebElement revCreatedMsg=rp.getrevCreatedMsg();
		String MsgTxt=revCreatedMsg.getText();
		if(revCreatedMsg.isDisplayed())
		{
			System.out.println("Successfully Created the Review Without Approver Process:"+" "+MsgTxt);
		}
		else
		{
			System.out.println("Failed To createReview Without Approver Process:"+" "+MsgTxt);
		}
		
		
		
		Thread.sleep(5000);
		
	
		
	
		
	
		
	
		
		//TC17_Check Review Without Description Saved Without Any Errors
		
	rp.getOpenRevList().click(); 
		
//		Thread.sleep(10000);
//		erp.getMenuBtn().click();
//		Thread.sleep(3000);
//		erp.getReviews().click();
		Thread.sleep(3000);
		rap.EdtDeleIcon.click();
		Thread.sleep(10000);
		rap.EditIcon.click();
		Thread.sleep(3000);
		
				if(rp.getDescription().getText().isEmpty())
				{
				System.out.println("The  Review Successfully Saved Without Description");
				}else
				{
				System.out.println("The  Review Failed To Save Without Description");
				}
		
		//TC16_Check Review Description Editing Process		
		
		if(rp.getDescription().isDisplayed())
		{
		rp.getDescription().clear();
		rp.getDescription().sendKeys(UPRevNotes);
		System.out.println("Successfully Added And Edited Description Review");
		}else
		{
		System.out.println("Successfully Added And Edited Description Review");
		}
	
		Thread.sleep(5000);
	
		
		
	
		
		//TC18_Check Review With Inviter Contributor option Is Enabled And Verify
		
		
		Thread.sleep(3000);
		rp.getNext().click();
		Thread.sleep(3000);
		rp.getNext().click();
		Thread.sleep(3000);
		
		WebElement InviteConOption=rp.getinviteContributor();
		
		String inConOpt=InviteConOption.getText();
		try
		{
			if(InviteConOption.isEnabled())
			{
			System.out.println("In Review Enabled Invite Contributor Option When we Edit To Check Invite Contributors:"+inConOpt);
			}
		}catch(Exception e)
		{
			System.out.println("In Review Disabled Invite Reviewer And Approver Invite Contributor Option:"+inConOpt);
		}
		
		
		erp.getupdateRev().click();
		
		
		
		Thread.sleep(5000);
		
		
		//TC19_Check Review With Email Notification Is Enabled And Verify In Edit Review
		
		rap.EdtDeleIcon.click();
		Thread.sleep(5000);
		rap.EditIcon.click();
		Thread.sleep(3000);
		
		WebElement emailChkbox=rp.getemailNotificationChkBox();
		
		
		
		if(emailChkbox.isEnabled())
		{
			
		System.out.println("Successfully Enabled The Email Notification Option And Also Edit In Review");
		}else
		{
			System.out.println("Successfully Disabled The Email Notification Option");	
		}
		Thread.sleep(5000);
	
		
	
	
	}}

