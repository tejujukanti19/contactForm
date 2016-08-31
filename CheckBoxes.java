package contactForm;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxes 
{
	@Test
	public void Check()
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.mycontactform.com/samples.php");
		
		driver.findElement(By.xpath("html/body/div[3]/div[3]/form/table/tbody/tr[1]/td/div/input")).click();
		

	}

}
