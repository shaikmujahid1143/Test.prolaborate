package Pageobject.prolaborate;




import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Base.Prolaborate.BaseClass;


public class CreateRev_Page extends BaseClass
{ 
	
	







	public static Select s;
	
	
	
	

	
	
	//Elements
	@FindBy(xpath="//input[@id='email']")
	private WebElement uname;
	
	
	@FindBy(xpath="//input[@id='Password']")
	private WebElement pword;
	
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement signin;
	
	
	@FindBy(xpath="//div[5]/div/div/div[2]/app-dropdown/div/a")
	private WebElement Reviewdata;
	
	
	@FindBy(xpath="//table/tbody/tr[1]/td[1]/app-datatables-name/div/span[1]/a/span")
	private WebElement RepoName;
	
	
	@FindBy(xpath="//div/div[5]/div/div/div[2]/app-dropdown/div/div/div[4]/div/a[2]")
	private WebElement CreateRev;
	
	
	@FindBy(xpath="//div[1]/app-reactiveforminput/input")
	private WebElement RevName;
	
	
	@FindBy(xpath="//div/div[1]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")
	private WebElement RevStartMon;
	
	
	@FindBy(xpath="//div/div[1]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]")
	private WebElement RevStartYear;
	
	
	@FindBy(xpath="//div[1]/div/div[1]/div/app-reactive-date-picker/div/div/div/div[2]/app-button/button")
	private WebElement RevStartDate;
	
	
	@FindBy(xpath="//div/div[1]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[1]")
	private WebElement RevEndMon;
	
	
	@FindBy(xpath="//div/div[1]/ngb-datepicker/div[1]/ngb-datepicker-navigation/ngb-datepicker-navigation-select/select[2]")
	private WebElement RevEndYear;
	
	
	@FindBy(xpath="//div[1]/div/div[2]/div/app-reactive-date-picker/div/div/div/div[2]/app-button/button")
	private WebElement RevEndDate;
	
	
//	@FindBy(xpath="//label[@for='reviewWorkFlow']")
//	private WebElement ApprEnable;
//	
	@FindBy(xpath="//app-reactive-date-picker[@controlname='approveStartDate']//button[@type='button']")
	private WebElement ApprStartDate;
//	
//
	@FindBy(xpath="//select[@title='Select month']")
	private WebElement ApprStartMon;
//	
//	
	@FindBy(xpath="//select[@title='Select year']")
	private WebElement ApprStartYear;
//	
//	
	@FindBy(xpath="//select[@title='Select month']")
	private WebElement ApprEndMon;
//	
//	
	@FindBy(xpath="//select[@title='Select year']")
	private WebElement ApprEndYear;
//	
//	
	@FindBy(xpath="//app-reactive-date-picker[@controlname='approveEndDate']//button[@type='button']")
	private WebElement ApprEndDate;
//	
	@FindBy(xpath="//textarea")
	private WebElement Description;
	
	
	@FindBy(xpath="//app-button-theme/app-button/button")
	private WebElement Next;
	
	
	@FindBy(xpath="//app-checkbox/div/input")
	private WebElement SelectAll;
	
	
	@FindBy(xpath="//div[@class='p-checkbox-box']")
	private WebElement SelectRevItems;
	
	@FindBy(xpath="//div[1]/div/div[3]/app-button-theme/app-button/button/span")
	private WebElement AddCon;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[1]")
	private WebElement SelectRole1;
	
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[2]")
	private WebElement SelectRole2;
	
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[3]")
	private WebElement SelectRole3;
	
	@FindBy(xpath="(//span[@class='ng-arrow-wrapper'])[4]")
	private WebElement SelectRole4;
	
	
	
	
	
	
	@FindBy(xpath="//span[@class='ng-option-label ng-star-inserted'][normalize-space()='Reviewer'][1]")
	private WebElement SelectRoleRev;
	
	
	@FindBy(xpath="//span[normalize-space()='Approver'][1]")
	private WebElement SelectRoleAppr;
	
	
	
	@FindBy(xpath="//span[normalize-space()='None'][1]")
	private WebElement SelectRoleNone;
	
	
	
	@FindBy(xpath="(//label[@for='634dc3b3-abbb-489c-b207-bc81e147878a'])[1]")
	private WebElement SelectRoleModerator;
	
	
	@FindBy(xpath="//app-create-review-all-steps/div/div/div/app-button-theme/app-button/button/span")
	private WebElement CreateRevSaveButton;
	
	
	@FindBy(xpath="//span[normalize-space()='Open Review']")
	private WebElement OpenRev;
	
	@FindBy(xpath="//app-button-theme-bordered[@class='mr-4']//app-button//button[@type='button']")
	private WebElement OpenRevList;
	
