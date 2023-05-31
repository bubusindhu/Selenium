package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {

	public static void main(String[] args) throws InterruptedException 
	{
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://localhost/login.do");
			Thread.sleep(3000);
			driver.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(3000);
			driver.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(3000);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.navigate().back();
			Thread.sleep(3000);
			driver.navigate().forward();
			Thread.sleep(3000);
			driver.navigate().refresh();
			

	}

}













































































