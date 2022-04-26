package Pageobject.prolaborate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Prolaborate.BaseClass;

public class RandomDates_Page extends BaseClass


{
	//Elements
	@FindBy(xpath="//span[contains(text(),'End date should not be before Start date')]")
	private WebElement revWarningMsg;
	
	
	
	@FindBy(xpath="//span[contains(text(),'End date should not be earlier than Review End Date')]")
	private WebElement apprWarningMsg;
	
	
	
	
	
	@FindBy(xpath="//span[contains(text(),'Change Status')]")
	private WebElement revChangeStatus;
	
	@FindBy(xpath="(//input[@type='checkbox'])[7]")
	private WebElement chkBoxStatus;
	
	@FindBy(xpath="//span[contains(text(),'Set as On Hold')]")
	private WebElement RevOnHold;
	
	@FindBy(xpath="//span[contains(text(),'Set as Closed')]")
	private WebElement RevOnClosed;
	
	
	
	@FindBy(xpath="//span[contains(text(),'Set as Archived')]")
	private WebElement RevOnArchived;
	
	
	
	
	
	
	
	
	
	
	
	public WebElement getrevWarningMsg() {
	   return revWarningMsg;
	}

	public WebElement getapprWarningMsg() {
		
		   return apprWarningMsg;
		}

	public WebElement getrevChangeStatus() {
		
		   return revChangeStatus;
		}

	public WebElement getchkBoxStatus() {
		
		   return chkBoxStatus;
		}
	
	public WebElement getRevOnHold() {
		
		   return RevOnHold;
		}
	
	public WebElement getRevOnClosed() {
		
		   return RevOnClosed;
		}

	public WebElement getRevOnArchived() {
		
		   return RevOnArchived;
		}








	














	//Functions
	public RandomDates_Page()
	{
		PageFactory.initElements(driver, this);
	}
	

}
