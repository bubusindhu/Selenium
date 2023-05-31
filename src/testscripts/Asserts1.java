package testscripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Asserts1 extends Annotation

{

	
	

	@Test
	public void verify_customer() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='content tasks']//img[@class='sizer']")).click();//tasks
		driver.findElement(By.xpath("//a[@class='item active']")).click();//create customer 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[normalize-space()='Create Customer']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Makemytrip");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("travelling");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@onclick,'cancelCustomerCreation();')]")).click();
		Thread.sleep(3000);
		sft.assertEquals(msg.getText(),"Customer\"Makemytrip\"has been successfully created.");
	
		
		
		
	}

	
}		
		
	



