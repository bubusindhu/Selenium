package testscripts;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Pagefacctory.Login;

public class Annotation 
{
	
	WebDriver driver=null;
	
	@BeforeMethod()
	public void login()
	{
	Login lgn=new Login(driver);
	lgn.username().sendKeys("admin");
	lgn.password().sendKeys("manager");
	lgn.loginButton().click();
	}
	
	@AfterMethod
	public void logout() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@id='logoutLink']")).click();
		Thread.sleep(1000);
	}
	@BeforeClass
	public void launchbrowser()
	{
		driver =new ChromeDriver();
		driver.get("http://localhost/login.do");
		System.out.println("launch_brower");
	}
	@AfterClass
	public void closebrower()
	{
		driver.close();
		System.out.println("close_brower");
		
	}
	@BeforeTest
	public void dbconnection()
	{
		System.out.println("dbconnection");
		
	}
	@AfterTest
	public void closedbconnection()
	{
		System.out.println("closedbconnection");
	}

	}
	
	


