package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.RandomDates_Page;

public class TC05_CheckRevEnddateUpdateBeforeRevStartDate extends LoginPage
{
	public static String RevName= "Shaik Mujahiddin";
	public static String mon= "Apr";
	public static String year= "2022";
	public static RandomDates_Page rdp;
	
	
	
	@Test
	public void RevEndDateBeforeStartDate() throws InterruptedException, IOException
	{
		login("Admin");
		rdp=new RandomDates_Page();
		Thread.sleep(8000);
		rp.getRepoName().click();
		Thread.sleep(3000);
		rp.getReviewData().click();
		rp.getCreateRev().click();
		rp.getRevName().sendKeys(RevName);
		
		rp.getRevEndDate().click();
		rp.getRevEndMon(mon);
		rp.getRevEndYear(year);
		
		driver.findElement(By.xpath("//span[contains(text(),'10')]")).click();
		String wrnmsg=rdp.getrevWarningMsg().getText();
		
		
		boolean errmsg=rdp.getrevWarningMsg().isDisplayed();
			
		if(errmsg){
		System.out.println("Updating Review End Date Before Review Start Date But Shown Warning Message:"+errmsg+":"+wrnmsg);
		errmsg=true;
		}
			else
		{
		System.out.println("Successfully Updated Review End Date Before Review Start Date");
		errmsg=false;
		}
		
		
		Thread.sleep(5000);
		logOut();
	}

}
