package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://acme-test.uipath.com/login");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		//Enter username
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		//Enter Password
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		
		//Click Login
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		
		//Get title 
		
		String title = driver.getTitle();
		
		System.out.println("The Page title is " +title);
		
		//Click logout
		
		driver.findElement(By.linkText("Log Out")).click();
		
		System.out.println("Logged out");
		
		driver.close();
		
		
		
		
	}

}