	@FindBy(xpath="//app-dropdown/div/a/figure/img")
	private WebElement profile;
	
	
	@FindBy(xpath="//app-dropdown/div/div/div[3]/div/a[4]/span/span[2]/span")
	private WebElement signout;
	
	@FindBy(xpath="//input[@type='checkbox' and @id='invite']")
	private WebElement InviteChkBox;
	
	
	@FindBy(xpath="//app-button-theme[@class='mr-1']//app-button")
	private WebElement inviteContributor;
	


	@FindBy(xpath="//input[@id='notification']")
	private WebElement emailNotificationChkBox;
	
	@FindBy(xpath="//a[@class='dropdown-toggle btn btn-theme-alt']")
	private WebElement FilterDropdown;
	
	@FindBy(xpath="//input[@id='includearchivedreviews']")
	private WebElement archievedRev;
	
	@FindBy(xpath="//span[normalize-space()='Apply']")
	private WebElement filterApply;
	
	
	@FindBy(xpath="(//span[contains(text(),'Archived')])[1]")
	private WebElement achivetext;
	
	
	@FindBy(xpath="//div[@class='right-section']//div[2]")
	private WebElement removeItems;
	
	@FindBy(xpath="(//div[@class='p-checkbox-box'])[2]")
	private WebElement item1;
	@FindBy(xpath="(//div[@class='p-checkbox-box'])[3]")
	private WebElement item2;
	
	@FindBy(xpath="(//div[@class='p-checkbox-box'])[4]")
	private WebElement item3;
	
	@FindBy(xpath="(//div[@class='p-checkbox-box'])[5]")
	private WebElement item4;
	
	@FindBy(xpath="//div[@aria-label='Example Model']//button[@type='button']")
	private WebElement itemsDropDown;
	
	
	@FindBy(xpath="//app-create-review-step-two-right-section/div/div[2]/div/div[1]/div[2]/div/div[2]")
	private WebElement removeItem1;
				
	@FindBy(xpath="//app-create-review-step-two-right-section/div/div[2]/div/div[2]/div[2]/div/div[2]")
	private WebElement removeItem2;
	
	@FindBy(xpath="//app-create-review-step-two-right-section/div/div[2]/div/div[3]/div[2]/div/div[2]")
	private WebElement removeItem3;
	
	@FindBy(xpath="//app-create-review-step-two-right-section/div/div[2]/div/div[4]/div[2]/div/div[2]")
	private WebElement removeItem4;
								
	@FindBy(xpath="//app-reviews-management-page/div/div/app-review-management-cards-list/div[1]/div/div[1]/app-review-management-single-card/div/div[4]/div[2]")
	private WebElement incompleteRev;
	
	@FindBy(xpath="//div[1]/app-review-management-single-card/div/div[4]/div[2]/span")
	private WebElement NotYetToStartRev;
	
	
	@FindBy(xpath="//span[2]/span/span")
	private WebElement itemText;
	
	
	@FindBy(xpath="//div[@class='tooltip-inner']")
	private WebElement disableText;
	
	@FindBy(xpath="//*[@id='ngb-nav-0']/span")
	private WebElement ItemsListCheck;
	
	@FindBy(xpath="	//div[1]/div[1]/div/span/app-validation/span")
	private WebElement RevUnameErrMsg;

	
	@FindBy(xpath="//div[@class='ngb-dp-day ngb-dp-today ng-star-inserted']")
	private WebElement RevDefaultStartDate;
	
	
	@FindBy(xpath="//span[contains(text(),'Review start date should not be earlier than today')]")
	private WebElement RevPastStartDate;
	
	
	@FindBy(xpath="//span[contains(text(),'End Date should not be blank')]")
	private WebElement endDateErrMsg;
	
	@FindBy(xpath="//span[contains(text(),'End date should not be before Start date')]")
	private WebElement endDatePriorErrMsg;
	
	@FindBy(xpath="//div[text()='Review Created Successfully']")
	private WebElement revCreatedMsg;
	
	@FindBy(xpath="//span[text()='Start Date should not be blank']")
	private WebElement ApprStrtErrMsg;
	
	@FindBy(xpath="//span[text()='End Date should not be blank']")
	private WebElement ApprEndErrMsg;
	
	@FindBy(xpath="//span[contains(text(),'End date should not be less than Approve Start date')]")
	private WebElement ApprEndPriorErrMsg;
	
	
	@FindBy(xpath="//button[@class='btn btn-clear text-muted disabled ng-star-inserted']")
	private WebElement deleteConAdmin;
	
	@FindBy(xpath="//div[1]/app-review-management-single-card/div/div[2]/h4/span")
	private WebElement UName;

