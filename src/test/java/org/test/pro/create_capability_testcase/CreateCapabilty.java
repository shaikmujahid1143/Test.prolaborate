package org.test.pro.create_capability_testcase;




import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;





public class CreateCapabilty extends LoginPage

{


 

 	@Test
	public static void CreateAReview() throws InterruptedException, IOException
	{
 		
 		
 		login("Admin");
 		
 		Thread.sleep(8000);
 		rp.getRepoName().click();
 		Thread.sleep(3000);
 		rp.getReviewData().click();
 		Thread.sleep(2000);
 		
 		WebElement create=rp.getCreateRev();
 		String rev=create.getText();
 		
 		if(create.isDisplayed())
 		{
 			System.out.println("From Admin User Account Create Review Is Visibled:"+rev);
 		}else
 		{
 			System.out.println("From Admin User Account Create Review Not Visibled:"+rev);
 		}
 		Thread.sleep(10000);
 		logOut();
 		
 		
 		//TC02_From Non Admin User Accounts Verifying create Review Option Is Visible Or Not
	
 		login("Reviewer");
 		
 		
 		Thread.sleep(5000);
 		rp.getRepoName().click();
 		Thread.sleep(3000);
 		rp.getReviewData().click();
 		Thread.sleep(2000);
 		
 		if(create.isDisplayed())
 		{
 			System.out.println("From Non-Admin User Account Create Review Is Visibled:"+rev);
 		}else
 		{
 			System.out.println("From Non-Admin User Account Create Review Not Visibled:"+rev);
 		}
 		logOut();
 		
	
	
	
	
	
	
	
	
	 
	
	}}








