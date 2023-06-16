package testng;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToVerifyHomeePagee extends BaseClasss {
	
	@Test
	public void VerifyHomePage()
	{
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String homepageTittle = driver.getTitle();
		Assert.assertTrue(homepageTittle.contains("Enter"));
		System.out.println("Pass: The home page is verified");
		
		
	}
	
	

}
