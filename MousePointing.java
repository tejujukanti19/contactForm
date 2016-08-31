package contactForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MousePointing
{
	@Test
	public  void MouseMove()
	{
		 WebDriver driver = new FirefoxDriver();
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        driver.get("http://www.mycontactform.com/samples.php");
	        
	       Actions act=new Actions(driver);
	       act.moveToElement(driver.findElement(By.linkText("Pricing"))).perform();
	}

}
