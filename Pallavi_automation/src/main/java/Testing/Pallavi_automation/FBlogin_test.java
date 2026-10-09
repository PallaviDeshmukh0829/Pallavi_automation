package Testing.Pallavi_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBlogin_test {
public static void main(String []args) throws InterruptedException
{
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
	
	//findout the email textbox
	driver.findElement(By.name("email")).sendKeys("Pallavi@gmail.com");
	
	//findout the password textbox
	driver.findElement(By.name("pass")).sendKeys("12345678");
	
	//click loginbutton
	driver.findElement(By.xpath("//div[@aria-label='Log in']")).click();
}
}