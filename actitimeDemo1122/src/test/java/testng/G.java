package testng;

import org.testng.annotations.Test;

public class G {
	
	@Test(groups="regression")
	public void sentMail()
	{
		System.out.println("the user has sent mail");
	}
	
	@Test(groups="smoke")
	public void logout()
	{
		System.out.println("the user has logged out");
	}

}