	@FindBy(xpath="(//strong/fa-icon[@class='ng-fa-icon icon-hover-style'])[3]")
	private WebElement notificationBox;
	
	@FindBy(xpath="//a[contains(text(),'Sections')]")
	private WebElement Sections;
	
	
	@FindBy(xpath="//div[@aria-label='Example Model']/button")
	private WebElement ExPackageScroll;
	
	@FindBy(xpath="//a[normalize-space()='User and License Management']")
	private WebElement UserLicenseAct_InAct;
	
	@FindBy(xpath="//div/div[2]/div/div[3]/app-button-clear")
	private WebElement deleteAllWithAdminCon;

	@FindBy(xpath="//tr[3]/td[8]/app-datatables-action/div/div[1]/app-button-clear/app-button/button/span")
	private WebElement UserLicenseEdit;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement UserSave;
	

	@FindBy(xpath="//*[@id='userStatus']")
	private WebElement UserStatusEdit;
	
	
	@FindBy(xpath="//*[@id='ngb-nav-0-panel']/app-repository-user-list/div[2]/app-datatable/div/p-table/div/div[2]/table/tbody/tr[1]/td[8]/app-datatables-action/div/div[1]/app-button-clear/app-button/button/span")
	private WebElement ADUserStatusEdit;
	
	
	@FindBy(xpath="//a[normalize-space()='General Settings']")
	private WebElement generalSetting;
	
	
	@FindBy(xpath="//div[contains(text(),'Enable')]")
	private WebElement hoveringMsg;
	
	
	
	
	//Functions
	
	public WebElement getUname() {
		return uname;
	}
	
	
	public WebElement getPword() {
		return pword;
	}
	
	
	public WebElement getSignin() {
		return signin;
	}
	
	
	public WebElement getRepoName() {
		return RepoName;
	}
	
	
	public WebElement getReviewData() {
		return Reviewdata;
	}
	
	
	public WebElement getCreateRev(){
		return CreateRev;
	}
	
	
	public WebElement getRevName() {
		return RevName;
	}
	
	//label[@for='reviewWorkFlow']
	
	
//	public WebElement getApprEnable(){
//		return ApprEnable;
//	}
//	
	public WebElement getApprStartMon(String mon){
		s=new Select(ApprStartMon);
		s.selectByVisibleText(mon);
		return ApprStartMon;
	}
//	
//	
	public WebElement getApprStartYear(String year){
		s=new Select(ApprStartYear);
		s.selectByVisibleText(year);
		return ApprStartYear;
	}
//	
//	
	public WebElement getApprStartDate(){
		return ApprStartDate;
	}
//	
//	
	public WebElement getApprEndMon(String mon){
		s=new Select(ApprEndMon);
		s.selectByVisibleText(mon);
		return ApprEndMon;
	}
	
	
	public WebElement getApprEndYear(String year){
		s=new Select(ApprEndYear);
		s.selectByVisibleText(year);
		return ApprEndYear;
	}
//	
//	
	public WebElement getApprEndDate(){
		return ApprEndDate;
	}
	

	public WebElement getRevStartMon(String mon){
		s=new Select(RevStartMon);
		s.selectByVisibleText(mon);
		return RevStartMon;
	}
	
	
	public WebElement getRevStartYear(String year){
		s=new Select(RevStartYear);
		s.selectByVisibleText(year);
		return RevStartYear;
	}
	
	
	public WebElement getRevStartDate(){
		return RevStartDate;
	}
	
	
	public WebElement getRevEndMon(String mon){
		s=new Select(RevEndMon);
		s.selectByVisibleText(mon);
		return RevEndMon;
	}
	
	
	public WebElement getRevEndYear(String year){
		s=new Select(RevEndYear);
		s.selectByVisibleText(year);
		return RevEndYear;
	}
	
	
	public WebElement getRevEndDate(){
		return RevEndDate;
	}
	
	
	public WebElement getDescription(){
		return Description;
	}
	
	
	public WebElement getNext(){
		return Next;
	}
	
	
	public WebElement getSelectAll(){
		return SelectAll;
	}
	
	
	public WebElement getSelectRevItems(){
		return SelectRevItems;
	}
	
	
	public WebElement getAddCon(){
		return AddCon;
	}
	
	
	public WebElement getSelectRoleRev(){
		return SelectRoleRev;
	}
	
	
	public WebElement getSelectRoleAppr(){
		return SelectRoleAppr;
	}
	
	
	public WebElement getSelectRoleModerator(){
		return SelectRoleModerator;
	}
	
	
	public WebElement getSelectRoleNone(){
		return SelectRoleNone;
	}
	
	
	public WebElement getSelectRole1(){
		return SelectRole1;
	}
	
	
	public WebElement getSelectRole2(){
		return SelectRole2;
	}
	
	
	public WebElement getSelectRole3(){
		return SelectRole3;
	}
	
