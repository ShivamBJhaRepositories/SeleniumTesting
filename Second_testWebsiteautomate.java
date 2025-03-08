import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.chrome.ChromeDriver;

public class Second_testWebsiteautomate 
{
	public static void main(String[] args) throws InterruptedException 
	{
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(2000);
	  
	  //Target Username
	  WebElement Uname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
	  //Target Password
	  WebElement Upassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
	  //Target Login button
	  WebElement Login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
	  
	  Uname.sendKeys("Admin");
	  Upassword.sendKeys("admin123");
	  Login.click();
	  
	  //Target Search
	  //WebElement Search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
	  //Search.sendKeys("My Info");
	  //Search.click();
	  

	  
	  
		
	}
}
