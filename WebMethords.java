import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethords {

	public static void main(String[] args)
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Web Driver Methods 
		String Title = driver.getTitle();
		String URL = driver.getCurrentUrl();
		String PageSource = driver.getPageSource();
		
		/*
		System.out.println(Title);
		System.out.println(URL);
		System.out.println(PageSource);
		*/
		
		String Win = driver.getWindowHandle();
		//System.out.println(Win);
		
		Set<String> Wins = driver.getWindowHandles();
		System.out.println(Wins);
		
	}

}
