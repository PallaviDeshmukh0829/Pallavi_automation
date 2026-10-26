package Testing.Pallavi_automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_1 {
	
	@AfterMethod
	public void name()
	{
		System.out.println("@AfterMethod");	
	}
    
	@BeforeMethod
	public void email()
	{
		System.out.println("@BeforeMethod");
	}
	
	@AfterSuite
	public void abc()
	{
		System.out.println("@AfterSuite");
	}
	
	@BeforeSuite
	public void phone()
	{
		System.out.println("@BeforeSuite");
	}
    
	@AfterClass
	public void pqr()
	{
		System.out.println("@AfterClass");
	}
	
	@BeforeClass
	public void xyz()
	{
		System.out.println("@BeforeClass");
	}
	
	@BeforeTest
	public void vbn()
	{													
		System.out.println("@BeforeTest");
	}
	
	@AfterTest
	public void iuyt()
	{
	    System.out.println("@AfterTest");
	}
	
	@Test
	public void number()
	{	
		System.out.println("@Test");
	}
		
}
