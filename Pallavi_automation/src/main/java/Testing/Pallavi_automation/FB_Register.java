package Testing.Pallavi_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FB_Register {

	public static void main(String []args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		        // open the register page
		        driver.get("https://www.facebook.com/reg/");
		
		        // Enter first Name :  cssSelector=tagname[attribute='value']
				driver.findElement(By.cssSelector("input[inputmode='text']")).sendKeys("Pallavi");
				
				// Enter Surname : cssSelector=tagname#idvalue
				driver.findElement(By.cssSelector("input#_R_1kl2p4jikacppb6amH1_")).sendKeys("Deshmukh");
				
				// Enter Date of Birth :cssSelector=tagname[attribute='value']
				//driver.findElement(By.cssSelector("div[aria-label='Select day']")).click( );
				//Thread.sleep(1000);
				//Select sel = new Select(driver.findElement(By.cssSelector("[aria-haspopup='listbox']"))); 
				//sel.selectByVisibleText("18");
				
				//Enter Mobile Number: tagname[attribute='value'][attribute='value']
				driver.findElement(By.cssSelector("input[type='text'][id='_R_6ad8p4jikacppb6amH1_']")).sendKeys("8999085638");
				
				//Enter Password
				driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Pallavi1234");
				
				// Click on submit
				driver.findElement(By.cssSelector("div[class='html-div xdj266r xat24cr xexx8yu xyri2b x18d9i69 x1c1uobl x6s0dn4 x78zum5 xl56j7k x1e0frkt xf0ucvx xx2axb6']")).click();
				
				
		
	}

}
 