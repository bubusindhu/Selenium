package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Roja 
{

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
	    Thred.sleep(3000);
	    driver.navigate().to("http://localhost/user/submit_tt.do");
	    WebElement user=driver.findElement(By.name("selected userIds"));
	    Select sel=new Select(user);
	    System.out.println(sel.isMultiple());
	    sel.selectByIndex(1);
	    
	    
	}
}
