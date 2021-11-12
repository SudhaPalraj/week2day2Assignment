package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImagesAssigment {

	public static void main(String[] args) throws InterruptedException {
	
		
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/pages/Image.html");

		driver.manage().window().maximize();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//label[contains(text(),'Click on this ')]/following-sibling::img")).click();
		
		//Get url
		
		System.out.println(driver.getCurrentUrl());;
		
		
		//Navigate back
		
		
		driver.navigate().back();
		
		//Click Broker img 
		
		WebElement imgLink = driver.findElement(By.xpath("//label[contains(text(),'Broken')]/following-sibling::img"));
		
		
		System.out.println(imgLink.getAttribute("src"));
		
		
		//Mouse click
		
		WebElement mouseClick = driver.findElement(By.xpath("//label[contains(text(),'Keyboard or Mouse')]/following-sibling::img"));
		
		Actions action=new Actions(driver);
		
		action.click(mouseClick).build().perform();
		
		System.out.println("clicked");
		
		driver.getTitle();
		
		
		driver.navigate().back();
		
		
		
		
		
	}

}
