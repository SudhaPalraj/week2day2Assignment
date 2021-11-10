package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditFields {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Edit.html");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		driver.findElement(By.id("email")).sendKeys("sudha@gmail.com");
		
		Thread.sleep(3000);
		//Append
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("New text added");
		
		//tab key entered
		
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys(Keys.TAB);
		
		System.out.println("Tab Key entered");
		
		//get text
		
		Thread.sleep(3000);
		
		String defaultText = driver.findElement(By.xpath("(//input[@name='username'])[1]")).getText();
		
		
		System.out.println(defaultText);
		
		//clear text
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
		//check disabled
		
		Thread.sleep(3000);
		
		System.out.println("The status is "+driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input")).isEnabled());
		
		driver.close();
		
	}

}
