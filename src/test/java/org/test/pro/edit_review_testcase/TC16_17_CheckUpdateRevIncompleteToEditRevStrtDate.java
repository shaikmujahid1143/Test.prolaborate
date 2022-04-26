package org.test.pro.edit_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.test.pro.create_review_testcase.IncompleteRevTest;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC16_17_CheckUpdateRevIncompleteToEditRevStrtDate  extends LoginPage
{
	
	
	 public static String mon= "Apr";
	 public static String year= "2022";
	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;


	 
	 
	 	@Test
		public static void UpdateRevIncompleteToEdit() throws InterruptedException, IOException
		{
	 		
	 		erp=new EditRev_Page();
	 		rap=new RevActiveAndVerifyStartDate_Page();
	 		IncompleteRevTest.IncompleteReview();
	 		
	 		WebElement incomplete=rp.getincompleteRev();
	 		String incompleteRev=incomplete.getText();
	 		try
			{
				if(incomplete.isDisplayed())
				{
					
					System.out.println("The Status of Review Is Successfully Updated To:"+incompleteRev);
				}
			}catch(Exception e)
			{
				System.out.println("The Status of Review Is Failed To Update Active:"+incompleteRev);
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
	 		driver.findElement(By.xpath("//span[contains(text(),'18')]")).click();
	 		date.click();
	 		rp.getApprStartDate().click();
			rp.getApprStartMon(mon);
			rp.getApprStartYear(year);
			
			driver.findElement(By.xpath("//span[contains(text(),'18')]")).click();
	 	
	 		System.out.println("Incomplete Review Status Able To Update the Review Start Date And Approval Start Date");
			}
			else
			{
				System.out.println("Incomplete Review Status Unable To Update the Review Start Date And Approval Start Date");
			}
			rp.getNext().click();
			Thread.sleep(3000);
			rp.getNext().click();
			Thread.sleep(3000);
			erp.getupdateRev().click();
			Thread.sleep(10000);
			logOut();
			
			}
		

}
