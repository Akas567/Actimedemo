package actitimeDemo1122.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class {

	public static void main(String[] args)  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.id("APjFqb")).sendKeys("Holi hai");
         driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]")).click();
		String tittle = driver.getTitle();
		System.out.println(tittle);
		driver.close();

	}

}
