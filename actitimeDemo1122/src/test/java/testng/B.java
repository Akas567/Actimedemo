package testng;

import org.testng.annotations.Test;

public class B {
	
	
	@Test(priority=10)
	public void akash()
	{
		System.out.println("Name=Akash");
	}
	
	@Test(priority=1)
	public void vikas()
	{
		System.out.println("Name=Vikas");
	}
	@Test(priority=2)
	public void prakash()
	{
		System.out.println("Name=Prakash");
	}
   
}
