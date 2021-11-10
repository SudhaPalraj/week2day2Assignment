package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Links {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Link.html");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		// Go to home page

		driver.findElement(By.linkText("Go to Home Page")).click();

		driver.navigate().back();

		Thread.sleep(2000);

		// next link

		driver.findElement(By.xpath("//a[contains(text(),'Find where am supposed')]")).click();

		driver.navigate().back();
		Thread.sleep(2000);
		// Verify Broken

		driver.findElement(By.xpath("//a[text()='Verify am I broken?']")).click();

		String title = driver.getTitle();

		System.out.println(title);

		Thread.sleep(2000);
		if (title.contains("HTTP Status 404 – Not Found")) {

			System.out.println("It is broken");

		}

		else {

			System.out.println("It is NOT broken");

		}

		driver.navigate().back();

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Go to Home Page'])[2]")).click();

		System.out.println("clicked");

		driver.navigate().back();

	}

}
