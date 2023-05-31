package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop2  
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver(); 
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-1.html");
		
		WebElement src1= driver.findElement(By.xpath("//div[@id='dropBox']"));//cat//source

	

		

		
		Actions act=new Actions(driver);
		
	
		act.dragAndDropBy(src1, 200,250).perform();
		
		
		
		
		
		
		
		

	}


		
	}


