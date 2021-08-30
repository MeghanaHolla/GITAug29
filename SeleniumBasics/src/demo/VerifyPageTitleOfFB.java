package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyPageTitleOfFB {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
		
		driver.close();
	}

}
