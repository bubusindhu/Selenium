package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Car5 {

	public static void main(String[] args) throws InterruptedException
		{
			WebDriver driver=new ChromeDriver(); 
			driver.get("http://localhost/login.do");
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			//Thread.sleep(3000);
			
			driver.findElement(By.xpath ("//div[normalize-space()='Tasks']")).click();//this line is for TASK
			driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();//this line is for project and customers
			

		}

	}


