package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.name("firstname")).sendKeys("Hello");
		// Step 8: Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("World");
		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("12233343322");
		// Step 10: Enterthe password
		driver.findElement(By.id("password_step_input")).sendKeys("helo12");
		// Step 11: Handle all the three drop downs
		WebElement day = driver.findElement(By.id("day"));
		Select dayDrop= new Select(day);
		dayDrop.selectByValue("12");
		WebElement month = driver.findElement(By.id("month"));
		Select monthDrop = new Select(month);
		monthDrop.selectByIndex(5);
		WebElement year = driver.findElement(By.id("year"));
		Select yearDrop= new Select(year);
		yearDrop.selectByVisibleText("1995");
		// Step 12: Select the radio button "Female" 
       driver.findElement(By.xpath("(//span[@data-type='radio']//input)[1]")).click();
	}

}
