package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	@Test
	public void demo()
	{
		String a="abc";
		String b="abc";
		
		Assert.assertEquals(a,b);
		System.out.println("Pass");
	}

}
