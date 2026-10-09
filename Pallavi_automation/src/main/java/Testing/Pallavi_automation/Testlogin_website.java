package Testing.Pallavi_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Testlogin_website {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		
		//Enter username
		driver.findElement(By.id("username")).sendKeys("student");
		
		// Enter password
		driver.findElement(By.id("password")).sendKeys("Password123");
		
		//click submit
		driver.findElement(By.id("submit")).click();
		
	}

}
