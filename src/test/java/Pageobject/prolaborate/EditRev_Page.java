/**
 * 
 */
package Pageobject.prolaborate;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Prolaborate.BaseClass;

/**
 * @author IdeapadG3-03
 *
 */
public class EditRev_Page extends BaseClass

{	//Elements
	
	@FindBy(xpath="//*[@id='dropdownManual']/fa-icon")
	public WebElement menuBtn;
	
	
	@FindBy(xpath="//a//div[contains(text(),'Reviews')]")
	private WebElement Reviews;
	
	@FindBy(xpath="//div[1]/app-review-management-single-card/div/div[2]/h4/span")
	private WebElement clickExistRev;
	
	
	@FindBy(xpath="//span[contains(text(),'Edit Review')]")
	private WebElement EditRev;
	
	

	@FindBy(xpath="//div/app-create-review-all-steps/div/div/div/app-button-theme/app-button/button")
	private WebElement updateRev;
	
	
	@FindBy(xpath="(//span[contains(text(),'Mujahiddin')])[1]")
	private WebElement updateRevDisplay;
//	
//	@FindBy(xpath="//span[@class='action-icon position-relative']")
//	private WebElement ActionIcon;
//	
//	
//	@FindBy(xpath="//div[1]/app-review-management-single-card/div/div[2]/app-dropdown/div/a/span")
//	private WebElement ChangeRev;
	
	
	
	
	
	
	
	//Functions
	
	public WebElement getMenuBtn() {
		return menuBtn; 
	}
	
	public WebElement getReviews() {
		return Reviews; 
	}
	
	public WebElement getclickExistRev() {
		return clickExistRev; 
	}
	
	public WebElement getEditRev() {
		return EditRev; 
	}
	
	public WebElement getupdateRev() {
		return updateRev; 
	}
	
	public WebElement getupdateRevDisplay() {
		return updateRevDisplay; 
	}
	
	
	
//	public WebElement getActionIcon() {
//		return ActionIcon; 
//	}
//	
//	public WebElement getChangeRev(){
//		return ChangeRev;
//	}

	public EditRev_Page()
	{
		PageFactory.initElements(driver, this);
	}

}
