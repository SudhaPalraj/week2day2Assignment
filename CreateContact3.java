package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		// enter username

		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click contacts link

		driver.findElement(By.linkText("Contacts")).click();

		// Click create contact

		driver.findElement(By.linkText("Create Contact")).click();

		// Enter 1st name

		driver.findElement(By.id("firstNameField")).sendKeys("sudha");

		// Enter lastname

		driver.findElement(By.id("lastNameField")).sendKeys("palraj");

		// Enter local 1st name

		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("sammu");

		// Enter last name local

		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("yakshu");

		// Enter Department Field Using any Locator of Your Choice

		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT Department");

		// Enter Description Field Using any Locator of your choice

		driver.findElement(By.id("createContactForm_description")).sendKeys("Qa testing");

		// Enter your email in the E-mail address Field using the locator of your choice

		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("testleaf@gmail.com");

		// Select State/Province as NewYork Using Visible Text

		WebElement state = driver.findElement(By.xpath("//select[@name='generalStateProvinceGeoId']"));

		Select select = new Select(state);

		select.selectByVisibleText("Florida");

		// Click on Create Contact

		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		// Click on edit button
		
		Thread.sleep(3000);

		driver.findElement(By.linkText("Edit")).click();

		// Clear the Description Field using .clear

		Thread.sleep(3000);
		
		driver.findElement(By.id("updateContactForm_description")).clear();

		// Fill ImportantNote Field with Any text

		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("QA testing");

		// Click on update button using Xpath locator

		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();

		// Get the Title of Resulting Page.

		String title = driver.getTitle();

		System.out.println("The Title of the page is " + title);
		
		
		driver.close();

	}

}
