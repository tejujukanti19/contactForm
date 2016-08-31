package contactForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Login 
{
	@Test
	public  void CheckLogin()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.mycontactform.com/samples.php");
		
		 driver.findElement(By.id("user")).sendKeys("username");
	      driver.findElement(By.id("pass")).sendKeys("password");
	      driver.findElement(By.className("btn_log")).click();
		

	}

}
