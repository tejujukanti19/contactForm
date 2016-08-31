package contactForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NumberOfLinks 
{
	@Test
	public  void links() throws InterruptedException 
	{
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.mycontactform.com/samples.php");
		
		
		int numOfLinks = driver.findElements(By.xpath("//a[starts-with(@href,'https://')]")).size();
        System.out.println(numOfLinks);
        for(int i=0; i<numOfLinks; i++)
        {
            driver.findElements(By.xpath("//a[starts-with(@href,'https://')]")).get(i).click();
            driver.navigate().back();
            Thread.sleep(2000);
        }

		

	}

}
