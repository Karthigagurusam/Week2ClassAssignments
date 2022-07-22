package week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Zoomcar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		// Launch the Browser
		ChromeDriver driver = new ChromeDriver();
		
		// Launch URL
		driver.get(" https://www.zoomcar.com/in/bangalore");
		
		// maximize the browser
		driver.manage().window().maximize();
		
		// Click on pickup city
		driver.findElement(By.className("Placeholder")).click();
		// Click on suggested pickup location
		//driver.findElement(By.id("Pickup Loction")).click();
		// Click on Calender Date
		//driver.findElement(By.xpath("//div[@class='multiselect__select']")).click();
		//driver.findElement(By.xpath("//span[text()='India']")).click();

		// Click on Date

		// Click Continue

		// Click Find Cars

		// Find the price of Maruthi swift dzire
	}

}
