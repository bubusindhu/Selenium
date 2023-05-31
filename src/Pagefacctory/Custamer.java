package Pagefacctory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.Return;

public class Custamer 
{
	WebDriver driver;
	@FindBy (xpath="//a[@class='content tasks']//img[@class='sizer']")
	private WebElement tast;
	
	@FindBy(xpath="//a[normalize-space()='Projects & Customers']")	
	private WebElement project_Custamer;
	
	@FindBy(xpath="//span[normalize-space()='Create Customer']")
	private WebElement creat_newCustamer;
	
	@FindBy(xpath="//input[@name='name']")
	private WebElement name;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement description;
			
	@FindBy(xpath="//input[@name='createCustomerSubmit']")
	private WebElement creatCustamer;
	
	public WebElement gettask()
	{		
		return tast;
	}
	public WebElement getproject_custamer()
	{
		return project_Custamer;
	}
	public WebElement getCrate_New_custamer()
	{	
	return creatCustamer;
	}
	public WebElement getname()
	{
		return name;
	}
	public WebElement getdescription()
	{
		return description;
	}
	public WebElement getCustamer_btn()
	{
		return getCustamer_btn();
	}
	public Custamer(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}	
		
	}
	
