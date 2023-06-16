package home_Module;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pomRepo.HomePage;
import pomRepo.LoginPage;

public class ToVerifyHomePage {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demo.actitime.com/login.do");
	
	LoginPage login=new LoginPage(driver);
	
	/*login.usernameTextField.sendKeys("admin");
	login.passwordTextField.sendKeys("manager");
	login.loginButton.click();*/
	
	login.loginAction("admin", "manager");
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
	wait.until(ExpectedConditions.titleContains("Enter"));
	
	String homepageTitle = driver.getTitle();
	
	if(homepageTitle.contains("Enter"))
	{
		System.out.println("Pass:the tittle has been verified");
	}
	
	else
	{
		System.out.println("Fail:the title has not been verified");
	}
	
	HomePage home=new HomePage(driver);
	home.logoutAction();
	
	}

}
