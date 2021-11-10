package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		
		// enter username

				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

				driver.findElement(By.id("password")).sendKeys("crmsfa");

				driver.findElement(By.className("decorativeSubmit")).click();

				driver.findElement(By.linkText("CRM/SFA")).click();
		
				
				//Click Leads
				
				driver.findElement(By.linkText("Leads")).click();
				
				//Click Find leads
				
				driver.findElement(By.linkText("Find Leads")).click();
		
		
		//Click on Email
		
				driver.findElement(By.xpath("//span[text()='Email']")).click();
				
				//enter email 
				
				driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("babu@testleaf.com");
		
				Thread.sleep(3000);
				
				// Click find leads button

				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
				//Capture name of First Resulting lead
				
				String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
		
				System.out.println("The name of the leadid is "+name);
		
		//Click First Resulting lead
				
				Thread.sleep(3000);
		
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
				Thread.sleep(5000);
		
		//Click duplicate lead
				
				driver.findElement(By.linkText("Duplicate Lead")).click();
				
				//Verify the title as 'Duplicate Lead'
				
				String title = driver.getTitle();
				
				System.out.println("The title is " +title);
		
		
				//Click Create Lead
				
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
				
				//Confirm the duplicated lead name is same as captured name
		
		String capturedName = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']")).getText();
		
		System.out.println("The Captured name is " +capturedName);
		
		if (name.equals(capturedName)) {
			
			
			System.out.println("Names are matching");
			
		}
		
		else {
			
			
			System.out.println("Names are NOT matching");
			
		}
		
		
		
	}

}
