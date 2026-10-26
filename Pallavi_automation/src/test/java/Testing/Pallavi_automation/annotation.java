package Testing.Pallavi_automation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {
	
	@AfterTest
	public void name()
	{
		System.out.println("Pallavi");	
	}
    
	@BeforeTest
	public void email()
	{
		System.out.println("pallavi@123gmail.com");
	}
	
	@Test
	public void Surname()
	{
		System.out.println("Deshmukh");
	}
	
}
