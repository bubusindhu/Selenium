package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		WebElement un=driver.findElement(By.name("username"));
		WebElement pwd=driver.findElement(By.name("pwd"));
		WebElement lgn=driver.findElement(By.id("loginbutton"));
		un.sendKeys("amin");
		pwd.sendKeys("manager");
		lgn.click();
		WebElement users=driver.findElement(By.xpath("//a[@class='item active']"));
		Actions act=new Actions(driver);
		act.moveToElement(users).perform();
		act.contextClick().perform();
		
		
		
		

	}

}
