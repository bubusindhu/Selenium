package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Custamer extends Base
{
	

	@Test()
	public void Verify_creat_custamer()throws InterruptedException
	{
		Pagefacctory.Custamer cust=new Pagefacctory.Custamer(driver);
	
		Thread.sleep(500);
		cust.gettask().click();
		Thread.sleep(500);
	cust.getproject_custamer().click();
	Thread.sleep(500);
	cust.getCrate_New_custamer().click();
	
	
	Thread.sleep(500);
	cust.getname().sendKeys("Makemytrip");
	Thread.sleep(500);
	cust.getdescription().sendKeys("travelling");
	Thread.sleep(500);
	cust.getCustamer_btn();
	
	}
	
 
	
	
}
			


