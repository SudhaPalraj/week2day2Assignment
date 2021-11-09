package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1FB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		//click create new acc
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		//enter firstname
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("firstname")).sendKeys("Sudha");
		
		//Enter Last Name
		
		driver.findElement(By.name("lastname")).sendKeys("Vembathuraja");
		
		
		
		//Enter Mobile 
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9994288645");
		
		//Enter Password
		
		driver.findElement(By.id("password_step_input")).sendKeys("Samrithayakshitha");
		
		//Select Birthday
		
		
		WebElement birthDay = driver.findElement(By.xpath("//select[@id='day']"));
		
		
		Select select =new Select(birthDay);
		
		select.selectByVisibleText("21");
		
		
		//Select Month
		
		WebElement birthMonth = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select select1=new Select(birthMonth);
		
		select1.selectByIndex(4);
		
		//Select Year
		
		
		WebElement birthYear = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select select2=new Select(birthYear);
		
		select2.selectByValue("2020");
		
		//select radio button female
		
		
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input[@name='sex']")).click();
	}

}
