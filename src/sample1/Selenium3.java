package sample1;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

	private static final String Fileutils = null;

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver ();
		driver.get("http://localhost/login.do");
		WebElement un=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		WebElement lgn=driver.findElement(By.id("loginButton"));
		
	    un.sendKeys("admin");
	    pwd.sendKeys("manager");
	    lgn.click();
	   
	    File src=un.getScreenshotAs(OutputType.FILE);
	    File dest=new File("c\\selinium.screenshot\\un.png");
	    Fileutils.copyFile(src,dest);
	
	
		
	}

}
