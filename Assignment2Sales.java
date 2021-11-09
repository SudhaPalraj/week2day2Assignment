package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2Sales {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Enter Firstname
		
		driver.findElement(By.name("UserFirstName")).sendKeys("Samritha");
		
		//Enter LastName
		
		driver.findElement(By.name("UserLastName")).sendKeys("Yakshitha");
		
		
		//Enter email
		
		driver.findElement(By.name("UserEmail")).sendKeys("mymail@gmail.com");
		
		
		//Enter company
		
		driver.findElement(By.name("CompanyName")).sendKeys("testcompany");	
		
		//Enter Phone
		
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("0235235344");
		
		//select job title
		
		WebElement jobTitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		
		Select select=new Select(jobTitle);
		
		select.selectByVisibleText("IT Manager");
		
		
		//Select Employees
		
		WebElement employees = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		
		Select select1=new Select(employees);
		
		select1.selectByValue("250");
		
		
		//select Country
		
		WebElement country = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		
		Select select2=new Select(country);
		
		select2.selectByVisibleText("Australia");	
		
		
		//select checkbox
		
		driver.findElement(By.xpath("//div[@class='checkbox-ui'][1]")).click();
		
		//close the browser
		
		driver.close();
		
	}

}
