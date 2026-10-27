package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Opencart_RegisterandLogin {

ChromeDriver driver;
	
	@Given("practice form should open")
	public void launch()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.opencart.com/index.php?route=account/register");
	}
	
	@When("click on register button")
	public void registerbtn()                               
	{
		driver.findElement(By.linkText("Register")).click();
		System.out.println("Title before Registration :"+driver.getTitle());
	}
	
	@And("Enter Username,first name,last name,e-mail,country,password")
	public void Enter_alldetails()
	{
		driver.findElement(By.name("username")).sendKeys("Pallavi@123");
		driver.findElement(By.id("input-firstname")).sendKeys("Pallavi");
		driver.findElement(By.cssSelector("input#input-lastname")).sendKeys("Deshmukh");
		driver.findElement(By.id("input-email")).sendKeys("pallavi@gmail.com");
		driver.findElement(By.xpath("//input[@type='password'")).sendKeys("PallaviDeshmukh123");
		driver.findElement(By.xpath("//input[@text()='Register']")).click();
	}
	
	@Then("user should be register successfully")
	public void Register_successfully()
	{
		System.out.println("Title after Registration :"+driver.getTitle());
	}
	
//	@Given("login form should be open")
//	void Open_Loginpage()
//	{
//		System.out.println("Login page should be open");
//	}
//	
//	@When("click on login button")
//	void click_loginbtn()
//	{
//		System.out.println("click the login with valid credentials");
//	}
//	
//	@And("Enter E-mail & Password")
//	void Enter_moredetails()
//	{
//		System.out.println("Enter the data");
//	}
//	
//	@Then("User should be login successfully")
//	void Login_successfully()
//	{
//		System.out.println("Login successfully");
//	}
	
}
