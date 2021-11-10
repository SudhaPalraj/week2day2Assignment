package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
				//enter firstname
		
				driver.findElement(By.xpath("(//div[@class='x-form-item x-tab-item'])[2]/div/input")).sendKeys("sudha");
		
				//Click Find leads button
		
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Click on first resulting lead
				
				String name = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).getText();
				
				System.out.println("The name of the leadid is "+name);
		
		//Click First Resulting lead
				
				Thread.sleep(3000);
		
				driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a")).click();
		
				Thread.sleep(5000);
				
				//Verify title of the page
				
				String title = driver.getTitle();
		
		System.out.println("The titele of page is "+title);
		
		//Edit 
		
		driver.findElement(By.linkText("Edit")).click();
		
		//Change the company name
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("New Company12345");
		
		//Click Update
		
		
		
		driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
		
		//Confirm the changed name appears
		
		
		
		String updatedCompany = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		System.out.println("the updated company is " +updatedCompany);
		

		
		String companyname="New Company12345";
		
		Thread.sleep(5000);
		
		if (companyname.equalsIgnoreCase(updatedCompany)) {
		
			
			System.out.println("Company name is updated");
		}
		
		
		else {
			
			
			
			System.out.println("Company name is NOT updated");
		}
		
		
	}

}
