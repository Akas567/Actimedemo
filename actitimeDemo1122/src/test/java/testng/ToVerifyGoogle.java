package testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToVerifyGoogle{


@Test
	public void toVerifyGoogle()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com");
		
		if(driver.getTitle().equals("Google"))
		{
			System.out.println("Pass:The tittle is verified");
		}
		else
			System.out.println("Fail:The tittle is not verified");
	}

}
