/**
 * 
 */
package Base.Prolaborate;

import java.io.IOException;

import Pageobject.prolaborate.CreateRev_Page;

/**
 * @author IdeapadG3-03
 *
 */
public class LoginPage extends BaseClass
{
	
	public static CreateRev_Page rp; 
	
	public static String xlfile="C:\\Users\\IdeapadG3-03\\workspace\\Review_Prolaborate\\UserTestData\\Prolaborate_UserTestData (1).xlsx";
	public static String xlsheet="sheet1";
	
	
	public static void login(String user) throws InterruptedException, IOException
	{   
		
		rp=new CreateRev_Page();
	
		switch (user) 
		{
		case "Admin":
			
			rp.getUname().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 1, 3));
			rp.getPword().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 1, 4));
			rp.getSignin().click();
			System.out.println("Successfully Login the 'Admin' Profile");
			break;
		
		case "Moderator":
		
			rp.getUname().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 2, 3));
			rp.getPword().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 2, 4));
			rp.getSignin().click();
			System.out.println("Successfully Login the 'Moderator' Profile");
			
			break;
			
		
			
		case "Approver":
			
			rp.getUname().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 3, 3));
			rp.getPword().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 3, 4));
			rp.getSignin().click();
			System.out.println("Successfully Login the 'Approver' Profile");
			break;
		
		case "Reviewer":
			
			rp.getUname().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 4, 3));
			rp.getPword().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 4, 4));
			rp.getSignin().click();
			System.out.println("Successfully Login the 'Reviewer' Profile");
			
		case "InviteContributor":
			
			rp.getUname().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 5, 3));
			rp.getPword().sendKeys(XLdata.getStringCellData(xlfile, xlsheet, 5, 4));
			rp.getSignin().click();
			System.out.println("Successfully Login the 'Reviewer' Profile");
			break;
			
		default:
			System.out.println("Failed To Login the Profile");
			
			break;
		}
		
	}
		
		
	
		
	
	public static void logOut() throws InterruptedException
	{
		rp.getProfile().click();
		Thread.sleep(3000);
		rp.getSignout().click();
		System.out.println("Successfully LogOut the Profile");
		
	}

}
 