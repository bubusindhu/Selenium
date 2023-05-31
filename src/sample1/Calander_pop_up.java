package sample1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Calander_pop_up {

	private static final String List = null;
	private static final int WebElement = 0;


	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		act.sendKeys("con").perform();
		Thread.sleep(2000);
		
		
		
		
	
				
				
				
		

	}

}
