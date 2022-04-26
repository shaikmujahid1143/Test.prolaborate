package org.test.pro.create_review_testcase;




import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;





public class CreateReviewTest extends LoginPage

{public static String UserName= "Shaik Mujahiddin";
 public static String mon= "Apr";
 public static String year= "2022";
 public static String RevNotes= "Automation Testing";
 public static RevActiveAndVerifyStartDate_Page rap;
 public static EditRev_Page erp;
 public static DateTimeFormatter dtf;


 

 	@Test
	public static void CreateAReview() throws InterruptedException, IOException
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
 		
 		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
 	    LocalDateTime now = LocalDateTime.now();
 	    System.out.println(dtf.format(now));
 		
 		//driver.findElement(By.xpath("//span[contains(text(),'19')]")).click();
 		//div[@aria-label='Monday, June 12, 2023']/span
 		rp.getRevEndDate().click();
 		rp.getRevEndMon(mon);
 		rp.getRevEndYear(year);
 		driver.findElement(By.xpath("//span[contains(text(),'26')]")).click();
 		Thread.sleep(5000);
 		rap.getApprChkBox().click();
 		rp.getApprStartDate().click();
 		rp.getApprStartMon(mon).click();
 		rp.getApprStartYear(year);
 		
// 		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
 //	    LocalDateTime current = LocalDateTime.now();
 	//		    System.out.println(dtf.format(now));
 		
 		driver.findElement(By.xpath("//span[contains(text(),'27')]")).click();
 		rp.getApprEndDate().click();
 		rp.getApprEndMon(mon).click();
 		rp.getApprEndYear(year).click();
 		driver.findElement(By.xpath("//span[contains(text(),'28')]")).click();
		Thread.sleep(5000);
		rp.getDescription().sendKeys(RevNotes);
		rp.getNext().click();
		rp.getSelectAll().click();
		rp.getitemDropDown().click();
		
		rp.getItem1().click();
		rp.getItem2().click();
		rp.getItem3().click();
		rp.getItem4().click();
		//rp.getSelectRevItems().click();
		rp.getNext().click();
		Thread.sleep(3000);
		//Select contributor 
		List<WebElement> addCon=driver.findElements(By.xpath("//div[@class='contributor-strip d-flex align-items-center p-2 rounded']"));
	    try{
		for(int i=0;i<addCon.size();i++)
			
		{
			
			addCon.get(i).click();
			rp.getAddCon().click();
		}
		System.out.println(addCon.size());
		}catch (Exception e)
		{
			System.out.println("Array Out Of Bound Exception");
		}
		rp.getSelectRole1().click();
		rp.getSelectRoleRev().click();
		
		rp.getSelectRole2().click();
		rp.getSelectRoleRev().click();
		
		rp.getSelectRole3().click();
		rp.getSelectRoleAppr().click();
		
		Thread.sleep(3000);
		
		rp.getSelectRoleModerator().click();
		rp.getCreateRevSaveButton().click();
		rp.getOpenRev().click(); 
		Thread.sleep(10000);
		
		
		
		
		
		
		//logOut();
		
		
		
		
		}
	
//	@Test(priority=1)
//	public static void EditRev() throws InterruptedException{
//		lp.getRepoName().click();
//		Thread.sleep(3000);
//		Thread.sleep(2000);
//		lp.getMenuBtn().click();
//		
//		
//		lp.getChangeRev().click();
//	}
//	
//	
	
	
	
	
	

}