package Testing.Pallavi_automation;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class sign_intest {
	static ChromeDriver driver;
    public static void main(String[] args) {
    	sign_intest obj=new sign_intest();
    	obj.launch();
    	obj.entercredentials();
    }
    void launch() {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://demo.automationtesting.in/SignIn.html");
    	
    }
    void entercredentials()
    {
    	driver.findElement(By.xpath("//input[@placeholder='']")).sendKeys("pallavi@123");
    	driver.findElement(By.cssSelector("input[type='password']")).sendKeys("pallavi123");
    }
}
