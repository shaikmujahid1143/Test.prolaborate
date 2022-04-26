package org.test.pro.edit_review_testcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.test.pro.create_review_testcase.CreateReviewTest;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC23_CheckEditAndDisableEmailNotification extends LoginPage
{
	
	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;


	 	@Test
		public static void emialNotificationDisable() throws InterruptedException, IOException
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
	 		
			WebElement emailChkbox=rp.getemailNotificationChkBox();
			emailChkbox.click();
			Thread.sleep(3000);
			emailChkbox.click();
		
			
			if(emailChkbox.isSelected())
			{
				
			System.out.println("Failed to Disabled the Email Notifiactions");
			}else
			{
				System.out.println("Successfully  to Disabled the Email Notifiactions");	
			}
			Thread.sleep(5000);
			logOut();
	
	
	
		}

}
