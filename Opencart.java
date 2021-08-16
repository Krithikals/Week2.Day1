package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Opencart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("input-username")).sendKeys("Hello");
		driver.findElement(By.id("input-firstname")).sendKeys("Test");
		driver.findElement(By.id("input-lastname")).sendKeys("find");
		driver.findElement(By.id("input-email")).sendKeys("abc@gmail.com");
		WebElement country = driver.findElement(By.id("input-country"));
		Select countryDrp = new Select(country);
		countryDrp.selectByValue("4");
		driver.findElement(By.id("input-password")).sendKeys("123456");
        //Can't able to handle Captcha in Selenium//
	}

}
