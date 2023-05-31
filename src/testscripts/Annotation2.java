package testscripts;

import org.testng.annotations.Test;

public class Annotation2
{
@Test(priority=1,invocationCount=3)
public void verify_creat_customer() throws InterruptedException
{
	 System.out.println("verify_creat_customer");
	 Thread.sleep(2000);
}
@Test(priority=2,invocationCount=4)
public void verify_delete_customer() throws InterruptedException
{
	System.out.println("verify_delete_customer");
	Thread.sleep(2000);
}
@Test(priority=3)

public void  verify_add_customer() throws InterruptedException
{
	System.out.println(" verify_add_custome");
	Thread.sleep(2000);
}
}
