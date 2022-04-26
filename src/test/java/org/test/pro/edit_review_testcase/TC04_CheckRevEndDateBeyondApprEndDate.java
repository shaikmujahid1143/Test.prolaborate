package org.test.pro.edit_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.pro.create_review_testcase.CreateReviewTest;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC04_CheckRevEndDateBeyondApprEndDate extends LoginPage
{
	 public static String mon= "Apr";
	 public static String year= "2022";
	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;
	
	

	 	@Test
		public static void RevEndDateBeyondApprEndDate() throws InterruptedException, IOException
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
			Thread.sleep(8000);
			rap.EditIcon.click();
			Thread.sleep(10000);
			
			
	 		WebElement day=rp.getRevEndDate();
	 		
	 		
	 		if(day.isDisplayed())
	 		{day.click();
	 		Thread.sleep(3000);
	 		rp.getRevEndMon(mon);
	 		rp.getRevEndYear(year);
	 		WebElement date=driver.findElement(By.xpath("//span[contains(text(),'25')]"));
	 		String Update=date.getText();
	 		System.out.println("Review Date Is Able to Update Beyond the Approval End Date:"+Update);
	 		}
	 		else
	 		{
				System.out.println("Review Date Unable to Update Beyond the Approval End Date");
	 		}
	 		Thread.sleep(6000);
	 		
	 		logOut();
	 		
//	 		
	 		}
	
}