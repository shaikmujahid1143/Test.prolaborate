/**
 * 
 */
package org.test.pro.edit_review_testcase;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

/**
 * @author IdeapadG3-03
 *
 */
public class TC03_CheckApprDateWhenRevStartAlone extends LoginPage
{
	 public static String RevName= "Shaik Mujahiddin";
	 public static String mon= "Jun";
	 public static String year= "2023";
	 public static String RevNotes= "Automation Testing";
	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;
	
	 
	 
	 
	 
	@Test
	 
	public static void RevWithSepApprovprocess() throws InterruptedException, IOException
	{
	login("Admin");
	rap=new RevActiveAndVerifyStartDate_Page();
	erp=new EditRev_Page();
	rp.getRepoName().click();
	Thread.sleep(3000);
	rp.getReviewData().click();
	rp.getCreateRev().click();
	rp.getRevName().sendKeys(RevName);
	rp.getRevStartDate().click();
	rp.getRevStartMon(mon);
	rp.getRevStartYear(year);
	driver.findElement(By.xpath("//span[contains(text(),'16')]")).click();
	//div[@aria-label='Monday, June 12, 2023']/span
	rp.getRevEndDate().click();
	rp.getRevEndMon(mon);
	rp.getRevEndYear(year);
	driver.findElement(By.xpath("//span[contains(text(),'17')]")).click();
	Thread.sleep(5000);
	rp.getDescription().sendKeys(RevNotes);
	rp.getNext().click();
	rp.getSelectAll().click();
	rp.getSelectRevItems().click();
	rp.getNext().click();
	Thread.sleep(3000);
	//Select contributor 
	String[] SelCon={"//div[contains(text(),'Shaik Mujahid')]","//div[contains(text(),'shaik.mujahid@prolaborate.com')]","//div[contains(text(),'Mohamed  Nisarudeen A')]"};
	try{
	for(int i=0;i<=SelCon.length;i++)
	{
        driver.findElement(By.xpath(SelCon[i])).click();
		
		rp.getAddCon().click();
	
	}}catch(Exception e)
	{
		System.out.println("Array Index out of Bound Exception ");
	}
	rp.getSelectRole1().click();
	rp.getSelectRoleAppr().click();//Approver Role
	Thread.sleep(5000);
	
	rp.getSelectRole2().click();
	rp.getSelectRoleRev().click(); //Reviewer Role
	Thread.sleep(5000);
	
	rp.getSelectRole3().click();
	rp.getSelectRoleRev().click();
	Thread.sleep(5000);
	
	rp.getSelectRoleModerator().click();//Moderator Role
	rp.getCreateRevSaveButton().click();
	rp.getOpenRev().click(); 
	
	Thread.sleep(12000);
	erp.getEditRev().click();
	Thread.sleep(5000);           
	
	rap.getApprChkBox().click();
	
	try{
		
		
		if(rap.getApprChkBox().isSelected())
		{
		System.out.println("Approver Date CheckBox is Enabled And Its Able to Update the Date");
		}
	}catch(Exception e)
	{
		System.out.println("Approver Date CheckBox is Disabled And Unable to Edit the Date");
	}
	
	
	Thread.sleep(8000);
	
	
	
	
	logOut();
	
	
	}

}
