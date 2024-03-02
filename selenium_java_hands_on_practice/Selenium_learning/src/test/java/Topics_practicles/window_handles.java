package Topics_practicles;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window_handles {
	WebDriver driver;
	String url="https://demo.automationtesting.in/Windows.html";
@BeforeTest
public void bt() {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
	driver.get(url);
	driver.manage().window().maximize();
}

@Test
public void test() throws InterruptedException {
	WebElement ele=driver.findElement(By.cssSelector("a[target='_blank']"));
	ele.click();
	ArrayList<String> al=new ArrayList<String>(driver.getWindowHandles());
	int s=al.size();
	System.out.println(s);
	driver.switchTo().window(al.get(1));
	Thread.sleep(6000);
	WebElement ela=driver.findElement(By.cssSelector("h1[class='d-1 fw-bold']"));
	System.out.println(ela.getText());
	driver.switchTo().window(al.get(0));
	//driver.close();
	Thread.sleep(6000);
	WebElement la=driver.findElement(By.xpath("//*[@class='container']/div/div[2]/h1"));
	System.out.println(la.getText());
	driver.quit();
	
	
}

}
