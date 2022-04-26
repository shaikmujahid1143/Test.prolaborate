package org.test.pro.create_review_testcase;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC24_25_CheckRevItemsAddAndDeleteToReviewer extends LoginPage
{

	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;


	 	@Test
		public static void RevItemsAddDelToReviewer() throws InterruptedException, IOException
		{
	 		
	 		
			erp=new EditRev_Page();
	 		rap=new RevActiveAndVerifyStartDate_Page();
	 		CreateReviewTest.CreateAReview();
	 		Thread.sleep(3000);
	 		
	 		logOut();
	 		login("Reviewer");
	 		for(int i=0;i<=1;i++)
		 		{
		 			if(i==0)
		 		{
	 		
	 		//Added Items and Verifying in Reviewer Items List
			
	 		
//	 		for(int i=0;i<=1;i++)
//	 		{
//	 			if(i==0)
//	 		{
	 		Thread.sleep(5000);
			erp.getMenuBtn().click();
			Thread.sleep(3000);
			erp.getReviews().click();
			Thread.sleep(10000);
			erp.getclickExistRev().click();
			
			Thread.sleep(5000);
			WebElement items=rp.getItemsListCheck();
			items.click();
			
			WebElement item2=driver.findElement(By.xpath("//div[text()='Element Properties']"));
			WebElement item3=driver.findElement(By.xpath("//div[text()='All Type Of Diagram']"));
		
			String item2Name=item2.getText();
			String item3Name=item3.getText();
			
				if(item2.isDisplayed() && item3.isDisplayed())
					{
						System.out.println("The Status Of Contributor Reviwer have been Added items successfully:"+" 1. "+ item2Name + " 2. "+item3Name);
						
					}else
					{
						System.out.println("The Status Of Contributor Reviwer have been Removed items successfully:"+ " 1. "+item2Name +" 2. "+ item3Name);
					
					}
				
	 		
	 		}
		 			else
		 				{
		 				
		 				Thread.sleep(5000);
		 	 			erp.getMenuBtn().click();
		 	 			Thread.sleep(3000);
		 	 			erp.getReviews().click();
		 	 			Thread.sleep(10000);
		 	 			rap.getEdtDeleIcon().click();
		 	 			Thread.sleep(5000);
		 	 			rap.getEditIcon().click();
		 	 			Thread.sleep(3000);
		 	 			rp.getNext().click();
		 	 			Thread.sleep(3000);
		 	 			rp.getremoveItem2().click();
		 	 			Thread.sleep(3000);
		 	 			rp.getremoveItem3().click();
		 	 			Thread.sleep(3000);
		 	 			rp.getNext().click();
		 	 			Thread.sleep(5000);
		 	 			erp.getupdateRev().click();
		 	 			Thread.sleep(5000);
		 	 			erp.getclickExistRev().click();
		 	 			
		 	 			Thread.sleep(10000);
		 				
		 				try{
		 	 			WebElement item2=driver.findElement(By.xpath("//div[text()='Element Properties']"));
		 				WebElement item3=driver.findElement(By.xpath("//div[text()='All Type Of Diagram']"));
		 			
		 				String item2Name=item2.getText();
		 				String item3Name=item3.getText();
		 				Thread.sleep(5000);
		 				WebElement items=rp.getItemsListCheck();
		 				items.click();
		 					if(items.equals(item3Name) && items.equals(item2Name))
		 						{
		 							System.out.println("The Status Of Contributor Reviwer have been Added items successfully:"+" 1. "+ item2Name + " 2. "+item3Name);
		 							
		 						}}catch(Exception e)
		 						{
		 							System.out.println("The Status Of Contributor Reviwer have been Removed items successfully");
		 						
		 						}
		 				
		 				}
		 		}}}
		 				
		 		
	 		
	 		
	 		
			
	 		
	 
		

