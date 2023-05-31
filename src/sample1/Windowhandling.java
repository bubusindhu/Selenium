package sample1;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Windowhandling {

	public static void main(String[] args) 
	{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.makemytrip.com/");
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.untill(ExpectedConditions.visibilityOf(driver.findElement(By.xpath())));
	
	
	
	

}
}