package org.test.pro.create_review_testcase;


import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Base.Prolaborate.LoginPage;
import Pageobject.prolaborate.EditRev_Page;

public class SelectReviewItem_TC extends LoginPage
{
	 public static EditRev_Page erp;
	 public static Actions act;
	
	@Test
	public static void SelectReview() throws InterruptedException, IOException
	{
		login("Admin");
 		erp=new EditRev_Page();
 		act=new Actions(driver);
 		
 		Thread.sleep(8000);
 		rp.getRepoName().click();
 		Thread.sleep(10000);
		erp.getMenuBtn().click();
		Thread.sleep(3000);
		rp.getSections().click();
		
		
		
		
		rp.getExPackageScroll().click();
		Thread.sleep(3000);
	WebElement AllType=driver.findElement(By.xpath("//app-tree/p-tree/div/div/ul/p-treenode/li/ul/p-treenode[1]/li/div"));
	WebElement dest=driver.findElement(By.xpath("//div[@class='p-panel-titlebar drop h-100']"));
		
	int width=dest.getSize().getWidth();
	System.err.println(width);
	//act.clickAndHold(AllType).moveToElement(dest).release(dest).build().perform();
	act.clickAndHold(AllType).pause(Duration.ofSeconds(2)).
	moveToElement(dest).pause(Duration.ofSeconds(2)).release(dest).build().perform();
		
	
	

	
	
	

}}
