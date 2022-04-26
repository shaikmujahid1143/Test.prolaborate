package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class Fill_TC02_03_04_05_06_07_08_CheckWithoutUserNameAndVerifyErrMsg extends LoginPage
{
	
	public static String UserName= "Shaik Mujahiddin";
	 public static String mon= "Apr";
	 public static String year= "2022";
	public static EditRev_Page erp;
	public static RevActiveAndVerifyStartDate_Page rap;
	
	
	@Test
	public static void SaveRevWithoutUnameAndVerifyUserName() throws InterruptedException, IOException
	{
		login("Admin");
 		erp=new EditRev_Page();
 		rap=new RevActiveAndVerifyStartDate_Page();
 		Thread.sleep(8000);
 		rp.getRepoName().click();
 		Thread.sleep(3000);
 		rp.getReviewData().click();
 		rp.getCreateRev().click();
 		
 		Thread.sleep(3000);
 		
 		rp.getRevStartDate().click();
 		rp.getRevStartMon(mon);
 		rp.getRevStartYear(year);
 		
 		//Tc02__Review start Date Default
 		
 		
 		WebElement RevDefStartDate=driver.findElement(By.xpath("//div[@class='ngb-dp-day ngb-dp-today ng-star-inserted']"));
 		String DefDate=RevDefStartDate.getAttribute("aria-label");
 		RevDefStartDate.click();
 		
 		if(DefDate.contains("2022"))
 		{	
 			
 	 		System.out.println("When Create The Review Start Date Is Set By Default :"+"  "+DefDate);
 	 		}
 	 		else
 	 		{
 	 			System.out.println("When Create The Review Start Date Is Not Set BY Default"+"  "+DefDate);
 	 		}
 		
 		rp.getNext().click();
 		
 		//TC03__Without UserName Shown Error Message
 		
 		WebElement WUName=rp.getRevUnameErrMsg();
 		String ErrMsg=WUName.getText();
 		
 		if(WUName.isDisplayed())
		{
 		System.out.println("Failed To Save Review without User Name It Shown Error Message:"+"  "+ErrMsg);
 		}
 		else
 		{
 			System.out.println("Successfully to Saved Review without User Name:"+"  "+ErrMsg);
 		}
 		
 		Thread.sleep(5000);
 		
 		//Tc04__Set Review Start Date Before Default (today date)
 		
 		rp.getRevStartDate().click();
 		rp.getRevStartMon(mon);
 		rp.getRevStartYear(year);
 		
 		WebElement earlierDate=driver.findElement(By.xpath("//span[contains(text(),'15')]"));
 		earlierDate.click();
 		
 		rp.getNext().click();
 		
 		WebElement RevPastStartDate=rp.getRevPastStartDate();
 		String revPastDateErrMsg=RevPastStartDate.getText();
 		
 		if(RevPastStartDate.isDisplayed())
		{
 		System.out.println("Failed To Save Review With Earlier Date Than Current Date It Shown Error Message:"+"  "+revPastDateErrMsg);
 		}
 		else
 		{
 			System.out.println("Successfully Saved Review With Earlier Date Than Current Date:"+"  "+revPastDateErrMsg);
 		}
 		
 		Thread.sleep(5000);
 		
 		//Tc05__Check Without Review End Date Verify Error Message
 		
 		WebElement endDate=rp.getendDateErrMsg();
 		String endDateErrMsg=endDate.getText();
 		
 		if(endDate.isDisplayed())
		{
 		System.out.println("Failed To Save Review without End Date It Shown Error Message:"+"  "+endDateErrMsg);
 		}
 		else
 		{
 			System.out.println("Successfully Saved Review without End Date:"+"  "+endDateErrMsg);
 		}
 		
 		Thread.sleep(5000);
 		
 		
 		//Tc06__Check Set Review End Date Prior to Start Date Default Date Verify Error Message
 		
 		rp.getRevEndDate().click();
 		rp.getRevEndMon(mon);
 		rp.getRevEndYear(year);
 		
 		WebElement revEndDate=driver.findElement(By.xpath("//span[contains(text(),'10')]"));
 		revEndDate.click();
 		
 		rp.getNext().click();
 		
 		WebElement endDatePrior=rp.getendDatePriorErrMsg();
 		String endDatePriorErrMsg=endDatePrior.getText();
 		
 		if(endDatePrior.isDisplayed())
		{
 		System.out.println("Failed To Set Review End Date Prior To Start Date It Shown Error Message:"+" "+endDatePriorErrMsg);
 		}
 		else
 		{
 			System.out.println("Successfully Set Review End Date Prior To Start Date:"+" "+endDatePriorErrMsg);
 		}
 		
 		//Tc07__Set Review Same Review Start and End Date  Verify Review is created
 		
 		rp.getRevName().sendKeys(UserName);
 		rp.getRevStartDate().click();
 		rp.getRevStartMon(mon);
 		rp.getRevStartYear(year);
 		driver.findElement(By.xpath("//span[contains(text(),'19')]")).click();
 		//div[@aria-label='Monday, June 12, 2023']/span
 		rp.getRevEndDate().click();
 		rp.getRevEndMon(mon);
 		rp.getRevEndYear(year);
 		driver.findElement(By.xpath("//span[contains(text(),'19')]")).click();
 		
 		
 		//Tc08__Set Review Same Approval Start and End Date  Verify Review is created
 		
 		Thread.sleep(5000);
 		rap.getApprChkBox().click();
 		rp.getApprStartDate().click();
 		rp.getApprStartMon(mon).click();
 		rp.getApprStartYear(year);
 		driver.findElement(By.xpath("//span[contains(text(),'26')]")).click();
 		rp.getApprEndDate().click();
 		rp.getApprEndMon(mon).click();
 		rp.getApprEndYear(year).click();
 		driver.findElement(By.xpath("//span[contains(text(),'26')]")).click();
 			
 	
 		rp.getNext().click();
 		Thread.sleep(2000);
 		rp.getNext().click();
 		Thread.sleep(2000);
 		rp.getCreateRevSaveButton().click();
 		WebElement revCreatedMsg=rp.getrevCreatedMsg();
 		String MsgTxt=revCreatedMsg.getText();
 		if(revCreatedMsg.isDisplayed())
 		{
 			System.out.println("Successfully Created the Review With Same Start And End Date:"+" "+MsgTxt);
 		}
 		else
 		{
 			System.out.println("Failed to Create the Review With Same Start And End Date:"+" "+MsgTxt);
 		}
 		//logOut();
	
	}
}
