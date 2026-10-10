package Testing.Pallavi_automation;

import java.util.List;
import java.util.Iterator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dataentry {

	public static void main(String[] args) throws InterruptedException
	{
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open the website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Enter Name
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pallavi");
		
		// Enter Email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("pallavi@gmail.com");
		
		// Enter Phone
		driver.findElement(By.xpath("//input[@placeholder='Enter Phone']")).sendKeys("1234567788");
		
		// Address
		driver.findElement(By.xpath("//textarea[@class='form-control']")).sendKeys("Ranjangoan");
		
		// Gender
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		// Days
	    //Handling multiple webelement
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkbox' and @class='form-check-input']"));
		
		Iterator<WebElement> it=checkboxes.iterator();
		
		while(it.hasNext())
		{
			WebElement check=it.next(); //Sunday Monday
			check.click();//Clicked on Sunday Clicked another day
			Thread.sleep(1000);
		}
		
		
		
		
	}

}
