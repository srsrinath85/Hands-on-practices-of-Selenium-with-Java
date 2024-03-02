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

public class actions_class {
	WebDriver driver;
	String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}
@Test
public void test() throws InterruptedException {
	Thread.sleep(6000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@class='oxd-main-menu']/li[1]/a")).click();
	Thread.sleep(6000);
	driver.findElement(By.linkText("Nationalities")).click();
	Thread.sleep(6000);
	driver.findElement(By.partialLinkText("Corporate")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@class='oxd-topbar-body-nav']/ul/li/span/i")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li/a")).click();
	Thread.sleep(8000);
	Actions action = new Actions(driver); 
	WebElement element =driver.findElement(By.xpath("//*[@class='oxd-select-wrapper']"));
	Thread.sleep(6000);
	action.click(element).perform();
	action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
	Thread.sleep(6000);
	action.sendKeys(element,Keys.ARROW_DOWN).click().perform();
	driver.findElement(By.xpath("//*[@type='submit']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@class='oxd-userdropdown']")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@class='oxd-dropdown-menu']/li[4]/a")).click();
}
}
