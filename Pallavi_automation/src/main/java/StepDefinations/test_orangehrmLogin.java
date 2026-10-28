package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class test_orangehrmLogin {
 EdgeDriver driver;
	@Given("Launch Orange website")
	public void launch_orange_website() {
	    driver=new EdgeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("enter username as {string} also enter password as {string}")
	public void enter_username_as_also_enter_password_as(String uname, String pass) {
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(pass);
	}

	@When("click on login button of Orangehrm Website")
	public void click_on_login_button_of_orangehrm_website() {
	    driver.findElement(By.tagName("button")).click();
	}

	@Then("orangehrm login should be successfull")
	public void orangehrm_login_should_be_successfull() {
	    System.out.println("after login dashboard url is:"+driver.getCurrentUrl());
	    driver.quit();
	}


}
