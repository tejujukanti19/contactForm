package contactForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RadioButton
{
		@Test
		public static void SelectRadio()
		{
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
		
			driver.get("https://www.mycontactform.com/samples.php");
			
			driver.findElement(By.xpath("//input[@type='radio']")).click();
			

	}

}
