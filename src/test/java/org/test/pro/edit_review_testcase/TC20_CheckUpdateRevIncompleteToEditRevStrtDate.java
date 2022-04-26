package org.test.pro.edit_review_testcase;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.test.pro.create_review_testcase.IncompleteRevTest;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class TC20_CheckUpdateRevIncompleteToEditRevStrtDate extends LoginPage
{
	
	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;


	 
	 
	 	@Test
		public static void UpdateRevIncompleteToEdit() throws InterruptedException, IOException
		{
	 		
	 		erp=new EditRev_Page();
	 		rap=new RevActiveAndVerifyStartDate_Page();
	 		IncompleteRevTest.IncompleteReview();
	 		
			Thread.sleep(10000);
			rap.EdtDeleIcon.click();
			Thread.sleep(10000);
			rap.EditIcon.click();
			Thread.sleep(3000);
			rp.getNext().click();
			Thread.sleep(3000);
			rp.getSelectRevItems().click();
			
			WebElement SelectItem=rp.getitemText();
			String addedItem=SelectItem.getText();
			if(SelectItem.isDisplayed())
			{
			
			System.out.println("The Incompete Status of Review Added Items Successfully:"+addedItem);
			}else
			{
			System.out.println("The Incompete Status of Review Failed To Add Items:"+addedItem);
			}
			rp.getNext().click();
			Thread.sleep(3000);
			erp.getupdateRev().click();
			
			Thread.sleep(8000);
			
			try
			{
				if(rap.getRevActive().isDisplayed())
				{
					String ActiveDate=rap.getRevActive().getText();
					System.out.println("The Status of Incomplete Review Is Successfully Updated To:"+ActiveDate);
				}
			}catch(Exception e)
			{
				System.out.println("The Status of Incomplete Review Is Failed To Update Active");
			}
			
			Thread.sleep(10000);
			logOut();
			
		}
}
