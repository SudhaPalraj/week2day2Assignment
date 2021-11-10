package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Button.html");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		//Click button
		
		driver.findElement(By.id("home")).click();
		
		//click back
		
		driver.navigate().back();
		
		//get position
		
		Point location = driver.findElement(By.xpath("//button[@id='position']")).getLocation();
		
		System.out.println("The location is "+location);
		
		//get color
		
		String cssValue = driver.findElement(By.id("color")).getCssValue("background-color");
		
		System.out.println("The colour is " +cssValue);
		
		
		//get size
		
		Dimension size = driver.findElement(By.id("size")).getSize();
		
		System.out.println("the size is "+size);
		
		driver.close();
	}

}
