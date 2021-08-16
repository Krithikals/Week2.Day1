package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Saleforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
			// Step 2: Launch the chromebrowser
		ChromeDriver driver= new ChromeDriver();
			// Step 3: Load the URL 
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
			// Step 4: Maximise the window
		driver.manage().window().maximize();
			// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			// Step 6: Fill in all the text boxes
		driver.findElement(By.name("UserFirstName")).sendKeys("Hello");
		driver.findElement(By.name("UserLastName")).sendKeys("World");
		driver.findElement(By.name("UserEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.name("CompanyName")).sendKeys("Testleaf");
		driver.findElement(By.name("UserPhone")).sendKeys("123456789");
		WebElement title = driver.findElement(By.name("UserTitle"));
		// Step 7: Handle all the dropdowns
		Select titleDrp = new Select(title);
		titleDrp.selectByValue("Customer_Service_Manager_AP");
		WebElement employee = driver.findElement(By.name("CompanyEmployees"));
		Select employeeDrp = new Select(employee);
		employeeDrp.selectByIndex(3);
		WebElement country = driver.findElement(By.name("CompanyCountry"));
		Select countryDrp = new Select(country);
		countryDrp.selectByVisibleText("Lesotho");
		
		// Step 8: Click the check box
		driver.findElement(By.xpath("//input[@id='SubscriptionAgreement']/following-sibling::div")).click();
		//driver.findElement(By.id("Lead.InfoEmail__c-0zLQ-cbxLbl")).click();
		//driver.findElement(By.xpath("//input[@id='Lead.InfoEmail__c']/following-sibling::div")).click();
		
		// Step 9: Close the browser
	    driver.close();
		
			
			
			
			

	}

}
