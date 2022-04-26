package Base.Prolaborate;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass

{ public static WebDriver driver;

public static String url="http://localhost/Account/Login?";
	
	
	
	
   @BeforeTest
   public static void LaunchApp(){

//   String browser  {
//	switch ( browser)
//	{
//	
//
//     case "chrome":
//     	WebDriverManager.chromedriver().setup();
//     	driver=new ChromeDriver();
//     	System.out.println("Successfully Launch the ChromeBrowser");
//     	driver.get(url);
//     	break;
//     	
//     case "firefox":
//    	 WebDriverManager.firefoxdriver().setup();
//     	driver=new FirefoxDriver();
//     	System.out.println("Successfully Launch the FirefoxBrowser");
//     	driver.get(url);
//     	break;
//     	
//     case "IE":
//     	WebDriverManager.iedriver().setup();
//     	driver=new InternetExplorerDriver();
//     	System.out.println("Successfully Launch the InternetExplorerBrowser");
//     	driver.get(url);
//     	break;
//     	default:
//     		break;
//     }}}
    
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.get(url);
     }
		
		
	
//public void Loadconfig() 
//{try{
//	prop=new Properties();
//	System.out.println("Super Constructor Invoked");
//	FileInputStream ip=new FileInputStream(System.getProperty("user.dir")+"\\Configuration\\config.properties");
//	prop.load(ip);
//	System.out.println("driver:"+driver);
//	DesiredCapabilities d=new DesiredCapabilities();
//		d.setBrowserName("browser");
//		d.setPlatform(Platform.WINDOWS);
//		URL huburl=new URL("http://192.168.240.229:4444/wd/hub");
//		RemoteWebDriver r=new RemoteWebDriver(huburl, d);
//	r.get(url);	

		
		
//	}catch(FileNotFoundException e)
//	{
//		e.printStackTrace();
//	}catch(IOException e)
//	{
//		e.printStackTrace();
//	}}
//	
//	public static void LaunchApp()
//	{
//		WebDriverManager.chromedriver().setup();
//		String brName=prop.getProperty("browser");




	
	//@AfterTest
	public static void CloseApp()
	{
		driver.quit();		
		System.out.println("Successfully Closed the Browser");
	}

	
	
	
	


	
	

}
