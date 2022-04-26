package org.test.pro.create_review_testcase;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;
import Pageobject.prolaborate.RevActiveAndVerifyStartDate_Page;

public class SampleTest extends LoginPage
{

	public static String UserName= "Shaik Mujahiddin";
	 public static String mon= "Apr";
	 public static String year= "2022";
	 public static String RevNotes= "Automation Testing";
	 public static RevActiveAndVerifyStartDate_Page rap;
	 public static EditRev_Page erp;
	 public static DateTimeFormatter dtf;
	 public static Actions act;


	 

	 	@Test
		public static void AddContributorReview() throws InterruptedException, IOException
		{
	
	 		erp=new EditRev_Page();

	 		rap=new RevActiveAndVerifyStartDate_Page();
	 		
	 		
		
		}
	 	
}
