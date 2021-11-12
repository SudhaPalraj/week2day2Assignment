package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/radio.html");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		// Are you enjoying the classes?

		driver.findElement(By.id("yes")).click();

		// Find default selected radio button

		WebElement option1 = driver.findElement(By.xpath("(//input[@name='news'])[2]"));

		System.out.println(option1.isSelected());
		;

		if (option1.isSelected()) {

			System.out.println("Value is seected");
		}

		else {

			System.out.println("Value is NOT seected");
		}

		WebElement option2 = driver.findElement(By.xpath("(//input[@name='age'])[2]"));

		System.out.println(option2.isSelected());

		if (option2.isSelected()) {

			System.out.println("My Choice is selected");
		}

		else {

			driver.findElement(By.xpath("((//input[@name='age'])[1]")).click();

		}

	}

}
