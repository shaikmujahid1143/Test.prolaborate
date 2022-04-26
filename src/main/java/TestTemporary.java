import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTemporary

{public static WebDriver driver;
	
	
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("http://localhost/Account/Login?");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@prolaborate.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Welcome@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[2]/table/tbody/tr[1]/td[1]/app-datatables-name/div/span[1]/a/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='dropdownManual']/fa-icon")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-repository-layout/app-header/header/div[1]/div/app-searchdropdown/div/div/div[2]/div/div[2]/div[2]/div[2]/div[5]/div[1]/a/div[1]")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'ArchiMate 3.1')]")).click();
		Thread.sleep(3000); 
		driver.findElement(By.xpath("//span[contains(text(),'Default Profile')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Application')]")).click();
		Thread.sleep(3000);
		Actions a=new Actions(driver);
		
		driver.findElement(By.xpath("/html/body/app-root/app-repository-layout/div/div/div/div/div/div[1]/app-mdg-profiles-stereotype-config-page/app-mdg-profiles-stereotype-config/div/div[1]/div/div[2]/app-collapse[1]/div/div[1]/button/span[2]")).click();
		
		WebElement src=driver.findElement(By.xpath("//*[@id='BasicAttributes']/div/div[1]"));
		WebElement dst=driver.findElement(By.xpath("//app-mdg-profiles-stereotype-config/div/div[1]/div/div[1]/div/div/div/div/div[2]"));
		a.moveToElement(src).clickAndHold().build().perform();
		
		
		a.dragAndDrop(src,dst).build().perform();
		
		
		
		
		
		
	}

}
