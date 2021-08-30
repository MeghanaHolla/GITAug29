package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoverOverExp {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement acctSignIn = driver.findElement(By.id("nav-link-accountList"));
		
		Actions mouseOver = new Actions(driver);
		
		mouseOver.moveToElement(acctSignIn).perform();
		
		driver.findElement(By.linkText("Account")).click();
	}

}
