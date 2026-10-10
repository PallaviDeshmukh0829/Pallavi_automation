package Testing.Pallavi_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CSSselector {

	public static void main(String[] args) throws InterruptedException
	{
     ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//open the website
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Enter Name
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Pallavi");
		
		// Enter Email 1:cssSelector=tagname[attribute='value']
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("pallavi@gmail.com");
		
		// Enter Phone 2:cssSelector=tagname#idvalue
		driver.findElement(By.cssSelector("input#phone")).sendKeys("1234567788");
		
		// Address 3:cssSelector=tagname
		driver.findElement(By.cssSelector("textarea")).sendKeys("Ranjangoan");
		
		// Gender 4:cssSelector
		driver.findElement(By.cssSelector("input[name='gender'][id='female']")).click();
		
		//select class=used to handle dropdown
		 Select sel=new Select(driver.findElement(By.id("country")));
		 sel.selectByVisibleText("India");
		 Thread.sleep(1000);
		 sel.selectByIndex(4);
		 Thread.sleep(1000);
		 sel.selectByValue("brazil");
		 

	}

}
