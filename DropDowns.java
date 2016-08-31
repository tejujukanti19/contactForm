package contactForm;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDowns 
{
	
	@Test
	public  void Drops() throws InterruptedException
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.mycontactform.com/samples.php");
		
		Select dd1= new Select(driver.findElement(By.id("q3")));
		dd1.selectByIndex(2);
		Thread.sleep(3000);
		dd1.selectByValue("Second Option");
		Thread.sleep(3000);
		dd1.selectByVisibleText("Third Option");
		Thread.sleep(3000); 

	}

}
