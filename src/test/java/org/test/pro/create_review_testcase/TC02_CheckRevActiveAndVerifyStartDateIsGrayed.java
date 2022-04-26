/**
 * 
 */
package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

/**
 * @author IdeapadG3-03
 *
 */
public class TC02_CheckRevActiveAndVerifyStartDateIsGrayed extends LoginPage

{
	public static RevActiveAndVerifyStartDate_Page rap;
	public static EditRev_Page erp;
	public static String mon= "Apr";
	public static String year= "2022";

	
	@Test
	public static void revActive() throws InterruptedException, IOException
	{
		
		erp=new EditRev_Page();
		rap=new RevActiveAndVerifyStartDate_Page();
		CreateReviewTest.CreateAReview();
//		rp.getRepoName().click();
		Thread.sleep(3000);
		erp.getMenuBtn().click();
		Thread.sleep(3000);
		erp.getReviews().click();
//		Thread.sleep(3000);
//		erp.getclickExistRev().click();
//		Thread.sleep(12000);
//		erp.getEditRev().click();
//		Thread.sleep(5000);
//		rp.getRevStartDate().click();
//		rp.getRevStartMon(mon);
//		rp.getRevStartYear(year);
//		driver.findElement(By.xpath("//span[contains(text(),'14')]")).click();
//		//div[@aria-label='Monday, June 12, 2023']/span
//		rp.getRevEndDate().click();
//		rp.getRevEndMon(mon);
//		rp.getRevEndYear(year);
//		driver.findElement(By.xpath("//span[contains(text(),'16')]")).click();
//		Thread.sleep(5000);
//		rp.getNext().click();
//		Thread.sleep(3000);
//		rp.getNext().click();
//		erp.getupdateRev().click();
		Thread.sleep(10000);
		try
		{
			if(rap.getRevActive().isDisplayed())
			{
				String ActiveDate=rap.getRevActive().getText();
				System.out.println("The Status of Review Is Successfully Updated To:"+ActiveDate);
			}
		}catch(Exception e)
		{
			System.out.println("The Status of Review Is Failed To Update Active");
		}
		Thread.sleep(15000);
		rap.EdtDeleIcon.click();
		Thread.sleep(10000);
		rap.EditIcon.click();
		Thread.sleep(3000);
		String GrayedDate=rap.getDisableDate().getText();
		try
		{	
			rap.getDisableDate().click();
			if(rap.getDisableDate().isDisplayed()){
			System.out.println("Active Review Start Date Is Able to Edit the Date:"+GrayedDate);
			}
			
		}catch(Exception e)
		{
			System.out.println("Active Review Start Date Is Grayed And Unable to Edit the Date"+GrayedDate);
		}
		
		logOut();
		
		
	}
	

}
