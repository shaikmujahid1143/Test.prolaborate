/**
 * 
 */
package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

/**
 * @author IdeapadG3-03
 *
 */
public class TC01_CheckEditRevName extends LoginPage
{	
	
	public static String mon="Jul";
	public static String year="2023";
	public static EditRev_Page erp;
	public static String RevNotes= "Automation Testing purpose";
	public static RevActiveAndVerifyStartDate_Page rap;
	
	 
	
	
	@Test
	public static void ChangeRevName() throws InterruptedException, IOException
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
		Thread.sleep(10000);
		rap.EditIcon.click();
		Thread.sleep(3000);;
		rp.getRevName().clear();
		rp.getRevName().sendKeys("Mujahiddin");
		Thread.sleep(5000);
		rp.getNext().click();
		Thread.sleep(3000);
		rp.getNext().click();
		erp.getupdateRev().click();
		Thread.sleep(8000);
		
		Thread.sleep(3000);
		
		WebElement chngRevName=erp.getclickExistRev();
		String updateRevName=chngRevName.getText();
			if(chngRevName.isDisplayed())
				
			{chngRevName.click();
		System.out.println("Successfully Updated the Review Name:"+updateRevName);
			}
			else
		{
			System.out.println("Failed to Update the Review Name:");
		}
			Thread.sleep(5000);
		logOut();
		
		}  

}
