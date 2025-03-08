import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Condition_Methors 
{

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		boolean status = driver.findElement(By.xpath("//input[@placeholder='Username']")).isDisplayed();
		System.out.println(status);
		
		boolean status_1 = driver.findElement(By.xpath("//input[@placeholder='Username']")).isEnabled();
		
		System.out.println(status_1);
		
		boolean status_2 = driver.findElement(By.xpath("//input[@placeholder='Username']")).isSelected();
		System.out.println(status_2);
	}
}
