package Topics_practicles;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webdriver_control_commands {
	
	WebDriver driver;
	String url="https://login.yahoo.com/";
	
@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
//	//Browser Control commands
//	driver.get(url);
//	driver.getPageSource();
//	driver.getCurrentUrl();
//	driver.getTitle();
//	driver.close();
//	driver.quit();
//	//Navigation Control commands
//	driver.navigate().back();
//	driver.navigate().forward();
//	driver.navigate().to(url);
//	driver.navigate().refresh();
}
@Test
public void test() throws InterruptedException {

	//driver.findElement(By.xpath("//div[@class='col-auto']/ul/li[2]/following-sibling::div[@class='col-auto']/ul/li[3]")).click();
	WebElement wb=driver.findElement(By.name("username"));
	wb.sendKeys("admin");
	Thread.sleep(2000); 
	
	//create object to action class
	Actions act= new Actions(driver);
	//using action class control, take the mouse control
	act.doubleClick(wb).perform();
	//execute the keyboard operation
	act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
	Thread.sleep(3000);
	System.out.println("key operation is performed 1");
	act.sendKeys(Keys.TAB).perform();
	Thread.sleep(3000);
	System.out.println("key operation is performed 2");
	
	

}

@Test
public void test2() {
	
}


}


