package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyInvalidLogin {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("email")).sendKeys("ironnnman2324@hotmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("pass1111");
		
		driver.findElement(By.name("login")).click();
		
		
		String actualText = driver.findElement(By.cssSelector("#email_container > div._9ay7")).getText();
		String expectedText = "The email address you entered isn't connected to an account. Find your account and log in.";
		
		if(actualText.equals(expectedText)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test case Failed");
		}
		
		driver.close();
		
	}

}
