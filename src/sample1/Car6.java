package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Car6 
{

	private static final String id = null;

	public static void main(String[] args) throws InterruptedException

	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");	
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("login Button")).click();
		
	
	
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	Thred.sleep(3000);
	System.out.println(driver.getWindowHandle());
	Thread.sleep(3000);
	driver.switchTo().window(id);
	
	
	
		
	
	
}

	

		
	}
