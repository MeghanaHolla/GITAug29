package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("HELP")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.linkText("Actions")).click();
		
	}
}
