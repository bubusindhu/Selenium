package sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Paytm {

	private static WebElement consumer;

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		WebElement paytm_consumer =driver.findElement(By.xpath("//a[@class='content users_selected selected']//div//img"));
		Actions act=new Actions(driver);
		act.moveToElement(paytm_consumer).perform();
		WebElement tickets=driver.findElement(By.xpath("//a[@class='content users_selected selected']//div//img"));
		act . moveToElement(tickets).perform();
	}

}
