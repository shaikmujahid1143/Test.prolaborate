package org.test.pro.create_review_testcase;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;

public class Fill_TC01__CheckSaveUserNameAndVerify extends LoginPage
{
	public static String UserName= "Shaik Mujahiddin";
	public static EditRev_Page erp;
	
	@Test
	public static void SaveRevAndVerifyUserName() throws InterruptedException, IOException
	{
 		erp=new EditRev_Page();
 		CreateReviewTest.CreateAReview();
 		
 		Thread.sleep(10000);
 		Thread.sleep(3000);
		erp.getMenuBtn().click();
		Thread.sleep(3000);
		erp.getReviews().click();
		
 		WebElement UName=erp.getclickExistRev();
 		String RevUName=UName.getText();
 		if(UName.isDisplayed())
		{
 		System.out.println("Successfully Saved  Review with the Given User Name:"+RevUName);
 		}
 		else
 		{
 			System.out.println("Failed to Save Review with the Given User Name:"+RevUName);
 		}
 		Thread.sleep(5000);
 		logOut();
 		
 		

}
}