	public WebElement getSelectRole4(){
		return SelectRole4;
	}
	
	
	public WebElement getCreateRevSaveButton(){
		return CreateRevSaveButton;
	}
	
	
	public WebElement getProfile() {
		return profile;
	}
    
	
	public WebElement getSignout() {
		return signout;
	}
    
    
	
	public WebElement getOpenRev(){
		return OpenRev;
	}
    
	public WebElement getOpenRevList(){
		return OpenRevList;
	}
	
	public WebElement getInviteChkBox(){
		return InviteChkBox;
	}
	
	public WebElement getinviteContributor(){
		return inviteContributor;
	}
	
	public WebElement getemailNotificationChkBox(){
		return emailNotificationChkBox;
	}
	
	public WebElement getFilterDropdown() {
		return FilterDropdown;
	}
	
	
	public WebElement getarchievedRev() {
		return archievedRev;
	}
	
	
	public WebElement getfilterApply() {
		return filterApply;
	}

	public WebElement getachivetext() {
		return achivetext;
	}
	
	public WebElement getremoveItems() {
		return removeItems;
	}
	public WebElement getItem1() {
		return item1;
	}
	public WebElement getItem2() {
		return item2;
	}
	public WebElement getItem3() {
		return item3;
	}
	public WebElement getItem4() {
		return item4;
	}
	public WebElement getitemDropDown() {
		return itemsDropDown;
	}
	public WebElement getremoveItem1() {
		return removeItem1;
	}
	
	public WebElement getremoveItem2() {
		return removeItem2;
	}
	
	public WebElement getremoveItem3() {
		return removeItem3;
	}
	
	public WebElement getremoveItem4() {
		return removeItem4;
	}
	
	public WebElement getincompleteRev() {
		return incompleteRev;
	}
	
	public WebElement getNotYetToStartRev() {
		return NotYetToStartRev;
	}
	
	public WebElement getitemText() {
		return itemText;
	}
	
	public WebElement getdisableText() {
		return disableText;
	}
	
	public WebElement getItemsListCheck() {
		return ItemsListCheck;
	}
	
	public WebElement getRevUnameErrMsg() {
		return RevUnameErrMsg;
	}
	public WebElement getRevDefaultSartDate() {
		return RevDefaultStartDate;
	}
	public WebElement getRevPastStartDate() {
		return RevPastStartDate;
	}
	
	public WebElement getendDateErrMsg() {
		return endDateErrMsg;
	}
	
	public WebElement getendDatePriorErrMsg() {
		return endDatePriorErrMsg;
	}
	
	public WebElement getrevCreatedMsg() {
		return revCreatedMsg;
	}
	
	public WebElement getApprEndErrMsg() {
		return ApprEndErrMsg;
	}
	
	public WebElement getApprStrtErrMsg() {
		return ApprStrtErrMsg;
	}
	
	public WebElement getApprEndPriorErrMsg() {
		return ApprEndPriorErrMsg;
	}
	
	public WebElement getdeleteConAdmin() {
		return deleteConAdmin;
	}
	
	public WebElement getUName() {
		return UName;
	}
	
	public WebElement getnotificationBox() {
		return notificationBox;
	}
	
	public WebElement getSections() {
		return Sections;
	}
	
	public WebElement getExPackageScroll() {
		return ExPackageScroll;
	}
	
	public WebElement getUserLicenseAct_InAct() {
		return UserLicenseAct_InAct;
	}
	
	public WebElement getdeleteAllWithAdminCon() {
		return deleteAllWithAdminCon;
	} 
	
	public WebElement getUserLicenseEdit() {
		return UserLicenseEdit;
	} 
	
	public WebElement getUserSave() {
		return UserSave;
	}
	
	public WebElement getUserStatusEdit() {
		return UserStatusEdit;
	}
	
	public WebElement getADUserStatusEdit() {
		return ADUserStatusEdit;
	}
	
	public WebElement getgeneralSetting() {
		return generalSetting;
	}
	
	public WebElement gethoveringMsg() {
		return hoveringMsg;
	}
	
	
	
//	public void loginProlaborate(String username, String password) throws InterruptedException
//	{
//		
//		Thread.sleep(5000);
//		
//	    uname.sendKeys(username);
//	    pword.sendKeys(password);
//	    signin.click();
//
//	}
	public CreateRev_Page() 
    {
	
	PageFactory.initElements(driver, this);
		

	}
	  
	  
	
}
