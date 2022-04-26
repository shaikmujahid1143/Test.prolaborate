package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class Fill_TC10_CheckRevCreatedSetSameApprSatrtEndDateButAfterRevEndDate extends LoginPage
{

	public static String UserName= "Shaik Mujahiddin";
	 public static String mon= "Apr";
	 public static String year= "2022";
	public static EditRev_Page erp;
	public static RevActiveAndVerifyStartDate_Page rap;
	
	
	@Test
	public static void setSameApprStart_EndDateAfterRevEndDate () throws InterruptedException, IOException
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
		driver.findElement(By.xpath("//span[contains(text(),'27')]")).click();
		Thread.sleep(3000);
		rap.getApprChkBox().click();
		rp.getApprStartDate().click();
		rp.getApprStartMon(mon).click();
		rp.getApprStartYear(year);
		driver.findElement(By.xpath("//span[contains(text(),'28')]")).click();
		rp.getApprEndDate().click();
		rp.getApprEndMon(mon).click();
		rp.getApprEndYear(year).click();
		driver.findElement(By.xpath("//span[contains(text(),'28')]")).click();
		
		rp.getNext().click();
		Thread.sleep(2000);
		rp.getNext().click();
		Thread.sleep(2000);
		rp.getCreateRevSaveButton().click();
		WebElement revCreatedMsg=rp.getrevCreatedMsg();
		String MsgTxt=revCreatedMsg.getText();
		if(revCreatedMsg.isDisplayed())
		{
			System.out.println("Successfully Created the Review With Same Approver Start Date And End Date But After Review End Date:"+" "+MsgTxt);
		}
		else
		{
			System.out.println("Failed To Create the Review With Same Approver Start Date And End Date But After Review End Date"+" "+MsgTxt);
		}
	}
}
