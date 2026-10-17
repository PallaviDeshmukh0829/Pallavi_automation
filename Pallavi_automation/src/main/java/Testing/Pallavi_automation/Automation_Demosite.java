package Testing.Pallavi_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Automation_Demosite {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Register.html");
		
		//First name
		driver.findElement(By.cssSelector("input[type='text'][placeholder='First Name']")).sendKeys("Pallavi");		
		
		//Last name
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Deshmukh");
		
		// Address 
		driver.findElement(By.cssSelector("textarea[ng-model='Adress']")).sendKeys("Pune");
		
		// Email 
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys("pallavi123@gmail.com");
		
		// Phone
		driver.findElement(By.cssSelector("input[type='tel']")).sendKeys("8999085638");
		
		// Gender
		driver.findElement(By.cssSelector("input[name='radiooptions'][value='Male']")).click();
		
		// Hobbies
		driver.findElement(By.cssSelector("input[id='checkbox1']")).click();	
		
		// Languages
		//driver.findElement(By.cssSelector("div[style='min-height:30px;max-width:200px']")).click();
		driver.findElement(By.id("msdd")).click();
		//driver.findElement(By.linkText("English")).click();  
		
		// Skills
		Select sel=new Select(driver.findElement(By.id("Skills")));
		sel.selectByVisibleText("Software");
		
		// Country
		//driver.findElement(By.id("countries")).click();
		//driver.findElement(By.cssSelector("span[role='presentation']"));
		
		
		// Password
		driver.findElement(By.cssSelector("input[id='firstpassword'][type='password']")).sendKeys("Pallavideshmukh123");
		
		// Confirm password
		driver.findElement(By.cssSelector("input[id='secondpassword']")).sendKeys("DeshmukhPallavi");
		
		// Submit Button
		driver.findElement(By.cssSelector("button[value='sign up']")).click();
		Thread(1000);
		
		// Refresh Button
		driver.findElement(By.cssSelector("button[value='Refresh']")).click();
		Thread(1000);
		
		// file upload
		driver.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\saideep\\Documents\\manoj sonawane.pptx");
	}

	private static void Thread(int i) {
		
		
	}

		
	}

