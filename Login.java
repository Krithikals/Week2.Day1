package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Step 1: Download and set the path //
	
        WebDriverManager.chromedriver().setup();
		// Step 2: Launch the chromebrowser //
		ChromeDriver driver = new ChromeDriver();
		// Step 3: Load the URL //
		driver.get("http://leaftaps.com/opentaps");
		// Step 4: Maximise the window //
		driver.manage().window().maximize();
		// Wait for all webelement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 5: Locate the username and type "demosalesmanager"
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		// Step 6: Locate the password and type "crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Step 7: Locate the Login button and click it
		driver.findElement(By.className("decorativeSubmit")).click();
		// Step 9: Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
	
		
		String title = "My Home | opentaps CRM";
		String myTitle =driver.getTitle();
		if(title.equals(myTitle))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
