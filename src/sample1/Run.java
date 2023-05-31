package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		WebElement un=driver.findElement(By.name("username"));
		
		Thread.sleep(3000);
		WebElement pwd=driver.findElement(By.name("pwd"));
		
		Thread.sleep(3000);
		WebElement lgn=driver.findElement(By.id("loginButton"));
		
	
	}
}
