package testng;

import org.testng.annotations.Test;

public class F {
	
	@Test(groups="smoke")
	public void signup()
	{
		System.out.println("The user has signed up");
	}
	
	@Test(groups="smoke")
	public void signIn()
	{
		System.out.println("The user has signed In");
	}
	@Test(groups="regression")
	public void compose()
	{
		System.out.println("the user has composed");
	}

}
