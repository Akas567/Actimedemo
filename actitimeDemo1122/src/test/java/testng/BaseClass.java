package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	@BeforeSuite
	public void bs()
	{
		System.out.println("Data base connection should be esablished");
	}
	@BeforeClass
	public void bc()
		{
			System.out.println("The browser has been launched");
			System.out.println("The url has been launched");
		}
		@BeforeMethod
		public void bm()
			{
				System.out.println("Logged into the application");
			}
			
	@AfterMethod
	public void am()
	{
	System.out.println("Logged out from the application");
	}
	@AfterClass
	public void as()
	
   {
	System.out.println("The data connection has been closed");	
	}
				
			}
		
		
