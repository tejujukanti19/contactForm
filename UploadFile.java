package contactForm;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class UploadFile
{
	@Test
	public  void uploading() throws IOException
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/samples.php");
		
		
		driver.findElement(By.id("attach4589")).click(); 
		Runtime.getRuntime().exec("C:/Users/jteju/Documents/upload.exe"); 

	}

}
