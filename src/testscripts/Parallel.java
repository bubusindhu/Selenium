package testscripts;

import org.testng.annotations.Test;

public class Parallel 
{
	@Test()
	public void verify_a() throws InterruptedException
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("a:"+i);
			Thread.sleep(500);
		}
	}
		@Test()
	public	void verify_b() throws InterruptedException
		{
			for(int j=11;j<=20;j++)
			{
				System.out.println("b:"+j);
				Thread.sleep(500);
			}
		}
}
