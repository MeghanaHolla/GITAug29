package demo;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class ExplicitWaitExp {

	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		//driver.get("https://the-internet.herokuapp.com/");
		driver.navigate().to("https://the-internet.herokuapp.com/");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Dynamic Loading")).click();
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
		driver.findElement(By.partialLinkText("Example 1")).click();
		
		driver.findElement(By.cssSelector("#start > button")).click();
		
		//WebDriverWait wait = new WebDriverWait(driver,20);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).
								withTimeout(Duration.ofSeconds(20)).
								pollingEvery(Duration.ofSeconds(3)).
								ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#finish > h4")));
		
		
		
		String actualText = driver.findElement(By.cssSelector("#finish > h4")).getText();
		
		String expectedText = "Hello World!";
		
		if(actualText.equals(expectedText)) {
			System.out.println("Test Case Passed");
		}
		else {
			System.out.println("Test Case Failed");
		}
	}
}
