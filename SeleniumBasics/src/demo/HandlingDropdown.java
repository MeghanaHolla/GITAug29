package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		WebElement monthDD = driver.findElement(By.id("month"));
		
		Select dd = new Select(monthDD);
		
		//dd.selectByVisibleText("Nov");
		//dd.selectByIndex(3);
		dd.selectByValue("10");
	}
}
