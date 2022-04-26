package Pageobject.prolaborate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Prolaborate.BaseClass;

public class RevActiveAndVerifyStartDate_Page extends BaseClass
{
	//Elements
	
	@FindBy(xpath="(//span[contains(text(),'Active')])[1]")
	public WebElement RevActive;
	
	@FindBy(xpath="(//span[contains(text(),'Closed')])[1]")
	public WebElement RevClosed;
	
	@FindBy(xpath="(//span[contains(text(),'On Hold')])[1]")
	public WebElement revHold;
	
	
	
	@FindBy(xpath="//div/div[1]/app-review-management-single-card/div/div[2]/app-dropdown/div/a/span")
	public WebElement EdtDeleIcon;
	
	

	@FindBy(xpath="(//span[contains(text(),'Delete')])[1]")
	public WebElement DeleIcon;
	
	

	@FindBy(xpath="(//span[contains(text(),'Edit')])[1]")
	public WebElement EditIcon;
	
	
	@FindBy(xpath="(//div[@class='disable-section form-group m-0'])[1]")
	public WebElement DisableDate;
	
	@FindBy(xpath="//input[@id='reviewWorkFlow']")
	public WebElement ApprChkBox;
	
	

	
	//Functions
	
	public WebElement getRevActive() {
		return RevActive;
	}
	public WebElement getRevClosed() {
		return RevClosed;
	}
	
	public WebElement getrevHold() {
		return revHold;
	}
	
	public WebElement getEdtDeleIcon() {
		return EdtDeleIcon;
	}
	
	
	public WebElement getDeleIcon() {
		return DeleIcon;
	}
	
	public WebElement getEditIcon() {
		return EditIcon;
	}
	
	public WebElement getDisableDate() {
		return DisableDate;
	}
	
	public WebElement getApprChkBox() {
		return ApprChkBox;
	}


	
	public RevActiveAndVerifyStartDate_Page()
	{
		PageFactory.initElements(driver, this);
	}
	

}
