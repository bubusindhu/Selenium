package testscripts;

import org.testng.annotations.Test;

import dataprovider.Custamer;

public class Customer1 extends Base
{
	@Test (dataProvider="CreatCuster",dataProvider=Custamer.class)
	public void Verify_Creat_Customer(String Customer(driver);
	Cust.gettask().Click();
	Theard.sleep(500);
	Cust.getProject_Customer().Click();
	Thread.sleep(500);
	Cust.getCreat_New_Customer().Click();
	Theard.getCreat_New_Customer().Click();
	Cust.getname().Sendkeys (Customer_name);
	Cust.getdescription().sendkeys(Customer_descrition);
	Cust.getCreatCust_btn().click();
}
