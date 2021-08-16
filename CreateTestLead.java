package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTestLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		// Step 4: Maximise the window //
		driver.manage().window().maximize();
		// Wait for all webelement
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Step 5: Locate the username and type "demosalesmanager"
		driver.findElement(By.id("username")).sendKeys("DemoCSR");//DemoCSR  demosalesmanager
		// Step 6: Locate the password and type "crmsfa"
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Step 7: Locate the Login button and click it
		driver.findElement(By.className("decorativeSubmit")).click();
		// Step 9: Click CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		// driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("12345");
		WebElement firstName =driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("World");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("World");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("08/13/88");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Ms");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Car");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("20000000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("600041");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("$");// createLeadForm_description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("NA");// createLeadForm_numberEmployees
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("1");// createLeadForm_currencyUomId
		WebElement currencyCode = driver.findElement(By.id("createLeadForm_currencyUomId"));// createLeadForm_ownershipEnumId
		Select currencyDrop = new Select(currencyCode);
		currencyDrop.selectByIndex(2);
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));// createLeadForm_ownershipEnumId
		Select own = new Select(ownership);
		own.selectByIndex(3);
		WebElement dataSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sourceDrop = new Select(dataSource);
		sourceDrop.selectByIndex(5);
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketDrop = new Select(marketingCampaign);
		marketDrop.selectByVisibleText("Car and Driver");
		WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industryDrop = new Select(industry);
		industryDrop.selectByValue("IND_MANUFACTURING");
		
		//Contact information
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234456789");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Hello");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("04342");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("google.com");
		
		//Primary information
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Hellotwo");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("quote");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("abchf");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("huhuhp");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");//createLeadForm_generalPostalCode
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDrop = new Select(state);
		stateDrop.selectByIndex(3);
		
		//stateDrop.selectByVisibleText("Armed Forces Europe");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600041");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("41");//createLeadForm_generalCountryGeoId
		WebElement contry = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select countryDrop = new Select(contry);
		countryDrop.selectByValue("DZA");
		
		//Get the Firstname and print it
		String firstNme = firstName.getAttribute("value");
		System.out.println("FirstName is " + firstNme);
		int sizeOfDrop3 = industryDrop.getOptions().size();
		System.out.println("Size of Industry option drop down is " + sizeOfDrop3);

		WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		countryCode.clear();
		countryCode.sendKeys("5");
		
		driver.findElement(By.name("submitButton")).click();
		String title = driver.getTitle();
		System.out.println("Title of the page is " + title);
	}

}
