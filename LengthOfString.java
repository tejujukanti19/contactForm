package contactForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LengthOfString 
{
	@Test
	public  void Length() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://www.mycontactform.com/samples.php");
	    
		driver.findElement(By.id("subject")).sendKeys("web driver class");
		Thread.sleep(3000);
		driver.findElement(By.id("subject")).clear();
		driver.findElement(By.id("subject")).sendKeys("web driver");
		
		String len= driver.findElement(By.id("subject")).getAttribute("type");
		System.out.println(len);

	}

}
