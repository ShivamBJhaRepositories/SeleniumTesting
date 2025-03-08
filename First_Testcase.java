import org.openqa.selenium.chrome.ChromeDriver;

public class First_Testcase {

	public static void main(String[] args) {
		
		//1) launch the project
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		String title = driver.getTitle();
		
		if(title.equals("Facebook – log in or sign up"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("Test fails");
		}
		
		System.out.println(title);

	}

}
