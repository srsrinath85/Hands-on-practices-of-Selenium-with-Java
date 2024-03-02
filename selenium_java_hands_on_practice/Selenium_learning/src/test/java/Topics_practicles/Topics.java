package Topics_practicles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Topics {
	
	
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
@BeforeTest
public void bt() throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(5000);
}		
@Test
public void locators() throws InterruptedException
{
	WebElement na=driver.findElement(By.cssSelector("input[name='username']"));//Name is locator in selenium we can select an element 
	na.sendKeys("Admin");
	//using name attribute But make sure there the name cannot be unique all the times. If there are multiple names, 
	//Selenium will always perform action on the first matching element.
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();//xpath is a locator in selenium we can select an element 
	//using xpath. there are two types of xpaths 1.absolute path(it is like directing the xpath to go in direct way like
	//from starting of the html tag to which element you want till that tag). disadvantage(if there is any change in the path 
	//(if some thing has been added/removed) then that xpath will break.
	//2.relative path(it is like we will tell the xpath to find an element by telling the path in between. like which
	//element you want that tag only we can select).
	Thread.sleep(6000);
	driver.findElement(By.linkText("Admin")).click();//there is only one unique link on the web page. 
	Thread.sleep(6000);
	driver.findElement(By.partialLinkText("Nation")).click();//User can provide partial link text to locate the element.
	Thread.sleep(6000);
	driver.findElement(By.className("oxd-icon-button")).click();//
	Thread.sleep(6000);
	driver.findElement(By.tagName("img")).click();
	
}
@AfterTest
public void at() {
	driver.close();

}

}
