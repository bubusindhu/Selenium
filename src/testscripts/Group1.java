package testscripts;

import org.testng.annotations.Test;

public class Group1 
{
	@Test(groups= {"regression","smoke"})
	public void verify_a()
	{
		System.out.println("a test");
		
	}
	@Test(groups= {"regression"})
	
		public void verify_b()
		{
			System.out.println("a test");
		}
	@Test(groups= {"regression","smoke"})
	public void verify_c()
	{
		System.out.println("c test");
	}
	}
	
	


