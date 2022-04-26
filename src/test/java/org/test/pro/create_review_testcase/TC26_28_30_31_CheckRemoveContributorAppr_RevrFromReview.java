package org.test.pro.create_review_testcase;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC26_28_30_31_CheckRemoveContributorAppr_RevrFromReview extends LoginPage
{

		public static RevActiveAndVerifyStartDate_Page rap;
		 public static EditRev_Page erp;
		 public static String userName="NewName";
	
	
		 	@Test
			public static void ConDelToReviewerAndVerify() throws InterruptedException, IOException
			{
		 		
		 		
				erp=new EditRev_Page();
		 		rap=new RevActiveAndVerifyStartDate_Page();
		 	
		 		for(int i=0;i<2;i++)
				{
		 		
		 		CreateReviewTest.CreateAReview();
		 		
		 		
		 		Thread.sleep(8000);
				erp.getMenuBtn().click();
				Thread.sleep(2000);
				erp.getReviews().click();
				Thread.sleep(8000);
				rap.EdtDeleIcon.click();
				Thread.sleep(3000);
				rap.EditIcon.click();
				Thread.sleep(3000);
				
				Thread.sleep(3000);;
				rp.getRevName().clear();
				rp.getRevName().sendKeys(userName);
				
				rp.getNext().click();
				rp.getNext().click();
				
//				rp.getinviteContributor().click();
//				driver.findElement(By.xpath("//input[@placeholder='Enter Email of an user']")).sendKeys("mukeem@mail.com");
//				driver.findElement(By.xpath("//div[@class='modal-footer p-0 mt-3 position-relative']//app-button-theme[@class='ng-star-inserted']//app-button//button[@type='button']")).click();
//			
				Thread.sleep(2000);
				
			if(i==0)
				{
				
					DeleteAllContributors(3);  //Mention Index of the Contributor to Delete 
				}else
				{
					AddAllContributors(3);   //Mention Index of the Contributor to Add 
				}
			
				
				
				

 	 			erp.getupdateRev().click();
 	 			driver.navigate().refresh();
 	 			
 	 			
 	 			Thread.sleep(5000);
 	 			
 	 			
 	 			logOut();
				
 	 			//Reviewer Login For verifying the Review Is Visible Or Not
 	 			
 	 			login("Reviewer");
 	 			Thread.sleep(3000);
 	 			
 	 			rp.getnotificationBox().click();
 	 			
 	 			if(driver.findElement(By.xpath("//a[1]//span[1]//span[2]//small[1]")).getText().contains("Mujahiddin"))
 	 			{
 	 				System.out.println("Review Invitation Received in notification");
 	 			}else
 	 			{
 	 				System.out.println("No Review Invitation Received  in notification");
 	 			}
 	 			
 	 			
 	 			Thread.sleep(8000);
				erp.getMenuBtn().click();
				Thread.sleep(2000);
				erp.getReviews().click();
				Thread.sleep(3000);
				driver.navigate().refresh();
				
				WebElement RevUName=rp.getRevName();
				
				try{
					erp.getclickExistRev().click();
			 	
		 		if(RevUName.getText().contains("New"))
				{
		 		System.out.println("After Addition Of Reviewer In Review Process But It Be Visible To The Reviewer");
		 		}}catch (Exception e)
		 	
		 		{
		 			System.out.println("After Removal Of Reviewer In Review Process Is Not Visible To The Reviwer");
		 		}
				
				logOut();
				
				
 	 			
				
					
				//Approver Login For verifying the Review Is Visible Or Not
				
				login("Approver");
				

 	 			rp.getnotificationBox().click();
 	 			
 	 			if(driver.findElement(By.xpath("//a[1]//span[1]//span[2]//small[1]")).getText().contains("Mujahiddin"))
 	 			{
 	 				System.out.println("Review Invitation Received in notification");
 	 			}else
 	 			{
 	 				System.out.println("No Review Invitation Received  in notification");
 	 			}

				
				Thread.sleep(8000);
				erp.getMenuBtn().click();
				Thread.sleep(2000);
				erp.getReviews().click();
				
				driver.navigate().refresh();
				
				WebElement apprName=rp.getRevName();
				try{
					
					erp.getclickExistRev().click();
		 		if(apprName.getText().contains("New"))
				{
		 		System.out.println("After Addition Of Approver In Review Process But It Be Visible To The Reviewer");
		 		}}catch (Exception e)
		 	
		 		{
		 			System.out.println("After Removal Of Approver In Review Process Is Not Visible To The Reviwer");
		 		}
				
				logOut();
			}
			}
		 	
		 	
		 	
		 	private static void DeleteAllContributors(int i)
		 	
		 	{
		 		List<WebElement> delCon=driver.findElements(By.xpath("//div[@class='review-delete-class pl-3']"));
				
				try{
				for( i=0;i<delCon.size();i++)
				{
					delCon.get(i).click(); //Mention Index of the Contributor to Delete 
					
				}}catch (Exception e)
				{
					System.out.println("Array Out Of Bound Exception");
				}
		 	}
		 	
		 		private static void AddAllContributors(int i)
		 	
		 	{
		 			List<WebElement> addCon=driver.findElements(By.xpath("//div[@class='contributor-strip d-flex align-items-center p-2 rounded']"));
				    
		 			try{
					for( i=0;i<addCon.size();i++)
					{
						addCon.get(i).click();
						rp.getAddCon().click();
					}}catch (Exception e)
					{
						System.out.println("Array Out Of Bound Exception");
					}
					
		 	}	
		 	
		 	
		 			
		 	
}

//List<WebElement> addCon=driver.findElements(By.xpath("//div[@class='contributor-strip d-flex align-items-center p-2 rounded']"));
//try{
//for(int i=0;i<addCon.size();i++)
//{
//	addCon.get(i).click();
//	rp.getAddCon().click();
//}}catch (Exception e)
//{
//	System.out.println("Array Out Of Bound Exception");
//}
//
//System.out.println(addCon.size());



//List<WebElement> delCon=driver.findElements(By.xpath("//div[@class='review-delete-class pl-3']"));
//System.out.println("No. of Contributors:"+" "+delCon.size());
//try{
//for(int i=0;i<delCon.size();i++)
//{
//	delCon.get(i).click(); //Mention Index of the Contributor to Delete 
//	
//}}catch (Exception e)
//{
//	System.out.println("Array Out Of Bound Exception");
//}

