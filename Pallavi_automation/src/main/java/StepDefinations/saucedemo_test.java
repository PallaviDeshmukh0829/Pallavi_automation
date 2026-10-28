package StepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class saucedemo_test {
	EdgeDriver driver;
	@Given("launch Saucedemo website")
	public void launch_saucedemo_website() {
	    driver=new EdgeDriver();
	    driver.get("https://www.saucedemo.com/");
	}

	@When("enter username as {string} also password as {string}")
	public void enter_username_as_also_password_as(String un, String ps) {
	    driver.findElement(By.id("user-name")).sendKeys(un);
	    driver.findElement(By.id("password")).sendKeys(ps);
	}

	@When("Click on login button also click on logout")
	public void click_on_login_button_also_click_on_logout() {
	    driver.findElement(By.name("login-button")).click();
	}

	@Then("user should see expected result as {string}")
	public void user_should_see_expected_result_as_success(String exp_r) {
		System.out.println("expected Result is:"+exp_r);
		driver.quit();
	}



}
