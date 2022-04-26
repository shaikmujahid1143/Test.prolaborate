package org.test.pro.edit_review_testcase;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.test.pro.create_review_testcase.CreateReviewTest;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC27_CheckModeratorCantEditAndRemoveRevCreator extends LoginPage
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
		 		
		 		login("Moderator");
 	 			
 	 			Thread.sleep(8000);
				erp.getMenuBtn().click();
				Thread.sleep(2000);
				erp.getReviews().click();
				Thread.sleep(8000);
				rap.EdtDeleIcon.click();
				Thread.sleep(3000);
				rap.EditIcon.click();
				Thread.sleep(3000);
				rp.getNext().click();
				rp.getNext().click();
				
				WebElement del=rp.getdeleteConAdmin();
				
				try{
					
				if(del.isEnabled())
				{
					del.click();
					System.out.println("Succeefully Remove the Review Creator");
				}}catch (Exception e)
				{
					System.out.println("Failed to Remove the Review Creator because Disabled the Remove Option");
				}
				
//				//TC_Check Review Edit And Add COntributor And Verify
//				
//				List<WebElement> addCon=driver.findElements(By.xpath("//div[@class='contributor-strip d-flex align-items-center p-2 rounded']"));
//			    try{
//				for(int i=0;i<addCon.size();i++)
//				{
//					addCon.get(i).click();
//					rp.getAddCon().click();
//				}}catch (Exception e)
//				{
//					System.out.println("Array Out Of Bound Exception");
//				}
				
				
				
				
				
				
				
				
				
				
				
		 		

}}
