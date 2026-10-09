package Testing.Pallavi_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Basicdriver_method {

	public static void main(String[] args) throws InterruptedException
	{
		//Initialize ChromeDriver
		ChromeDriver driver=new ChromeDriver();
		
		//Maximize browser
		driver.manage().window().maximize();
		
		//launch sppu
		driver.get("https://www.unipune.ac.in/");
		Thread.sleep(1000);
		//navigate webapp
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		//navigate back
		driver.navigate().back();
		Thread.sleep(1000);
		//navigate forward
		driver.navigate().forward();
		Thread.sleep(1000);
		//refresh page
		driver.navigate().refresh();
		}

}
