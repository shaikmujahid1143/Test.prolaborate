package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC29_CheckInviteContributorAndVerifyAddedInReview extends LoginPage
{
	
	
	
	
	public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;
	 public static String userName="NewName";
	 public static String InviteContributorMail="mukeem@mail.com";


	 	@Test
		public static void VerifyingInvitedCoopntributorAdded() throws InterruptedException, IOException
		{
	 		
	 		
			erp=new EditRev_Page();
	 		rap=new RevActiveAndVerifyStartDate_Page();
	 	
	 		
	 		
	 		CreateReviewTest.CreateAReview();
	 		
	 		
	 		Thread.sleep(10000);
			erp.getMenuBtn().click();
			Thread.sleep(3000);
			erp.getReviews().click();
			Thread.sleep(10000);
			rap.EdtDeleIcon.click();
			Thread.sleep(3000);
			rap.EditIcon.click();
			Thread.sleep(3000);
			
			Thread.sleep(3000);;
			rp.getRevName().clear();
			rp.getRevName().sendKeys(userName);
			
			rp.getNext().click();
			rp.getNext().click();
			
			rp.getinviteContributor().click();
			driver.findElement(By.xpath("//input[@placeholder='Enter Email of an user']")).sendKeys(InviteContributorMail);
			driver.findElement(By.xpath("//div[@class='modal-footer p-0 mt-3 position-relative']//app-button-theme[@class='ng-star-inserted']//app-button//button[@type='button']")).click();
		try{
			if(driver.findElement(By.xpath("//span[contains(text(),'mukeem')]")).isDisplayed())
			{
				System.out.println("Sucessfully Invited And Added the Contributor As a Reviewer");
			}
		}catch (Exception e)
		{
			System.out.println("Failed to Invite And Add the Contributor As a Reviewer");
		}
			Thread.sleep(5000);
				
			
			
				erp.getupdateRev().click();
	 			driver.navigate().refresh();
	 			
	 			
	 			Thread.sleep(5000);
	 			
	 			
	 			logOut();
			
	 			//Reviewer Login For verifying the Review Is Visible Or Not
	 			
	 			login("InviteContributor");
	 			Thread.sleep(3000);
	 			
	 			rp.getnotificationBox().click();
	 			
	 			if(driver.findElement(By.xpath("//a[1]//span[1]//span[2]//small[1]")).getText().contains("Mujahiddin"))
	 			{
	 				System.out.println("Review Invitation Received in notification");
	 			}else
	 			{
	 				System.out.println("No Review Invitation Received  in notification");
	 			}

}}
