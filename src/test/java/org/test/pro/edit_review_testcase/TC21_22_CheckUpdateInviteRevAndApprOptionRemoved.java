package org.test.pro.edit_review_testcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.test.pro.create_review_testcase.CreateReviewTest;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC21_22_CheckUpdateInviteRevAndApprOptionRemoved extends LoginPage
{
	
	public static EditRev_Page erp;
	public static String RevNotes= "Automation Testing purpose";
	public static RevActiveAndVerifyStartDate_Page rap;
	
	 
	
	
	@Test
	public static void ChangeDetails() throws InterruptedException, IOException
	{    
		erp=new EditRev_Page();
		rap=new RevActiveAndVerifyStartDate_Page();
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
		rp.getInviteChkBox().click();
		Thread.sleep(3000);
		rp.getNext().click();
		Thread.sleep(3000);
		rp.getNext().click();
		Thread.sleep(3000);
		WebElement InviteConOption=rp.getinviteContributor();
		
		String inConOpt=InviteConOption.getText();
		try
		{
			if(InviteConOption.isDisplayed())
			{
			System.out.println("In Review Removed Invite Reviewer And Approver Invite Contributor Option When we Edit To Check Invite Contributors:"+inConOpt+"  "+"Disabled");
			}
		}catch(Exception e)
		{
			System.out.println("In Review Removed Invite Reviewer And Approver Invite Contributor Option When we Edit To Check Invite Contributors"+inConOpt+"  "+"Enabled");
		}
		
		Thread.sleep(8000);
		
		logOut();
		
		

}}
