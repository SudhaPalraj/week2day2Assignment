package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentDeleteLead {

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
				
				//Click on Phone
				
				driver.findElement(By.xpath("//span[text()='Phone']")).click();
				
				//Enter phone number
				
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("99");
				
				//Click find leads button
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				Thread.sleep(5000);
				
				
				//Capture lead ID of First Resulting lead
				
				
				String LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
				
				System.out.println("The lead ID of First Resulting lead "+LeadID);
				
				
				
				//Click First Resulting lead
				
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
				
				//Click Delete
				
				driver.findElement(By.linkText("Delete")).click();
				
				//Click Find leads
				
				driver.findElement(By.linkText("Find Leads")).click();
				
				Thread.sleep(5000);
				
				//Enter captured lead ID
		
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
				
				//Find Leads button
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
			//Capture message
				
				Thread.sleep(3000);
				
				String message = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
				
				
				System.out.println("The message displayed is "+message);
				
				driver.close();
				
	}

}
