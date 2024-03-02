package Daily_challenge;


	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class freze {
		WebDriver driver;

		@BeforeTest
		public void bt() {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
		}
		@Test
		public void at() throws InterruptedException {
	        // Create a new instance of the Chrome drive

	        // Navigate to the Flipkart website
	        

	        // Identify the dropdown element using its XPath
	        WebElement dropdown = driver.findElement(By.xpath("//span[contains(text(), 'Fashion')]"));
	        Actions actions = new Actions(driver);

	        // Perform mouse hover over the dropdown trigger
	        actions.moveToElement(dropdown).perform();

	        // Execute JavaScript with debugger statement to pause the script
	        //((JavascriptExecutor) driver).executeScript("debugger;");
	        Thread.sleep(7000);

	        // Hover over the dropdown to trigger its opening
	        // Note: This action should be done manually in the browser's Developer Tools
	        // or by continuing the script execution from this point

	        // Continue with your automation script logic after inspecting the elements
	        // ...

	        // Close the browser
	       // driver.quit();
	    }
	}


