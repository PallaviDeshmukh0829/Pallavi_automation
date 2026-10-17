package Testing.Pallavi_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathlocator {

	public static void main(String []args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/register");
		
		//1.xpath://tagname[@attribute='value']
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Pallavi");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Deshmukh");
		
		//2.xpath://parenttagname/childtagname
		//driver.findElement(By.xpath("//div/input")).sendkeys("Pallavi1234");
		
		//3.xpath://tagname[@attribute='value' and @attribute='value']
		driver.findElement(By.xpath("//input[@type='text' and @id='userName']")).sendKeys("Deshmukh1234");
		
		//4.xpath://
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys("PallaviDeshmukh");
	    
	    
		
	}

}
